package kodlamaIo;

public class Main {

	public static void main(String[] args) {

		User user1 = new User(1, "Yasin", "Şen", "yasin@com", "12345");
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "engin@com", "12345", "İletişim bilgileri", 10);
		Student student1 = new Student(1, "Yasin", "Şen", "yasin@com", "12345", "C# , JAVA");

		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		UserManager userManager = new UserManager();

		userManager.sıgnUp(user1);
		userManager.logIn(user1);

		System.out.println("=====================================================");

		instructorManager.sıgnUp(instructor1);
		instructorManager.logIn(instructor1);
		instructorManager.addTheCourse();

		System.out.println("=====================================================");

		studentManager.sıgnUp(student1);
		studentManager.logIn(student1);
		studentManager.registerForTheCourse();

	}

}
