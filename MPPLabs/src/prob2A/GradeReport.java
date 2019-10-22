package prob2A;

public class GradeReport {
	private String grade;
	private Student stu;
	
	GradeReport(Student stu){
		this.setStu(stu);
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Student getStudent() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}
	
}
