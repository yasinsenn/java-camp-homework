package kodlamaIo;

public class Student extends User {

	private String courses;

	public Student(int id, String firstName, String lastName, String email, String password, String courses) {
		super(id, firstName, lastName, email, password);
		this.courses = courses;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

}
