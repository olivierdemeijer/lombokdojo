package lombokdojo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
	Person person;

	static final String JAMES = "James";
	static final String BOND = "Bond";

	Person jamesBond() {
		Person p = new Person();
		p.setFirstName(JAMES);
		p.setLastName(BOND);
		return p;
	}

	@Test
	public void my_name_is_bond() {
		person = jamesBond();
		assertEquals("first name", JAMES, person.getFirstName());
		assertEquals("last name", BOND, person.getLastName());
	}

	@Test
	public void first_name_can_be_set_again() {
		person = jamesBond();
		person.setFirstName("Adam");
		assertEquals("set firstname", "Adam", person.getFirstName());
	}

	@Test
	public void last_name_can_be_set_again() {
		person = jamesBond();
		person.setLastName("Kirk");
		assertEquals("set firstname", "Kirk", person.getLastName());
	}

	@Test
	public void two_persons_with_the_same_name_arent_equals() {
		Person p1 = jamesBond();
		Person p2 = jamesBond();
		Assert.assertFalse(p1.equals(p2));
		Assert.assertFalse(p1.hashCode() == p2.hashCode());
	}

	public static String defaultToStringImplementation(Object o) {
		return o.getClass().getName() + "@" + Integer.toHexString(o.hashCode());
	}

	@Test
	public void hasDefaultToStringImplementation() {
		person = jamesBond();
		Assert.assertTrue(defaultToStringImplementation(person).equals(person.toString()));
	}
}
