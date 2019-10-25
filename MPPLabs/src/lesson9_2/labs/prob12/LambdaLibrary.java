package lesson9_2.labs.prob12;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	
	public static final TriFunction<List<Employee>, Integer, Character, Long> employeeCount = (emp, salary, letter) ->
	emp.stream()
	  .filter(e->e.getSalary() > salary)
	  .filter(e->e.getLastName().charAt(0) > letter)
	  .count(); 
	
	public static final TriFunction<List<Employee>, Integer, Character, List<String>> employeeLister = (emp, salary, letter) ->
	emp.stream()
	  .filter(e->e.getSalary() > salary)
	  .filter(e->e.getFirstName().charAt(0) < letter)
	  .map(e->e.getFirstName() + " " + e.getLastName())
	  .map(s->s.toUpperCase())
	  .sorted().collect(Collectors.toList());
	 
}
