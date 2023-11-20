package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testBase.DriverFactory;
import testBase.TestBase;

public class ChangePINObjects extends TestBase{

	By CurrentPIN_Box = By.xpath("//input[@id='oldPassword']");
	By NewPIN_Box = By.xpath("//input[@id='newPassword']");
	By RENewPIN_Box = By.xpath("//input[@id='rePassword']");
	By ChangePIN_button = By.xpath("//body/div[@id='holder']/card-view[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
	By ChangePIN_nextButton = By.xpath("//button[contains(text(),'Next') or contains(text(),'Lanjut')]");
	

	//login to App
	public void setCurrentPIN (String CurrentPIN) throws InterruptedException {
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(CurrentPIN_Box), "InputCurrentPIN", CurrentPIN);
		TimeUnit.SECONDS.sleep(5);
		
	}
	
	public void setNewPIN (String NewPIN) throws InterruptedException {
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(NewPIN_Box), "InputCurrentPIN", NewPIN);
		TimeUnit.SECONDS.sleep(5);
		
	}
	
	public void setRENewPIN (String RENewPIN) throws InterruptedException {
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(RENewPIN_Box), "InputCurrentPIN", RENewPIN);
		TimeUnit.SECONDS.sleep(5);
		
	}
	
	public void ChangePINNextButton() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(ChangePIN_nextButton), "NextButtonChangePIN");

	}
		

}
