package lastName.provider;

import firstName.provider.FirstName;

public class NameConstructor {
	public String getName() {
		FirstName fname = new FirstName();
		LastName  lname = new LastName();
		return "Construction of name into java_9_lastName module => " + fname.getFirstName() + " " + lname.getLastName();
	}
}
