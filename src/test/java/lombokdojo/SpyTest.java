package lombokdojo;

import org.junit.Assert;
import org.junit.Test;

public class SpyTest {
	static final String JAMES = "James";
	static final String BOND = "Bond";

	Spy spy;

	Spy jamesBond() {
		Spy spy = new Spy(JAMES, BOND);
		return spy;
	}

	@Test(expected = NullPointerException.class)
	public void first_name_is_mandatory() {
		spy = new Spy(null, BOND);
	}

	@Test(expected = NullPointerException.class)
	public void last_name_is_mandatory() {
		spy = new Spy(JAMES, null);
	}

	@Test
	public void no_licence_to_kill_by_default() {
		Spy spy = jamesBond();
		Assert.assertFalse(spy.isLicencedToKill());
	}

	@Test
	public void toStringTest() {
		spy = jamesBond();
		String stringRepresentation = spy.toString();
		Assert.assertEquals("Spy(firstName=James, lastName=Bond, licencedToKill=false)", stringRepresentation);
	}

	@Test
	public void two_spys_with_the_same_name_arent_equals() {
		Spy spy1 = jamesBond();
		Spy spy2 = jamesBond();
		Assert.assertFalse(spy1.equals(spy2));
		Assert.assertFalse(spy1.hashCode() == spy2.hashCode());
	}

}
