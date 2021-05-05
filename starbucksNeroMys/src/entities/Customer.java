package entities;

import java.sql.Date;

import abstracts.Entity;

public class Customer implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	public String natioanlityId;

	public Customer(int id, String firstName, String lastName, Date dateOfBirth, String natioanlityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.natioanlityId = natioanlityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNatioanlityId() {
		return natioanlityId;
	}

	public void setNatioanlityId(String natioanlityId) {
		this.natioanlityId = natioanlityId;
	}

}
