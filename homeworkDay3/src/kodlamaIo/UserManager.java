package kodlamaIo;

public class UserManager {

	public void s�gnUp(User user) {

		System.out.println("Kay�t olundu: " + user.getFirstName() + " " + user.getLastName());
	}

	public void logIn(User user) {
		System.out.println("Giri� yap�ld�: " + user.getFirstName() + " " + user.getLastName());

	}

}
