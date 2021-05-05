package kodlamaIo;

public class Main {

	public static void main(String[] args) {

		User user1 = new User(1, "Yasin", "�en", "yasin@com", "12345");
		Instructor instructor1 = new Instructor(1, "Engin", "Demiro�", "engin@com", "12345", "�leti�im bilgileri", 10);
		Student student1 = new Student(1, "Yasin", "�en", "yasin@com", "12345", "C# , JAVA");

		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		UserManager userManager = new UserManager();

		userManager.s�gnUp(user1);
		userManager.logIn(user1);

		System.out.println("=====================================================");

		instructorManager.s�gnUp(instructor1);
		instructorManager.logIn(instructor1);
		instructorManager.addTheCourse();

		System.out.println("=====================================================");

		studentManager.s�gnUp(student1);
		studentManager.logIn(student1);
		studentManager.registerForTheCourse();

	}

}
