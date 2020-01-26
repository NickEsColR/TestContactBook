package model;

public class Contact {
	
	//attributtes
	
	private String name;
	private String email;
	private String phone;
	
	//methods
	
	public Contact(String n, String e, String p) {
		super();
		name = n;
		email = e;
		phone = p;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public boolean equals(Contact ctc) {
		
		boolean bool = false;
		
		if(ctc.getName().equals(name)&&ctc.getEmail().equals(email)&&ctc.getPhone().equals(phone)) {
			bool = true;
		}
		
		return bool;
	}
	
	
}
