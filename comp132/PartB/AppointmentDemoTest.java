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

			book.addAppointment(new Daily("Blood Pressure Check", 13));
			book.addAppointment(new Monthly("Visit to grandma", 13, 04));
			book.addAppointment(new Monthly("Dentist", 17, 05));
			book.addAppointment(new OneTime("Code writing", 18,06, 2020));

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

			book.addAppointment(new Daily("Blood Pressure Check", 13));
			book.addAppointment(new Monthly("Visit to grandma", 13, 04));
			book.addAppointment(new Monthly("Dentist", 17, 05));
			book.addAppointment(new OneTime("Code writing", 18,06, 2020));
			
			book.showAll();
			
		}
		
		@Test
		void showTrueTest() {
			AppointmentDemo book = new AppointmentDemo();

			book.addAppointment(new Daily("Blood Pressure Check", 13));
			book.addAppointment(new Monthly("Visit to grandma", 13, 04));
			book.addAppointment(new Monthly("Dentist", 17, 05));
			book.addAppointment(new OneTime("Code writing", 18,06, 2020));
			
			book.show(13, 03, 2021);
			
		}
		
		@Test
		void showFalseTest() {
			AppointmentDemo book = new AppointmentDemo();

			book.addAppointment(new Daily("Blood Pressure Check", 13));
			book.addAppointment(new Monthly("Visit to grandma", 13, 04));
			book.addAppointment(new Monthly("Dentist", 17, 05));
			book.addAppointment(new OneTime("Code writing", 18,06, 2020));
			
			book.show(13, 03, 2021);
		}
		
		@Test
		void demoYearTrueTest() throws Exception{
			AppointmentDemo book = new AppointmentDemo();
			
			Appointment appointment1 = new Daily("Blood Pressure Check", 13); // Daily --> occursOn 
			Appointment appointment2 = new Monthly("Visit to grandma", 13, 04);
			Appointment appointment3 = new Monthly("Dentist", 17, 05);
			Appointment appointment4 = new OneTime("Code writing", 18,06, 2020);

			book.addAppointment(appointment1);  
			book.addAppointment(appointment2);  
			book.addAppointment(appointment3); 
			book.addAppointment(appointment4);  
			
			try {
				book.show(13,03,2021);
				fail("demoYearTrueTest didn't crash");
			}catch (Exception e) {
				fail("demoYearTrueTest did crash");
			}
		
		}
	}