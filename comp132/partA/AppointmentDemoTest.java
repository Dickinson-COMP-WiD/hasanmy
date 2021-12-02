package WiDPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AppointmentDemoTest {

	@Test
	void Constructortest() {
		AppointmentDemo demo = new AppointmentDemo();

		assertEquals(0, demo.size());
	}

	@Test
	void addAppointmentTest() {
		AppointmentDemo book = new AppointmentDemo();

		book.addAppointment(new Appointment("Blood Pressure Check", 13, 03, 2020));
		book.addAppointment(new Appointment("Visit to grandma", 13, 03, 2020));
		book.addAppointment(new Appointment("Dentist", 13, 03, 2020));
		book.addAppointment(new Appointment("Code writing", 13, 03, 2020));

		assertEquals(4, book.size());

	}

	@Test
	void showAllTestInvalid() {
		AppointmentDemo book = new AppointmentDemo();

		
		
		book.showAll(); //not going to print out anything
	}
		
	
	@Test
	void showAllTestValid() {
		AppointmentDemo book = new AppointmentDemo();

		book.addAppointment(new Appointment("Blood Pressure Check", 13, 03, 2020));
		book.addAppointment(new Appointment("Visit to grandma", 13, 03, 2020));
		book.addAppointment(new Appointment("Dentist", 13, 03, 2020));
		book.addAppointment(new Appointment("Code writing", 13, 03, 2020));
		
		book.showAll();
		
	}
	@Test
	void showTrueTest() {
		AppointmentDemo book = new AppointmentDemo();

		book.addAppointment(new Appointment("Blood Pressure Check", 13, 03, 2020));
		book.addAppointment(new Appointment("Visit to grandma", 13, 03, 2020));
		book.addAppointment(new Appointment("Dentist", 13, 03, 2020));
		book.addAppointment(new Appointment("Code writing", 13, 03, 2020));
		
		book.show(13, 03, 2021);
		
	}
	
	@Test
	void showFalseTest() {
		AppointmentDemo book = new AppointmentDemo();

		book.addAppointment(new Appointment("Blood Pressure Check", 14, 04, 2021));
		book.addAppointment(new Appointment("Visit to grandma", 14, 04, 2021));
		book.addAppointment(new Appointment("Dentist", 14, 04, 2021));
		book.addAppointment(new Appointment("Code writing", 14, 04, 2021));
		
		book.show(13, 03, 2021);
	}
	
	
	
	
	@Test
	void getAppointmentTest() {
		AppointmentDemo book = new AppointmentDemo();
	
		book.addAppointment(new Appointment("Blood Pressure Check", 14, 04, 2021));
		book.addAppointment(new Appointment("Visit to grandma", 14, 04, 2021));
		book.addAppointment(new Appointment("Dentist", 14, 04, 2021));
		book.addAppointment(new Appointment("Code writing", 14, 04, 2021));
	
		assertEquals("Blood Pressure Check", book.getAppointment(0).getTitle());
		assertEquals(14, book.getAppointment(0).getDay());
		assertEquals(04, book.getAppointment(0).getMonth());
		assertEquals(2021, book.getAppointment(0).getYear());
	}
}
