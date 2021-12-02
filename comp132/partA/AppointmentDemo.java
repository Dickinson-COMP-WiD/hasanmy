package WiDPackage;

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

		for(Appointment appointment : appointments) { //
			//System.out.println(appointment.toString());
			if(appointment.occursOn(day, month, year)) {

				System.out.println(appointment.toString());
			}

		}
	}
	
	
	public static void main(String [] args) {
		
		AppointmentDemo demo = new AppointmentDemo();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter a date : " );
		
		String userDate = sc.nextLine(); //ex ) 20202 03 13
		
		String [] date = userDate.split(" "); // date[0]= 2020, date[1]=03, date[2]=13 
		
		System.out.println("You have the following appointments on " + userDate);
		
		Appointment appointment1 = new Daily("Blood Pressure Check", 13,03,2020); // Daily --> occursOn 
		Appointment appointment2 = new Monthly("Visit to grandma", 13,04,2020);
		Appointment appointment3 = new Monthly("Dentist", 17, 05,2020);
		Appointment appointment4 = new OneTime("Code writing", 18,06, 2020);
		
		demo.addAppointment(appointment1); // 
		demo.addAppointment(appointment2); // 
		demo.addAppointment(appointment3); //
		demo.addAppointment(appointment4); //
		
	
		demo.show(Integer.parseInt(date[2].trim()), Integer.parseInt(date[1].trim()), Integer.parseInt(date[0].trim()));
		
		sc.close();
		
		
		
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