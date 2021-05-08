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
			System.out.println("Adýnýz ve soyadýnýz en az iki karakter olmalý");
		}
		else if (user.getPassword().length() < 6 ) {
			System.out.println("Daha güvenli bir þifre için þifreniz en az 6 karakterden oluþmalýdýr");
		}
		else if (mailControl(user) == false) {
			
			System.out.println("Girmiþ olduðunuz mail adresi daha önce kullanýlmýþtýr.");
		}
		else if (user.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$") == false) {
			System.out.println("Girmiþ olduðunuz mail adresi formata uygun deðildir.");
		}
		else {

			userDao.register(user);
			
		}
		

		//	mail doðrulama regex formatý	"^[A-Za-z0-9+_.-]+@(.+)$"
		

	}
	
	

	@Override
	public void login(String email, String password) {
		
		for (var user : userDao.getAll()) {
			if (email == user.getEmail() && password == user.getPassword()) {
				userDao.login(user);
				return;
			}
		}
		
		System.out.println("Email veya parola hatalý tekrar deneyiniz");
			

	}

	@Override
	public void loginGoogle() {
		loginWithGoogleService.logWithGoogle();
		
	}

	@Override
	public void emailConfirm() {
		System.out.println("Email doðrulandý, üyeliðiniz tamamlanmýþtýr");
		System.out.println("------------------------------------------------------");
		
	}



	
}
