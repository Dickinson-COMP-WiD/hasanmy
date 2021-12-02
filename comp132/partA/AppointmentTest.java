package WiDPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppointmentTest {

	@Test
	void constructorTest() {
		Appointment appointment1 = new Appointment("Doctors Appointment", 18, 1, 2001);
		assertEquals("Doctors Appointment", appointment1.getTitle());
		assertEquals(18, appointment1.getDay());
		assertEquals(1, appointment1.getMonth());
		assertEquals(2001, appointment1.getYear());

	}
	
	@Test 
	void setTitleTest() {
		Appointment appointment2 = new Appointment("Doctors Appointment", 18, 1, 2001);
		appointment2.setTitle("Dentist Appointment");
		assertEquals("Dentist Appointment", appointment2.getTitle());		
	}
	
	@Test 
	void setDayTest() {
		Appointment appointment3 = new Appointment("Doctors Appointment", 18, 1, 2001);
		appointment3.setDay(20);
		assertEquals(20, appointment3.getDay());		
	}

	
	@Test 
	void setMonthTest() {
		Appointment appointment3 = new Appointment("Doctors Appointment", 18, 1, 2001);
		appointment3.setMonth(3);
		assertEquals(3, appointment3.getMonth());		
	}
	
	@Test 
	void setYearTest() {
		Appointment appointment4 = new Appointment("Doctors Appointment", 18, 1, 2001);
		appointment4.setYear(2002);
		assertEquals(2002, appointment4.getYear());		
	}
	
	@Test 
	void occursOnTest() {
		Appointment appointment5 = new Daily("Doctors Appointment", 18, 1, 2001);
		Appointment appointment2 = new Monthly("Doctors Appointment", 19, 1, 2001);
		Appointment appointment1 = new OneTime("Doctors Appointment", 20, 1, 2001);
		assertEquals(true, appointment5.occursOn(18,1,2001));
		assertEquals(true, appointment1.occursOn(20,1,2001));
		assertEquals(false, appointment2.occursOn(20,1,2001));
		
	}
	
	
}
