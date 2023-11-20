package Tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.ChangePINObjects;
import pageObjects.ConfirmationScreenObjects;
import pageObjects.DCMPageObjects;
import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import reusableComponents.Screenshots;
import testBase.TestBase;

public class ChangePIN extends TestBase {
	
	LoginPageObjects loginPage = new LoginPageObjects();
	HomePageObjects homePage = new HomePageObjects();
	DCMPageObjects dcmPage = new DCMPageObjects();
	ChangePINObjects chPage = new ChangePINObjects();
	ConfirmationScreenObjects confirmPage = new ConfirmationScreenObjects();
	Screenshots ssUtils = new Screenshots();
	@Test
	public void ChangeCardPIN() throws Throwable {
		
		loginPage.login("PTTCS12" , "Reskin01");
		//check if dashboard page opens
		homePage.profile();
		homePage.dcmmenu();
		dcmPage.selectdebitcard("3063");
		dcmPage.ChangePINButton();
		chPage.setCurrentPIN("111213");
		chPage.setNewPIN("112233");
		chPage.setRENewPIN("112233");
		chPage.ChangePINNextButton();
		confirmPage.sendOTP("12345678");
		ssUtils.takeEvidences("ChangePIN");


		TimeUnit.SECONDS.sleep(5);
		
		
}

}
