package lesson10.labs.prob5.soln1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lesson10.labs.prob5.Employee;

public class Main {
	static Stream<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
	          new Employee("John", "Sims", 110000),
	          new Employee("Joe", "Stevens", 200000),
            new Employee("Andrew", "Reardon", 80000),
            new Employee("Joe", "Cummings", 760000),
            new Employee("Steven", "Walters", 135000),
            new Employee("Thomas", "Blake", 111000),
            new Employee("Alice", "Richards", 101000),
            new Employee("Donald", "Trump", 100000)).stream();
	
	public static String asString(Stream<Employee> employee) {
				return employee
			    .filter(e -> (e.getSalary() > 100000))
			    .filter(e -> (e.getLastName().charAt(0) > 'M'))
			    .map(e -> fullName(e))
			    .sorted()
			    .collect(Collectors.joining(", "));
	}
	
	public static void printEmps(Stream<Employee> employee) {
				System.out.println(asString(employee));
	}
	 
	 public static void main(String[] args) {
			printEmps(emps);
		}
	
	private static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

}
