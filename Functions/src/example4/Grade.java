package example4;

import java.util.ArrayList;
import java.util.List;

public class Grade{
	Letter letter;
	int rating;
	List<Course>courses = new ArrayList<>();
	public Letter getLetter() {
		return letter;
	}
	public void setLetter(Letter letter) {
		this.letter = letter;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
}