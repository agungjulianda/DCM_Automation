package Tests;

import org.testng.annotations.Test;
import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;

import testBase.TestBase;

/**
 * @author: Prakash Narkhede
 * @Youtube: https://www.youtube.com/automationtalks
 * @LinkedIn: https://www.linkedin.com/in/panarkhede89/
 */

public class AccessEmandate extends TestBase{
	LoginPageObjects loginPage = new LoginPageObjects();
	HomePageObjects homePage = new HomePageObjects();

	
	@Test
	public void AccessEmandate() throws Throwable {
		
		loginPage.login("EMANDATE006" , "Reskin01");
		//check if dashboard page opens
		homePage.transaction();
		homePage.emandatemenu();
		
		
}
}