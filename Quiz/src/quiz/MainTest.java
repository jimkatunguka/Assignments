package quiz;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		Role r1 = new Passenger();
		Role r2 = new Passenger();
		Role r3 = new Passenger();
		
		
		
		p1.setAge(18);
		p2.setAge(25);
		p3.setAge(30);
		
		p1.getRoles();
		
		List<Person> list = Arrays.asList(p1,p2,p3);
		
//		double expected= 
//		double actual = Main.calcTotalFare(list,18,25,).
//		assertEquals(expected, actual)
	}

}
