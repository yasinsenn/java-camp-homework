package kodlamaIo;

public class StudentManager extends UserManager {

	@Override
	public void s�gnUp(User user) {

		System.out.println("Say�n " + user.getFirstName() + " " + user.getLastName()
				+ " kay�t ba�ar�l� kurs sayfas�na y�nlendiriliyorsunuz...");
	}

	@Override
	public void logIn(User user) {
		System.out.println("Say�n " + user.getFirstName() + " " + user.getLastName()
				+ " giri� ba�ar�l� kurs sayfas�na y�nlendiriliyorsunuz...");
	}

	public void registerForTheCourse() {

		System.out.println("Kursa kay�t ba�ar�l� derslere ba�layabilirsiniz...");
	}
}
