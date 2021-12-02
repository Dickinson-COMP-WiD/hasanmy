package WiDPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DailyTest {

	@Test
	void test() {
		Daily appointment1 = new Daily("Doctors Appointment", 18, 1, 2001);
		assertEquals("Doctors Appointment", appointment1.getTitle());
		assertEquals(18, appointment1.getDay());
		assertEquals(1, appointment1.getMonth());
		assertEquals(2001, appointment1.getYear());
		
	}
	@Test 
	void occursOnTest() {
		Daily appointment5 = new Daily("Doctors Appointment", 18, 1, 2001);
		assertEquals(true, appointment5.occursOn(18,1,2001));
		}
}