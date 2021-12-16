package WiDPackage;

public class Monthly extends Daily{
	
	
	private int month;
	
	/**
	 * Construct a new Monthly appointment with the specified day, month and title.
	 * 
	 * @param title		the title of the appointment.
	 * @param day		the day of the appointment.
	 * @param month		the month of the appointment.
	 */
	public Monthly(String title, int day, int month) {

		super(title, day);
		this.month = month;

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
		if (getDay() != day) { //since this is monthly appointment , we only need to check if the day matches
			return false;
		}
		if (getMonth() != month) {
			return false;
		}
		return true;


	}

	/**
	 * 
	 * 	@return a string that identifies a type of this appointment  
	 */

	public String toString() {
		return "[Monthly] "+ super.getTitle();
	}


	/**
	 * Return the month of this Appointment.
	 * 
	 * @return the month.
	 */
	public int getMonth() {

		return month;

	}

	
	/**
	 * Set the month of this Appointment.
	 */
	public void setMonth(int month) {

		this.month = month;

	}
	
	
	
}
