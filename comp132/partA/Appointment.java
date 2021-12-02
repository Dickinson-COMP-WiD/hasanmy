package WiDPackage;

public class Appointment{

	private int day; 
	private int month;
	private int year;
	private String title;
	
	/**
	 * Construct a new Appointment with the specified day, year and month.
	 * 
	 * @param initTitle		the title of the appointment.
	 * @param initDay		the day of the appointment.
	 * @param initMonth		the month of the appointment.
	 * @param initYear		the year of the appointment.
	 */
	public Appointment(String initTitle, int initDay, int initMonth, int initYear) {
		title = initTitle;
		day = initDay;
		month = initMonth;
		year = initYear;
	}
	
	
	/**
	 * Return the title of this Appointment.
	 * 
	 * @return the title.
	 */
	public String getTitle() {

		return title;

	}
	
	
	/**
	 * Set the title of this Appointment.
	 */

	public void setTitle(String initTitle) {

		title = initTitle;

	}
	
	
	/**
	 * Return the day of this Appointment.
	 * 
	 * @return the day.
	 */
	public int getDay() {

		return day;

		}

	
	/**
	 * Set the day of this Appointment.
	 */
	public void setDay(int day) {

		this.day = day;

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
	
	/**
	 * Return the year of this Appointment.
	 * 
	 * @return the year.
	 */
	public int getYear() {

		return year;

	}
	
	/**
	 * Set the year of this Appointment.
	 */
	public void setYear(int year) {

		this.year = year;

	}
	
	/**
	 * checks whether the appointment occurs on a specific date
	 * and this method will be overridden from its sub-classes
	 * 
	 * @param day
	 * @param month
	 * @param year
	 * 
	 * @return true
	 */
	protected boolean occursOn(int day, int month, int year) {
		return true;
		
	}
		
	/**
	 * 
	 * 	@return a string that identifies a type of this appointment  
	 */
	@Override  
	public String toString() {

			return title + " on "+ day + "/" + month + "/" + year ;

	}


	

}