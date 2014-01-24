
package lombokdojo;

public class KillerSpy extends Spy {

	public KillerSpy(String firstName, String lastname) {
		super(firstName, lastname, true);
	}

	public boolean isDrinkingMartiniOnShaker() {
		return true;
	}

	@Override
	public java.lang.String toString() {
		return "KillerSpy(super=" + super.toString() + ")";
	}

	@Override
	public boolean equals(final java.lang.Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof KillerSpy)) {
			return false;
		}
		final KillerSpy other = (KillerSpy)o;
		if (!other.canEqual(this)) {
			return false;
		}
		return true;
	}

	@java.lang.SuppressWarnings("all")
	public boolean canEqual(final java.lang.Object other) {
		return other instanceof KillerSpy;
	}

	@Override
	public int hashCode() {
		int result = 1;
		return result;
	}
}