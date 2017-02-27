package framework.menuhometests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.pages.homemenu.ContactsPage;
import framework.testcase.TestBase;

public class ContactHomeMenuTestSuite extends TestBase {

	@Test
	// TS 3.1
	public void checkCitiesListTest() {
		ContactsPage contactsPage = homePage.openContactsMenu();
		
		//TODO injected failure - change to assertTrue
		Assert.assertTrue(contactsPage.isContactsListQuanityCorrect(), "Contacts cities list size is incorrect");
	}

}