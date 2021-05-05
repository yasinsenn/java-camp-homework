package kodlamaIo;

public class InstructorManager extends UserManager {

	@Override
	public void sýgnUp(User user) {

		System.out.println("Sayýn " + user.getFirstName() + " " + user.getLastName()
				+ " kayýt baþarýlý eðitmen sayfasýna yönlendiriliyorsunuz...");
	}

	@Override
	public void logIn(User user) {
		System.out.println("Sayýn " + user.getFirstName() + " " + user.getLastName()
				+ " giriþ baþarýlý eðitmen sayfasýna yönlendiriliyorsunuz...");
	}

	public void addTheCourse() {
		System.out.println("Kurs ekleme baþarýlý");
	}

}
