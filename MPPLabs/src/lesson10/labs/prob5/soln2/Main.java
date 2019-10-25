package lesson10.labs.prob5.soln2;

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
			    .filter(e -> salaryGreaterThan100000(e))
			    .filter(e -> lastNameAfterM(e))
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
	 
	 public static boolean salaryGreaterThan100000(Employee e) {
		 return e.getSalary() > 100000;
	 }
	 
	 public static boolean lastNameAfterM(Employee e) {
		 return e.getLastName().charAt(0)>'M';
	 }
	
	public static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

}
