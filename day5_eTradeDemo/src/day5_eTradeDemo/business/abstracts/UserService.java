package day5_eTradeDemo.business.abstracts;

import day5_eTradeDemo.entities.concretes.User;

public interface UserService {

	void register(User user);
	void login(String email, String password);
	void loginGoogle();
	void emailConfirm();
}
