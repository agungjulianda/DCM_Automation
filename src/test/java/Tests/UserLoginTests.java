package Tests;

import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import testBase.TestBase;

@Test
public class UserLoginTests extends TestBase{
	LoginPageObjects loginPage = new LoginPageObjects();
	

	public void UserLoginTest() throws Throwable {
		
		loginPage.login("EMANDATE003", "Reskin01");
		Thread.sleep(2000); ////// not required, adding just to see tests are running in parallel


	}


}
