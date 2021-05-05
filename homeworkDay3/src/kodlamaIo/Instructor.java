package kodlamaIo;

public class Instructor extends User {

	private String contactInformation;
	private int rating;

	public Instructor(int id, String firstName, String lastName, String email, String password,
			String contactInformation, int rating) {
		super(id, firstName, lastName, email, password);
		this.contactInformation = contactInformation;
		this.rating = rating;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
