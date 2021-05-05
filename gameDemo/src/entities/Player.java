package entities;

import java.sql.Date;

import abstracts.Entity;

public class Player implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private String natioanaltiyId;
	private Date dateOfBirth;

	public Player(int id, String firstName, String lastName, String natioanaltiyId, Date dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.natioanaltiyId = natioanaltiyId;
		this.dateOfBirth = dateOfBirth;
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

	public String getNatioanaltiyId() {
		return natioanaltiyId;
	}

	public void setNatioanaltiyId(String natioanaltiyId) {
		this.natioanaltiyId = natioanaltiyId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
