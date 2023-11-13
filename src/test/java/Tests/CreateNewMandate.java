package Tests;


import org.testng.annotations.Test;

import pageObjects.ConfirmationScreenObjects;
import pageObjects.CreateNewMandateObjects;
import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import testBase.TestBase;


public class CreateNewMandate extends TestBase{
	LoginPageObjects loginPage = new LoginPageObjects();
	HomePageObjects homePage = new HomePageObjects();
	CreateNewMandateObjects createPage = new CreateNewMandateObjects();
	ConfirmationScreenObjects ConfirmPage = new ConfirmationScreenObjects();

	
	@Test
	public void CreateNewEmandate() throws Throwable {
		
		loginPage.login("EMANDATE005" , "Reskin01");
		//check if dashboard page opens
		homePage.transaction();
		homePage.emandatemenu();
		createPage.createButton();
		createPage.setBillerData("PERSONAL 01", "PERSONAL SHAREHOLDER ONLY", "PERSONAL SHAREHOLDER ONLY", "771558816911", "BBLUIDJA", "1000000", "Testing Automation");
		createPage.selectAccType();
		createPage.selectMerchantType();
		createPage.selectAmmountType();
		createPage.nextButton();
		ConfirmPage.sendOTP("12345678");
		
		
		
}
}