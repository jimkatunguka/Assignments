package march2017;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		//implement
		return list.stream()
		.filter(l-> l.getGpa()>3.0 && l.getMajor().equals("Computer Science"))
		.collect(Collectors.toList());
	}
}
