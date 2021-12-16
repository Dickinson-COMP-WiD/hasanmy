package WiDPackage;
public class Daily extends Appointment{
	
	private int day;
	/**
	 * Construct a new Daily appointment with the specified day and title.
	 * 
	 * @param title		the title of the appointment.
	 * @param day		the day of the appointment.
	 */
	public Daily(String title, int day) {

		super(title);
		this.day = day;

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
			if (this.day != day) {
				return false; 
			}
			return true;

		}

		 
		/**
		 * 
		 * 	@return a string that identifies a type of this appointment  
		 */
		public String toString() {
			return "[Daily] " + super.getTitle();

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
		
		
}