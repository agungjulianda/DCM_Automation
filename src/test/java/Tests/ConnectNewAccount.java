package Tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.CNAPageObjects;
import pageObjects.ConfirmationScreenObjects;
import pageObjects.DCMPageObjects;
import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import reusableComponents.Screenshots;
import testBase.TestBase;

public class ConnectNewAccount extends TestBase{
	
	LoginPageObjects loginPage = new LoginPageObjects();
	HomePageObjects homePage = new HomePageObjects();
	DCMPageObjects dcmPage = new DCMPageObjects();
	CNAPageObjects cnaPage = new CNAPageObjects();
	ConfirmationScreenObjects confirmPage = new ConfirmationScreenObjects();
	Screenshots ssUtils = new Screenshots();
	@Test
	public void ConnectNewAccount() throws Throwable {
		
		loginPage.login("PTTCS12" , "Reskin01");
		//check if dashboard page opens
		homePage.profile();
		homePage.dcmmenu();
		dcmPage.selectdebitcard("3063");
		dcmPage.clickConnectedAccountButton();
		cnaPage.clickConnectNewAccountButton();
		cnaPage.selectAccount("003600420073");
		cnaPage.thickCheckbox();
		cnaPage.clickNextButtonCNA();
		confirmPage.sendOTP2("12345678");
		cnaPage.clickOKButtonCNA();
		dcmPage.selectdebitcard("3063");
		dcmPage.clickConnectedAccountButton();
		cnaPage.checkResult("003600420073");
		TimeUnit.SECONDS.sleep(5);
		
		
}

}
