package example4;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Role{
	List<Grade>grades = new ArrayList<>();
	
	public String getRole() {
		return "Professor";
		
		
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}
}