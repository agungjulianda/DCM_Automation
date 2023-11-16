package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testBase.DriverFactory;
import testBase.TestBase;

public class DeleteAccountObjects extends TestBase{

	By delete_button = By.xpath("//body/div[@id='holder']/account-list[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]/img[1]");
	By Ok_button = By.xpath("//body/div[@id='holder']/delete-account[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]");
	
	
	public void clickDeleteButton() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(delete_button), "ClickOnDeleteButton");

	}
	

	
	public void clickOKButtonCNA() throws Throwable {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(Ok_button), "ClickOKButton");
		
		
	}
	
	public void checkResult(String accNumber) throws Throwable {
		TimeUnit.SECONDS.sleep(5);
		isElementPresent_custom(DriverFactory.getInstance().getDriver().findElement(By.xpath("//div[contains(text(),'"+accNumber+"')]")), "CheckResult");
		
	}
	

}
