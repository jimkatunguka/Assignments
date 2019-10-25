package march2018;

public class Student {
private String firstName;
private String lastName;
private Transcript transcript = new Transcript();
private PlanOfStudy planOfStudy = new PlanOfStudy();

public Student(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	
}

public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public Transcript getTranscript() {
	return transcript;
}

public PlanOfStudy getPlanOfStudy() {
	return planOfStudy;
}
}
