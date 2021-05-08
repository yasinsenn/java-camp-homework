package day5_eTradeDemo.entities.concretes;

import day5_eTradeDemo.entities.abstracts.Entity;

public class User implements Entity {
	

	String FirstName;
	String LastName;
	String email;
	String password;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String email, String password) {
		super();
		
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		this.password = password;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
