package WiDPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OneTimeTest {

	@Test
	void constructorTest() {
		OneTime appointment1 = new OneTime("Doctors Appointment", 18, 1, 2001);
		assertEquals("Doctors Appointment", appointment1.getTitle());
		assertEquals(18, appointment1.getDay());
		assertEquals(1, appointment1.getMonth());
		assertEquals(2001, appointment1.getYear());

	}
	
	@Test 
	void occursOnTest() {
		OneTime appointment5 = new OneTime("Doctors Appointment", 18, 1, 2001);
		assertEquals(true, appointment5.occursOn(18,1,2001));
		assertEquals(false, appointment5.occursOn(24,1,2001));
		assertEquals(false, appointment5.occursOn(18,2,2001));
		assertEquals(false, appointment5.occursOn(18,1,2002));
		assertEquals(false, appointment5.occursOn(123,1,2001));
		assertEquals(false, appointment5.occursOn(18,123,2002));
		assertEquals(false, appointment5.occursOn(18,123,20202));
	}

}

