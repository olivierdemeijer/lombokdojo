package lombokdojo.sample;

import java.util.Date;

public class PersonPojo {

	enum Gender {
		Male, Female;
	}


	private String firstName;
	private String lastName;
	private final Gender gender;
	private final Date dateOfBirth;
	private String ssn;
	private String address;
	private String city;
	private String state;
	private String zip;

	public PersonPojo(final String firstName, final String lastName, final Gender gender, final Date dateOfBirth) {
		if (firstName == null) {
			throw new java.lang.NullPointerException("firstName");
		}
		if (lastName == null) {
			throw new java.lang.NullPointerException("lastName");
		}
		if (gender == null) {
			throw new java.lang.NullPointerException("gender");
		}
		if (dateOfBirth == null) {
			throw new java.lang.NullPointerException("dateOfBirth");
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		if (firstName == null) {
			throw new java.lang.NullPointerException("firstName");
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		if (lastName == null) {
			throw new java.lang.NullPointerException("lastName");
		}
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(final String ssn) {
		this.ssn = ssn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(final String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(final String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(final String zip) {
		this.zip = zip;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "Person(firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", ssn=" + ssn + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ")";
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object o) {
		if (o == this) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (o.getClass() != this.getClass()) {
			return false;
		}
		final PersonPojo other = (PersonPojo) o;
		if (firstName == null ? other.firstName != null : !firstName.equals(other.firstName)) {
			return false;
		}
		if (lastName == null ? other.lastName != null : !lastName.equals(other.lastName)) {
			return false;
		}
		if (gender == null ? other.gender != null : !gender.equals(other.gender)) {
			return false;
		}
		if (dateOfBirth == null ? other.dateOfBirth != null : !dateOfBirth.equals(other.dateOfBirth)) {
			return false;
		}
		if (ssn == null ? other.ssn != null : !ssn.equals(other.ssn)) {
			return false;
		}
		return true;
	}

	@java.lang.Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = (result * PRIME) + (firstName == null ? 0 : firstName.hashCode());
		result = (result * PRIME) + (lastName == null ? 0 : lastName.hashCode());
		result = (result * PRIME) + (gender == null ? 0 : gender.hashCode());
		result = (result * PRIME) + (dateOfBirth == null ? 0 : dateOfBirth.hashCode());
		result = (result * PRIME) + (ssn == null ? 0 : ssn.hashCode());
		return result;
	}
}