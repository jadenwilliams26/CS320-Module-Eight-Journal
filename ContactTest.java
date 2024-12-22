/*
* 
* 
* Jaden Williams
* CS320
* November 15th, 2024
*
*
*/

 package Contact;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactTest{

	//Test for a valid constructor
	@DisplayName("Test a valid Constructor")
	@Test
	public void testGoodConstructor() {
        String contactId = "1";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567891";
        String address = "321 1st St.";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);
        
		assertEquals(1, testContact.getContactID());
		assertEquals(firstName, testContact.getFirstName());
		assertEquals(lastName, testContact.getLastName());
		assertEquals(phoneNumber, testContact.getPhoneNumber());
		assertEquals(address, testContact.getAddress());
	}
	
	//Test for too short of a phone number
	@DisplayName("Test an invalid Constructor")
	@Test
	public void testBadConstructor() {
        String contactId = "2";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "26";
        String address = "321 1st St.";       
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}
	
	//Test setFirstName with a valid input
	@DisplayName("Test a valid setFirstName")
	@Test
	public void testGoodSetFirst() {
        String contactId = "3";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567891";
        String address = "321 1st St.";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setFirstName("Jonathan");        
        assertEquals("Jonathan", testContact.getFirstName());
	}
	
	//Test setFirstName with invalid null input
	@DisplayName("Test an invalid null setFirstName")
	@Test
	public void testBadSetFirst() {
        String contactId = "3";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567891";
        String address = "321 1st St.";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName(null);
        });
	}
	
	//Test setFirstName with too long of an input
	@DisplayName("Test an invalid length setFirstName")
	@Test
	public void testLongSetFirst() {
        String contactId = "3";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567891";
        String address = "321 1st St.";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName("WoahThisNameIsTooLonggg");
        });
	}
	
	//Test getID with good input, then ensure integer being returned
	@DisplayName("Test getID")
	@Test
	public void testGetID() {
        String contactId = "3";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567891";
        String address = "321 1st St.";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertEquals(3, testContact.getContactID());
	}
	
	//Test getID with good input, then ensure no string returned
	@DisplayName("Test bad getID")
	@Test
	public void testBadGetID() {
        String contactId = "3";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567891";
        String address = "321 1st St.";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertNotEquals("3", testContact.getContactID());
	}
	
	//Test getID with too long of an input
	@DisplayName("Test too long getID")
	@Test
	public void testlongGetID() {
        String contactId = "0987654321123456";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567891";
        String address = "321 1st St.";
		
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}
	
	//Test setLastName with invalid null input
	@DisplayName("Test an invalid null setLastName")
	@Test
	public void testBadSetLast() {
        String contactId = "3";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567891";
        String address = "321 1st St.";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName(null);
        });
	}
	
	//Test setLastName with too long of an input
	@DisplayName("Test an invalid length setLastName")
	@Test
	public void testLongSetLast() {
        String contactId = "3";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567891";
        String address = "321 1st St.";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName("WoahThisLastNameIsTooLong");
        });
	}
	
	//Test the setLastName with a valid input 
	@DisplayName("Test a valid setLastName")
	@Test
	public void testGoodsetLast() {
        String contactId = "3";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567891";
        String address = "321 1st St.";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setLastName("Valid");        
        assertEquals("Valid", testContact.getLastName());
	}
	
	//Test setPhoneNumber with an invalid null input
	@DisplayName("Test an invalid null setPhoneNumber")
	@Test
	public void testBadSetPhone() {
        String contactId = "3";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567891";
        String address = "321 1st St.";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber(null);
        });
        
	}
	
	//Test setPhone with too short and too long inputs
	@DisplayName("Test an invalid length setPhoneNumber")
	@Test
	public void testWrongLengthPhone() {
        String contactId = "3";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567891";
        String address = "321 1st St.";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber("26");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber("6987654321123456");
        });
	}

	//Test the setPhone with valid input
	@DisplayName("Test a valid length setPhoneNumber")
	@Test
	public void testGoodPhone() {
        String contactId = "3";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567891";
        String address = "321 1st St.";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setPhoneNumber("6987654321");        
        assertEquals("6987654321", testContact.getPhoneNumber());

	}
	
	//Test setAddress with an invalid null input
	@DisplayName("Test an invalid null setAddress")
	@Test
	public void testNullSetAddress() {
        String contactId = "3";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567891";
        String address = "321 1st St.";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress(null);
        });
        
	}
	
	//Test setAddress with an invalid too long input
	@DisplayName("Test an invalid length setPhoneNumber")
	@Test
	public void testWrongLengthAddress() {
        String contactId = "3";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567891";
        String address = "321 1st St.";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress("654321 This Address Is Far Too Long To Be Valid St.");
        });
	}

	//Test the setAddress with a valid input
	@DisplayName("Test a valid length setAddress")
	@Test
	public void testGoodAddress() {
        String contactId = "3";
      	String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567891";
        String address = "321 1st St.";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setAddress("654 Valid St.");        
        assertEquals("654 Valid St.", testContact.getAddress());

	}
	
}
