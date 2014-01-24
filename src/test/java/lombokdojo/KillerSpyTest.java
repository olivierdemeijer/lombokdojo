package lombokdojo;

import org.junit.Assert;
import org.junit.Test;

public class KillerSpyTest {
	KillerSpy spy;
	static final String JAMES = "James";
	static final String BOND = "Bond";

	static KillerSpy jamesBond() {
		KillerSpy spy = new KillerSpy(JAMES, BOND);
		return spy;
	}

	@Test
	public void drinks_Martini_On_Shaker() {
		Assert.assertTrue(jamesBond().isDrinkingMartiniOnShaker());
	}

	@Test
	public void hasLicenceToKill() {
		Assert.assertTrue(jamesBond().isLicencedToKill());
	}

	@Test
	public void there_is_only_one_James_Bond() {
		KillerSpy killerSpy1 = jamesBond();
		KillerSpy killerSpy2 = jamesBond();
		Assert.assertTrue(killerSpy1.equals(killerSpy2));
	}

	@Test
	public void toStringTest() {
		String stringRepresentation = jamesBond().toString();
		Assert.assertEquals("KillerSpy(super=Spy(firstName=James, lastName=Bond, licencedToKill=true))",
				stringRepresentation);
	}
}
