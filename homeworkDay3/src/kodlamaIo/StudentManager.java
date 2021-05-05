package kodlamaIo;

public class StudentManager extends UserManager {

	@Override
	public void sýgnUp(User user) {

		System.out.println("Sayýn " + user.getFirstName() + " " + user.getLastName()
				+ " kayýt baþarýlý kurs sayfasýna yönlendiriliyorsunuz...");
	}

	@Override
	public void logIn(User user) {
		System.out.println("Sayýn " + user.getFirstName() + " " + user.getLastName()
				+ " giriþ baþarýlý kurs sayfasýna yönlendiriliyorsunuz...");
	}

	public void registerForTheCourse() {

		System.out.println("Kursa kayýt baþarýlý derslere baþlayabilirsiniz...");
	}
}
