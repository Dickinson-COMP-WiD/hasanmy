package WiDPackage;

public class OneTime extends Appointment {

	
	/**
	 * Construct a new OneTime appointment with the specified day, year, month and title.
	 * 
	 * @param title		the title of the appointment.
	 * @param day		the day of the appointment.
	 * @param month		the month of the appointment.
	 * @param year		the year of the appointment.
	 */
	
	public OneTime(String title, int day, int month, int year) {

		super(title, day, month, year);

	}
	
	/**
	 * a method that checks the condition if the given day, month, and year can 
	 * occur.
	 * @param day the day of the appointment
	 * @param month the month of the appointment
	 * @param year the year of the appointment
	 * 
	 * @return true if the given day is the same day with getDay(), given month is the same month with getMonth(), given year is the same year with getYear()
	 * @return false otherwise
	 */
	@Override
	public boolean occursOn(int day, int month, int year) {
		
		System.out.println("OneTime got in");
		if(getDay() == day && getMonth() == month && getYear() == year) {

			return true;

		} else {

			return false;

		}
	}
	
	
	/**
	 * 
	 * 	@return a string that identifies a type of this appointment  
	 */
	public String toString() {
		return "[OneTime] " + super.toString();
	}
}