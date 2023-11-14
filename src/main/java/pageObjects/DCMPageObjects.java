package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testBase.DriverFactory;
import testBase.TestBase;

public class DCMPageObjects extends TestBase{

	By CA_button = By.xpath("//body/div[@id='holder']/card-view[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/img[1]");

	

	

	//login to App
	public void selectdebitcard(String eocn) throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),'"+eocn+"')]")), "SelectDebitCard");

	}
	
	public void clickConnectedAccountButton() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(CA_button), "ConnectedAccountButton");

	}


}
