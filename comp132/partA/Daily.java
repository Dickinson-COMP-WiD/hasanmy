package WiDPackage;

public class Daily extends Appointment{
	
	/**
	 * Construct a new Monthly appointment with the specified day, year, month and title.
	 * 
	 * @param title		the title of the appointment.
	 * @param day		the day of the appointment.
	 * @param month		the month of the appointment.
	 * @param year		the year of the appointment.
	 */
	public Daily(String title, int day, int month, int year) {

		super(title, day, month, year);

		}

		/**
		 * a method that checks the condition if the given day, month, and year can 
		 * occur.
		 * @param day the day of the appointment
		 * @param month the month of the appointment
		 * @param year the year of the appointment
		 * 
		 * @return true 
		 */	
		@Override
		public boolean occursOn(int day, int month, int year) {
			
			return true; 
		}

		 
		/**
		 * 
		 * 	@return a string that identifies a type of this appointment  
		 */
		public String toString() {
			return "[Daily] " + super.getTitle();

		}
}