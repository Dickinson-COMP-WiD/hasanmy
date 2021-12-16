package WiDPackage;

public class Appointment{

	
	private String title;
	
	/**
	 * Construct a new Appointment with the specified day, year and month.
	 * 
	 * @param initTitle		the title of the appointment.
	
	 */
	public Appointment(String initTitle) {
		title = initTitle;
		
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
	 * checks whether the appointment occurs on a specific date
	 * and this method will be overridden from its sub-classes
	 * 
	 * @param day
	 * @param month
	 * @param year
	 * 
	 * @return true
	 */
	public boolean occursOn(int day, int month, int year) {
		return true;
		
	}
		
	/**
	 * 
	 * 	@return a string that identifies a type of this appointment  
	 */
	@Override  
	public String toString() {

			return title;

	}


	

}