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

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	
	//Clears the array list after each test
	@AfterEach
	void tearDown() throws Exception {
		ContactService.contactList.clear();
	}


	 // Ensure the ArrayList is not empty. Call addContact passing first last phone address and validate it. 
	@DisplayName("Test addContact")
	@Test
	void testAddContact() {

		String firstName = "John";
		String lastName = "Doe";
		String phoneNumber = "1234567891";
		String address = "321 1st St.";

		ContactService test = new ContactService();

		assertTrue(ContactService.contactList.isEmpty());

		test.addContact(firstName, lastName, phoneNumber, address);

		assertFalse(ContactService.contactList.isEmpty());
		assertEquals(0, ContactService.contactList.get(0).getContactID());
		assertEquals(firstName, ContactService.contactList.get(0).getFirstName());
		assertEquals(lastName, ContactService.contactList.get(0).getLastName());
		assertEquals(phoneNumber, ContactService.contactList.get(0).getPhoneNumber());
		assertEquals(address, ContactService.contactList.get(0).getAddress());

	}
	
	// Add 3 contacts using addContact then delete object at id 1. Check there is no object
	@DisplayName("Test deleteContact")			  
	@Test void testDeleteContact() {
				  
		String firstName = "John"; 
		String lastName = "Doe"; 
		String phoneNumber = "1234567891"; 
		String address = "321 1st St.";
		boolean testBool = false;
		  
		ContactService test = new ContactService();
		  
		assertTrue(ContactService.contactList.isEmpty());
		 
		test.addContact(firstName, lastName, phoneNumber, address);//object at ID 0
		test.addContact(firstName, lastName, phoneNumber, address);//object at ID 1
		test.addContact(firstName, lastName, phoneNumber, address);//object at ID 2
		  
		assertEquals(3,ContactService.contactList.size());
		  
		test.deleteContact("1");
		  
		assertEquals(2,ContactService.contactList.size());
		 
		//loop looking for ID
		for(int i = 0; i < ContactService.contactList.size(); i++) {
			if(ContactService.contactList.get(i).getContactID() == 1) {
				testBool = true;
			}
		}		
		assertFalse(testBool);				 
	}

/*
 * A lot of this came from various YouTube tutorials. I struggled hard with this assignment overall. This was one of the videos:
 * https://www.youtube.com/watch?v=5Dkw0Yl82JQ
 * There were a few more but I closed the tabs and cannot seem to find them again. 
 */
	
	//Create a contact and then validate the phone number. Edit the phone and validate again
	@DisplayName("Test editing a phone number")
	@Test
	void testEditPhone() {
		
		String firstName = "John"; 
		String lastName = "Doe"; 
		String phoneNumber = "1234567891"; 
		String address = "321 1st St.";
		  
		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		
		assertEquals(phoneNumber, ContactService.contactList.get(0).getPhoneNumber());
		
		test.editNumber("0", "1987654321");
		assertEquals("1987654321", ContactService.contactList.get(0).getPhoneNumber());
	}

	//Create a contact and then validate the Last name. Edit the last name and validate again
	@DisplayName("Test editing a last name")
	@Test
	void testEditLast() {
		
		String firstName = "John"; 
		String lastName = "Doe"; 
		String phoneNumber = "1234567891"; 
		String address = "321 1st St.";
		  
		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		
		assertEquals(lastName, ContactService.contactList.get(0).getLastName());
		
		test.editLastName("0", "Test_Name");
		assertEquals("Test_Name", ContactService.contactList.get(0).getLastName());
	}

	//Create a contact and then validate the first name. Edit the first name and validate once more
	@DisplayName("Test editing a first name")
	@Test
	void testEditFirst() {
		
		String firstName = "John"; 
		String lastName = "Doe"; 
		String phoneNumber = "1234567891"; 
		String address = "321 1st St.";

		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		
		assertEquals(firstName, ContactService.contactList.get(0).getFirstName());
		
		test.editFirstName("0", "Test_First");
		assertEquals("Test_First", ContactService.contactList.get(0).getFirstName());
	}

	 //Create a contact and then validate the address. Edit the address and validate yet again
	@DisplayName("Test editing an address")
	@Test
	void testEditAddress() {
		
		String firstName = "John"; 
		String lastName = "Doe"; 
		String phoneNumber = "1234567891"; 
		String address = "321 1st St.";

		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		
		assertEquals(address, ContactService.contactList.get(0).getAddress());
		
		test.editAddress("0", "Test_Address");
		assertEquals("Test_Address", ContactService.contactList.get(0).getAddress());
	}
}

