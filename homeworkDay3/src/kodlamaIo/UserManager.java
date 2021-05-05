package kodlamaIo;

public class UserManager {

	public void sýgnUp(User user) {

		System.out.println("Kayýt olundu: " + user.getFirstName() + " " + user.getLastName());
	}

	public void logIn(User user) {
		System.out.println("Giriþ yapýldý: " + user.getFirstName() + " " + user.getLastName());

	}

}
