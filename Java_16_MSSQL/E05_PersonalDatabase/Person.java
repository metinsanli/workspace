package E05_PersonalDatabase;
public class Person {

	private int addressID;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;

	public Person(int id, String first, String last, String emailAddress, String phone) {
		setAddressID(id);
		setFirstName(first);
		setLastName(last);
		setEmail(emailAddress);
		setPhoneNumber(phone);
	} // end constructor

	public int getAddressID() {
		return addressID;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

} // END CLASS