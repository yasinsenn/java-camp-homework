package day5_eTradeDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5_eTradeDemo.dataAccess.abstracts.UserDao;
import day5_eTradeDemo.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	List<User> users = new ArrayList<User>();

	@Override
	public void register(User user) {
		users.add(user);
		System.out.println("Kayýt baþarýlý üyeliðinizi tamamlamak için gönderilen maildeki onay linkine týklayýn ");
		
	}

	@Override
	public void login(User user) {
		System.out.println("Sisteme giriþ baþarýlý.");
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}



	


	

	
}
