package lombokdojo;

public class Spy {
	public final String firstName;
	public final String lastName;
	private boolean licencedToKill;

	public Spy(final String firstName, final String lastName) {
		if (firstName == null) {
			throw new java.lang.NullPointerException("firstName");
		}
		if (lastName == null) {
			throw new java.lang.NullPointerException("lastName");
		}
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public java.lang.String toString() {
		return "Spy(firstName=" + firstName + ", lastName=" + lastName + ", licencedToKill=" + isLicencedToKill() + ")";
	}

	protected Spy(final String firstName, final String lastName, final boolean licencedToKill) {
		if (firstName == null) {
			throw new java.lang.NullPointerException("firstName");
		}
		if (lastName == null) {
			throw new java.lang.NullPointerException("lastName");
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.licencedToKill = licencedToKill;
	}

	public boolean isLicencedToKill() {
		return licencedToKill;
	}
}