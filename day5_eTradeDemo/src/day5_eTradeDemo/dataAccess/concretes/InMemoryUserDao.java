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
		System.out.println("Kay�t ba�ar�l� �yeli�inizi tamamlamak i�in g�nderilen maildeki onay linkine t�klay�n ");
		
	}

	@Override
	public void login(User user) {
		System.out.println("Sisteme giri� ba�ar�l�.");
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}



	


	

	
}
