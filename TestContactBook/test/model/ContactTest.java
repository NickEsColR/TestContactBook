package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
	
	
	@Test
	public void testContact() {
		Contact ctc1 = new Contact("Diego Lopez","superdi84@gmail.com","3576789321"); 
		
		assertEquals("Diego Lopez",ctc1.getName(),"The name wasn't assigned correctly");
		assertEquals("superdi84@gmail.com",ctc1.getEmail(),"The email wasn't assigned correctlyy");
		assertEquals("3576789321",ctc1.getPhone(),"The phone wasn't assigned correctly");
		
	}

}
