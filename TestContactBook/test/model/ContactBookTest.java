package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ContactBookTest {
	
	private Contact ctc1;
	private Contact ctc2;
	private Contact ctc3;
	
	private ContactBook ctb1;
	
	private void setup1() {
		ctc1 = new Contact("Diego Lopez","superdi84@gmail.com","3576789321");
		ctc2 = new Contact("Juan Cardona","juan123@gmail.com","3529045901");
		ctc3 = new Contact("Elsa broso","temamastewey@gmail.com","3244448909");
		
		ctb1 = new ContactBook();
	}

	@Test
	public void addTest() {
		setup1();
		
		ctb1.add("Diego Lopez","superdi84@gmail.com","3576789321");
		ctb1.add("Juan Cardona","juan123@gmail.com","3529045901");
		ctb1.add("Elsa broso","temamastewey@gmail.com","3244448909");
		
		ArrayList <Contact>contacts = ctb1.getContacts();
		
		assertTrue(contacts.get(0).equals(ctc1),"The contact1 wasn't added correctly");
		assertTrue(contacts.get(1).equals(ctc2),"The contact2 wasn't added correctly");
		assertTrue(contacts.get(2).equals(ctc3),"The contact3 wasn't added correctly");
		
	}
	
	@Test
	public void searchTest() {
		setup1();
		
		ctb1.add("Diego Lopez","superdi84@gmail.com","3576789321");
		ctb1.add("Juan Cardona","juan123@gmail.com","3529045901");
		ctb1.add("Elsa broso","temamastewey@gmail.com","3244448909");
		
		assertTrue(ctc2.equals(ctb1.search("juan123@gmail.com")),"The ctc2 wasn't returned correctly");
	}
	
	@Test
	public void removeTest() {
		setup1();
		
		ctb1.add("Diego Lopez","superdi84@gmail.com","3576789321");
		ctb1.add("Juan Cardona","juan123@gmail.com","3529045901");
		ctb1.add("Elsa broso","temamastewey@gmail.com","3244448909");
		
		assertTrue(ctc3.equals(ctb1.remove("temamastewey@gmail.com")),"The ctc3 wasn't returned correctly");
		
		assertTrue(ctb1.search("temamastewey@gmail.com")==null,"The ctc3 wasn't removed correctly");
		
	}

}
