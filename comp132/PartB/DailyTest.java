package WiDPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DailyTest {

	@Test
	void constructorTest() {
		Daily appointment1 = new Daily("Doctors Appointment", 18);
		assertEquals("Doctors Appointment", appointment1.getTitle());
		assertEquals(18, appointment1.getDay());

	}
	
	@Test 
	void occursOnTest() {
		Daily appointment5 = new Daily("Doctors Appointment", 18);
		assertEquals(true, appointment5.occursOn(18,1,2001));
		assertEquals(false, appointment5.occursOn(24,1,2001));
		assertEquals(false, appointment5.occursOn(123,1,2001));
	}
}

