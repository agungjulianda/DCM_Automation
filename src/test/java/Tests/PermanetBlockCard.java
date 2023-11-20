package Tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.ConfirmationScreenObjects;
import pageObjects.DCMPageObjects;
import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import reusableComponents.Screenshots;
import testBase.TestBase;

public class PermanetBlockCard extends TestBase {
	
	LoginPageObjects loginPage = new LoginPageObjects();
	HomePageObjects homePage = new HomePageObjects();
	DCMPageObjects dcmPage = new DCMPageObjects();
	
	ConfirmationScreenObjects confirmPage = new ConfirmationScreenObjects();
	Screenshots ssUtils = new Screenshots();
	@Test
	public void BlockCardPermanent() throws Throwable {
		
		loginPage.login("PTTCS12" , "Reskin01");
		//check if dashboard page opens
		homePage.profile();
		homePage.dcmmenu();
		dcmPage.selectdebitcard("3055");
		dcmPage.BlockPermanentCard();
		dcmPage.NextBlockPermanentCard();
		//confirmPage.sendOTP("12345678");
		ssUtils.takeEvidences("ACKPermanentBlock");


		TimeUnit.SECONDS.sleep(5);
		
		
}

}
