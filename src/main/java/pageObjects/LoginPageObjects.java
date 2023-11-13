package pageObjects;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import testBase.DriverFactory;
import testBase.TestBase;

public class LoginPageObjects extends TestBase  {

	By USER = By.id("username");
	By PASSWORD = By.id("password");
	By LOGIN_BTN = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/button[2]");


	//login to App
	public void login(String user, String password) throws InterruptedException {
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(USER), "LoginEmailFIeld", user);
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(PASSWORD), "LoginPasswordFIeld", password);
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(LOGIN_BTN), "LoginButton");

	}


}


