package day5_eTradeDemo;

import day5_eTradeDemo.business.abstracts.UserService;
import day5_eTradeDemo.business.concretes.UserManager;
import day5_eTradeDemo.core.adapters.LoginWithGoogleManagerAdapter;

import day5_eTradeDemo.dataAccess.concretes.InMemoryUserDao;
import day5_eTradeDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new InMemoryUserDao() , new LoginWithGoogleManagerAdapter());
			
			
		User user1 = new User("Deneme", "Fake", "fake@gmail.com", "123456");
		User user2 = new User("Deneme", "Fake", "deneme@gmail.com", "123456");
		User user3 = new User("Deneme", "Fake", "deneme@gmail.com", "123456");
		User nameError = new User("D", "Fake", "deneme@gmail.com", "123456");
		User surnameError = new User("Deneme", "F", "deneme@gmail.com", "123456");
		User passwordError = new User("Deneme", "Fake", "deneme@gmail.com", "12345");
		
		
		
		userService.register(user1);
		userService.emailConfirm();
		userService.register(user2);
		userService.emailConfirm();
		userService.register(user3);
		userService.register(nameError);
		userService.register(surnameError);
		userService.register(passwordError);
		
		System.out.println("------------------------------------------------------");
		
		userService.loginGoogle();
		userService.login("deneme@gmail.com", "12345");;
		userService.login("deneme@gmail.com", "123456");

	}

}
