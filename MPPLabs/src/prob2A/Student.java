package prob2A;

public class Student {
	private String name;
	private GradeReport gradeReport;
	
	public Student(String name){
		this.name = name;
		gradeReport = new GradeReport(this);
	}

	public void setGrade(String grade) {
		this.gradeReport.setGrade(grade);
	}
	
	@Override
	public String toString() {
		return name  + ": Grade: " + gradeReport.getGrade();
	}
}
