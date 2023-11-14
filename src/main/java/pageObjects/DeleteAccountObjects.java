package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testBase.DriverFactory;
import testBase.TestBase;

public class DeleteAccountObjects extends TestBase{

	By CNA_button = By.xpath("//button[contains(text(),'+')]");
	By acc_dropdown = By.xpath("//body/div[@id='holder']/new-account-entry[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]/div[1]");
	//By selectedacc = By.xpath("//*[@class='text' and contains(., '003600420073')]");
	By checkbox = By.xpath("//body/div[@id='holder']/new-account-entry[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]");
	By nextbutton = By.xpath("//button[contains(text(),'Lanjut' ) or contains(text(),'Nex' )]");
	By Ok_button = By.xpath("//body/div[@id='holder']/new-account-confirm[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]");
	
	
	public void clickConnectNewAccountButton() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(CNA_button), "ConnectNewAccountButton");

	}
	
	public void selectAccount(String accNumber) throws Throwable {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(acc_dropdown), "ClickDropdown");
		click_custom(DriverFactory.getInstance().getDriver().findElement(By.xpath("//*[@class='text' and contains(., '"+accNumber+"')]")), "SelectAccount");
		
	}
	
	public void thickCheckbox() throws Throwable {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(checkbox), "ThickCheckBox");
		
		
	}
	
	public void clickNextButtonCNA() throws Throwable {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(nextbutton), "ClickNextButton");
		
		
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
