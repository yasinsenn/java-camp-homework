package kodlamaIo;

public class InstructorManager extends UserManager {

	@Override
	public void s�gnUp(User user) {

		System.out.println("Say�n " + user.getFirstName() + " " + user.getLastName()
				+ " kay�t ba�ar�l� e�itmen sayfas�na y�nlendiriliyorsunuz...");
	}

	@Override
	public void logIn(User user) {
		System.out.println("Say�n " + user.getFirstName() + " " + user.getLastName()
				+ " giri� ba�ar�l� e�itmen sayfas�na y�nlendiriliyorsunuz...");
	}

	public void addTheCourse() {
		System.out.println("Kurs ekleme ba�ar�l�");
	}

}
