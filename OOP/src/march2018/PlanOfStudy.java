package march2018;

import java.util.ArrayList;
import java.util.List;

public class PlanOfStudy {
	private List<Course> courseList;
	
	PlanOfStudy(){
		courseList = new ArrayList<>();
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void addCourse(Course course) {
		courseList.add(course);
	}

}
