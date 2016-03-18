package trainning20160316.order;

public class Name implements Comparable<Name>{
	private final String firstName;
	private final String lastName;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Name(String firstName, String lastName) {
		if (firstName == null || lastName == null) throw new NullPointerException();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int hashCode() {
		return 31* firstName.hashCode() + lastName.hashCode();
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Name)) return false;
		Name n = (Name) obj;
		return n.firstName.equals(firstName) && n.lastName.equals(lastName);
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}

	public int compareTo(Name n) {
		int lastCompare = lastName.compareTo(n.lastName);
		return lastCompare != 0 ? lastCompare : firstName.compareTo(n.firstName);
	}
}
