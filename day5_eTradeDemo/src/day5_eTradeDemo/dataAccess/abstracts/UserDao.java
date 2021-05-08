package day5_eTradeDemo.dataAccess.abstracts;



import java.util.List;

import day5_eTradeDemo.entities.concretes.User;

public interface UserDao {

	void register(User user);
	void login(User user);
	
	List<User> getAll();
	


}

