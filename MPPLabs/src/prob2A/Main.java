package prob2A;

import java.util.ArrayList;
import java.util.List;

import prob2A.Student;

public class Main {

	public static void main(String[] args) {
		
		Student stu1 = new Student("Jim");
		stu1.setGrade("A");
		System.out.println(stu1);
		
		Student stu2 = new Student("James");
		stu2.setGrade("B-");
		System.out.println(stu2);
		
		Student stu3 = new Student("Junior");
		stu3.setGrade("C+");
		System.out.println(stu3);
		
		List<Student> list = new ArrayList<>();
		
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		
		System.out.println();
		System.out.println("Report: ");
		System.out.println(list);
	}

}