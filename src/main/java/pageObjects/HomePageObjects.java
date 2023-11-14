package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testBase.DriverFactory;
import testBase.TestBase;

public class HomePageObjects extends TestBase{


	By transaction_button = By.xpath("//li[contains(text(),'Transaksi') or contains(text(),'Transaction')]");
	By profile_button = By.xpath("//li[contains(text(),'Profil') or contains(text(),'Profile')]");
	By emandate_button = By.xpath("//body/div[@id='holder']/landing[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[8]/div[1]/div[1]");
	By dcm_menu = By.xpath("//body/div[@id='holder']/profile[1]/div[2]/div[1]/form[1]/div[2]/div[4]");
	

	//login to App
	public void transaction() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(transaction_button), "TransactionButton");

	}
	
	public void profile() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(profile_button), "ProfileButton");

	}
	
	public void emandatemenu() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(emandate_button), "EmandateButton");

	}
	
	public void dcmmenu() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(dcm_menu), "DCMButton");

	}


}
