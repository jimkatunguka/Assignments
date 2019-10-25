package lesson10.labs.prob5.soln1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import lesson10.labs.prob5.Employee;

class MainTest {
	Employee e1 = new Employee("Joe", "Davis", 120000);
	Employee e2 = new Employee("John", "Sims", 110000);
	Employee e3 = new Employee("Joe", "Stevens", 200000);
	Employee e4 = new Employee("Andrew", "Reardon", 80000);
	Employee e5 = new Employee("Joe", "Cummings", 760000);
	Employee e6 = new Employee("Steven", "Walters", 135000);
	Employee e7 = new Employee("Thomas", "Blake", 111000);
	Employee e8 = new Employee("Alice", "Richards", 101000);
	Employee e9 = new Employee("Donald", "Trump", 100000);
	
	Stream<Employee> emps = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9).stream();
	
	@Test
	void asStringtest() {
		String expected = "Alice Richards, Joe Stevens, John Sims, Steven Walters";
		String actual = Main.asString(emps);
		
		assertEquals(expected, actual);
	}

}
