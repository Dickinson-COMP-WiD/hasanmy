package WiDPackage;

public class Monthly extends Appointment{
	
	/**
	 * Construct a new Monthly appointment with the specified day, year, month and title.
	 * 
	 * @param title		the title of the appointment.
	 * @param day		the day of the appointment.
	 * @param month		the month of the appointment.
	 * @param year		the year of the appointment.
	 */
	public Monthly(String title, int day, int month, int year) {

		super(title, day, month, year);

		}

	
	/**
	 * a method that checks the condition if the given day, month, and year can 
	 * occur.
	 * @param day the day of the appointment
	 * @param month the month of the appointment
	 * @param year the year of the appointment
	 * 
	 * @return true if the given day is the same day with getDay()
	 * @return false otherwise
	 */
	@Override
	public boolean occursOn(int day, int month, int year) {

		if(getDay() == day) { //since this is monthly appointment , we only need to check if the day matches
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
		return "[Monthly] "+ super.getTitle() + " on day " + getDay() + " of the month" ;
	}

}
