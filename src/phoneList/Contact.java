package phoneList;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * This contains info for a single contact
 * 
 * Parameters Needed to Store
 *   - Contact's Name
 *   - Contact's Phone Number
 *   
 * Needed Methods
 *   - Constructor(s)
 *   - getter methods
 *   - Setter methods not necessary unless Constructor
 *        initialize variables.
 *   - Override toString() so that Contact can
 *        be printed as part of a list.
 * 
 */

public class Contact {
	public String Name;
	public String Number;

	public Contact(String Name, String Number) {
		this.Name = Name;
		this.Number = Number;
	}
//GETTER METHODS
	public String GetNumber() {
		return Number;
	}

	public String Getname() {
		return Name;

	}

	// SETTER
	
	public void setNum(String Number) {
		this.Number = Number;

	}

	public void setName(String Name) {
		this.Name = Name;

	}
}