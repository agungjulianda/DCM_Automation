package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testBase.DriverFactory;
import testBase.TestBase;

public class DCMPageObjects extends TestBase{

	By CA_button = By.xpath("//body/div[@id='holder']/card-view[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/img[1]");
	By Perm_block = By.xpath("//body/div[@id='holder']/card-view[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/button[1]/img[1]");;
	By block_nextButton = By.xpath("//button[contains(text(),'Next') or contains(text(),'Lanjut')]");
	By ChangePIN_button = By.xpath("//body/div[@id='holder']/card-view[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
	
	

	//login to App
	public void selectdebitcard(String eocn) throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(By.xpath("//span[contains(text(),'"+eocn+"')]")), "SelectDebitCard");

	}
	
	public void clickConnectedAccountButton() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(CA_button), "ConnectedAccountButton");

	}
	
	public void BlockPermanentCard() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(Perm_block), "PermanentBlockCard");

	}
	
	public void NextBlockPermanentCard() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(block_nextButton), "NextButtonPermanentBlockCard");

	}

	public void ChangePINButton() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(ChangePIN_button), "ClickChangePINButton");

	}
		

}
