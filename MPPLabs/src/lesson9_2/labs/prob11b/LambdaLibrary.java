package lesson9_2.labs.prob11b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	
	public static final QuadFunction<List<Employee>, Integer, Character, Character, String> SalaryChecker = (emp, salary, letter1, letter2) ->
	emp.stream()
	  .filter(e->e.getSalary() > salary)
	  .filter(e->e.getLastName().charAt(0) > letter1 &&
		  		 e.getLastName().charAt(0) < letter2)
	  .map(e -> e.getFirstName() + " " + e.getLastName()).sorted()
	  .collect(Collectors.joining(","));
	 
}
