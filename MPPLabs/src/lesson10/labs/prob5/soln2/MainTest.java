package lesson10.labs.prob5.soln2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lesson10.labs.prob5.Employee;

class MainTest {
	Employee e1 = new Employee("Joe", "Davis", 120000);
	Employee e2 = new Employee("John", "Sims", 80000);
	
	@Test
	void salaryGreaterThan100000test() {
		boolean expected = true;
		boolean actual = Main.salaryGreaterThan100000(e1);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void lastNameAfterMtest() {
		boolean expected = false;
		boolean actual = Main.lastNameAfterM(e1);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void fullNametest() {
		String expected = "Joe Davis";
		String actual = Main.fullName(e1);
		
		assertEquals(expected, actual);
	}
	
	//This approach provides a good test for the asString since
	//we are able to test the different parts of the method and
	//hence more effective.

}
