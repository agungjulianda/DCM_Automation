package Tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.CNAPageObjects;
import pageObjects.ConfirmationScreenObjects;
import pageObjects.DCMPageObjects;
import pageObjects.DeleteAccountObjects;
import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import testBase.TestBase;

public class DeleteConnectedAccount extends TestBase{
	
	LoginPageObjects loginPage = new LoginPageObjects();
	HomePageObjects homePage = new HomePageObjects();
	DCMPageObjects dcmPage = new DCMPageObjects();
	DeleteAccountObjects delPage = new DeleteAccountObjects();
	ConfirmationScreenObjects confirmPage = new ConfirmationScreenObjects();
	
	@Test
	public void DeleteConnectedAccount() throws Throwable {
		
		loginPage.login("PTTCS12" , "Reskin01");
		//check if dashboard page opens
		homePage.profile();
		homePage.dcmmenu();
		dcmPage.selectdebitcard("3063");
		dcmPage.clickConnectedAccountButton();
		delPage.clickDeleteButton();
		confirmPage.sendOTP("12345678");
		delPage.clickOKButtonCNA();
		dcmPage.selectdebitcard("3063");
		dcmPage.clickConnectedAccountButton();
		TimeUnit.SECONDS.sleep(5);
		
		
}

}
