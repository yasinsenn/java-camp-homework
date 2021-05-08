package day5_eTradeDemo.business.concretes;


import java.util.List;

import day5_eTradeDemo.business.abstracts.UserService;

import day5_eTradeDemo.core.adapters.LoginWithGoogleService;
import day5_eTradeDemo.dataAccess.abstracts.UserDao;
import day5_eTradeDemo.entities.concretes.User;


public class UserManager implements UserService {

	private UserDao userDao;
	private LoginWithGoogleService loginWithGoogleService;
	
	public UserManager(UserDao userDao, LoginWithGoogleService loginWithGoogleService) {
		super();
		this.userDao = userDao;
		this.loginWithGoogleService = loginWithGoogleService;
	}
	
	private boolean mailControl(User user) {
		for (var mail : userDao.getAll()) {
			if (mail.getEmail() == user.getEmail()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void register(User user) {
		
		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Ad�n�z ve soyad�n�z en az iki karakter olmal�");
		}
		else if (user.getPassword().length() < 6 ) {
			System.out.println("Daha g�venli bir �ifre i�in �ifreniz en az 6 karakterden olu�mal�d�r");
		}
		else if (mailControl(user) == false) {
			
			System.out.println("Girmi� oldu�unuz mail adresi daha �nce kullan�lm��t�r.");
		}
		else if (user.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$") == false) {
			System.out.println("Girmi� oldu�unuz mail adresi formata uygun de�ildir.");
		}
		else {

			userDao.register(user);
			
		}
		

		//	mail do�rulama regex format�	"^[A-Za-z0-9+_.-]+@(.+)$"
		

	}
	
	

	@Override
	public void login(String email, String password) {
		
		for (var user : userDao.getAll()) {
			if (email == user.getEmail() && password == user.getPassword()) {
				userDao.login(user);
				return;
			}
		}
		
		System.out.println("Email veya parola hatal� tekrar deneyiniz");
		
		
		
		
		
		
		
	//	for (var mailPassword : userDao.getAll()) {	
//		if(mailPassword.getEmail() == user.getEmail() && mailPassword.getPassword() == user.getPassword()) {
//				userDao.login(user);
//			}
//		}
	}

	@Override
	public void loginGoogle() {
		loginWithGoogleService.logWithGoogle();
		
	}

	@Override
	public void emailConfirm() {
		System.out.println("Email do�ruland�, �yeli�iniz tamamlanm��t�r");
		System.out.println("------------------------------------------------------");
		
	}



	
}
