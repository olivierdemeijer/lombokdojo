package lombokdojo;


public final class RandomErrand {

	public enum Gender {
		MALE,
		FEMALE;

	}

	private final String name;
	private final int age;

	private final Gender gender;

	RandomErrand(final String name, final int age, final Gender gender) {
		if (name == null) {
			throw new java.lang.NullPointerException("name");
		}
		if (gender == null) {
			throw new java.lang.NullPointerException("gender");
		}
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	public static class RandomErrandBuilder {
		private String name;
		private int age;
		private Gender gender;


		RandomErrandBuilder() {
		}


		public RandomErrandBuilder name(final String name) {
			this.name = name;
			return this;
		}


		public RandomErrandBuilder age(final int age) {
			this.age = age;
			return this;
		}


		public RandomErrandBuilder gender(final Gender gender) {
			this.gender = gender;
			return this;
		}


		public RandomErrand build() {
			return new RandomErrand(name, age, gender);
		}

		@Override
		public java.lang.String toString() {
			return "RandomErrand.RandomErrandBuilder(name=" + name + ", age=" + age + ", gender=" + gender + ")";
		}
	}


	public static RandomErrandBuilder builder() {
		return new RandomErrandBuilder();
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public Gender getGender() {
		return gender;
	}

	@Override
	public boolean equals(final java.lang.Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof RandomErrand)) {
			return false;
		}
		final RandomErrand other = (RandomErrand)o;
		final java.lang.Object this$name = getName();
		final java.lang.Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
			return false;
		}
		if (getAge() != other.getAge()) {
			return false;
		}
		final java.lang.Object this$gender = getGender();
		final java.lang.Object other$gender = other.getGender();
		if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int PRIME = 277;
		int result = 1;
		final java.lang.Object $name = getName();
		result = (result * PRIME) + ($name == null ? 0 : $name.hashCode());
		result = (result * PRIME) + getAge();
		final java.lang.Object $gender = getGender();
		result = (result * PRIME) + ($gender == null ? 0 : $gender.hashCode());
		return result;
	}

	@Override
	public java.lang.String toString() {
		return "RandomErrand(name=" + getName() + ", age=" + getAge() + ", gender=" + getGender() + ")";
	}
}