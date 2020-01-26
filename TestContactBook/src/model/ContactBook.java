package model;
import java.util.ArrayList;

public class ContactBook {
	
	//relations
	
	private ArrayList<Contact> contacts;
	
	//methods
	
	public ContactBook() {
		contacts = new ArrayList<Contact>();
	}

	public ArrayList<Contact> getContacts() {
		return contacts;
	}

	public boolean add( String name, String email, String phone) {
		boolean addSuccess = false;
		
		if(!contacts.contains(new Contact(name,email,phone))) {
			contacts.add(new Contact(name,email,phone));
			addSuccess = true;
		}
		
		return addSuccess;	
	}
	
	public Contact search(String email) {
		Contact searchContact = null;
			
		boolean found = false;
		
		for(int i = 0;i < contacts.size()&&!found;i++) {
			if(contacts.get(i).getEmail().equals(email)) {
				searchContact = contacts.get(i);
				found = true;
			}
		}

		return searchContact;
	}

	public Contact remove(String email){
		
		Contact contactRemove = search(email);
		
		if(contactRemove!=null) {
			contacts.remove(contactRemove);
		}
		
		return contactRemove;
	}
	
	
}
