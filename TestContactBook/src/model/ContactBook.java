package model;
import java.util.ArrayList;
public class ContactBook {
	
	//relations
	
	private ArrayList<Contact> contacts;
	
	//methods
	
	public ContactBook() {
		
	}

	public ArrayList<Contact> getContacts() {
		return contacts;
	}

	public boolean add( String name, String email, String phone) {
		boolean addSuccess = false;
		Contact contactSearch = search(email);
		if(contactSearch == null) {
			contacts.add(new Contact(name, email, phone));
			addSuccess = true;
		}
		return addSuccess;	
	}
	
	public Contact search(String email) {
	Contact searchContact = null;
		for(int i = 0;i < contacts.length();i++) {
			if(contacts.get(i).getEmail().equals(email)) {
				searchContact = contacts.get(i);
			}
		}
	return searchContact;
	}
	
	
}
