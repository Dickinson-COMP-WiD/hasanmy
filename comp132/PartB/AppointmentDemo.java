package WiDPackage;

import java.time.DateTimeException;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentDemo {
	
	ArrayList<Appointment> appointments;

	/**
	 * create a list of appointments
	 */
	public AppointmentDemo() {

		appointments = new ArrayList<Appointment>();

	}
	
	/**
	 * adds an appointment to AppointmentDemo
	 * 
	 * @param Appointment a
	 *
	 */
	public void addAppointment(Appointment a) {

		appointments.add(a);

	}
		 

	/**
	 * show all the appointments in the list
	 * 
	 */
	public void showAll() {

		for(Appointment a : appointments) {
			System.out.println(a.toString());
		}
		 
	}

	/**
	 * Checking if the particular type of appointment is true
	 * 
	 * @param day		the day of the appointment.
	 * @param month		the month of the appointment.
	 * @param year		the year of the appointment.
	 */
	public void show(int day, int month, int year) {

		for(Appointment appointment : appointments) { 
			if(appointment.occursOn(day, month, year)) {

				System.out.println(appointment.toString());
			}

		}
	}
	
	/** asks user for input, splits it into year, month and day 
	 * and then checks if date entered is valid. If valid, prints appointments for the day. 
	 * If not valid, asks for input again
	 */
	public void Demo() {
		AppointmentDemo Demo = new AppointmentDemo();

		Scanner sc = new Scanner(System.in);
		
			
			
			System.out.print("Enter a date : " );

			String userDate = sc.nextLine(); //ex 2020 03 13
			// try/catch to check if 2020 03 13 is entered correctly
			
			String date = userDate;
			String[] str = date.split(" ");
			String sMonth = str[1];
			
			String sDay = str[2];
			
			String sYear = str[0];
			
		
			try {
			    // These can throw exceptions and you want to catch those too.
			    int month = Integer.parseInt(sMonth);
			    int day = Integer.parseInt(sDay);
			    int year = Integer.parseInt(sYear);

			    if (sYear.length() != 4) {
			    	throw new Exception("year");
			    } 
			    else if (month <= 12 || sMonth.length()==2) {
			    	throw new Exception("month");
			    }
			    else if (day <= 31 || sDay.length() == 2) {
			    	throw new Exception("day");
			    }    
			   
			    
			} catch (Exception e) {
			    System.out.println("that's not a valid date");
			   userDate = sc.nextLine();
			}
			
			Demo.show(Integer.parseInt(sDay.trim()), Integer.parseInt(sMonth.trim()), Integer.parseInt(sYear.trim()));


			
			System.out.println("You have the following appointments on " + userDate);

			Appointment appointment1 = new Daily("Blood Pressure Check", 13); // Daily --> occursOn 
			Appointment appointment2 = new Monthly("Visit to grandma", 13, 04);
			Appointment appointment3 = new Monthly("Dentist", 17, 05);
			Appointment appointment4 = new OneTime("Code writing", 18,06, 2020);

			Demo.addAppointment(appointment1); // 
			Demo.addAppointment(appointment2); // 
			Demo.addAppointment(appointment3); //
			Demo.addAppointment(appointment4); // 
			

		

	}
	

	public static void main(String [] args) {
		AppointmentDemo demo = new AppointmentDemo();
		
		demo.Demo();
		
	}

	
	
	/**
	 * gets the size ArrayList
	 *
	 * @return size of the ArrayList
	 */
	public int size() {
		return appointments.size();
	}
	
	/**
	 * gets the appointment, at that given index, in the ArrayList
	 *
	 * @param index of the appointments
	 * 
	 * @return the appointment at that given index
	 */
	public Appointment getAppointment(int index) {
		return appointments.get(index);
	}
	
}