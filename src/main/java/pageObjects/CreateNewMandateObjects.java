package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import testBase.DriverFactory;
import testBase.TestBase;

public class CreateNewMandateObjects extends TestBase {
	By create_button = By.xpath("//button[contains(text(),'Buat e-Mandate Baru')]");
	By merchantidpath = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/input[1]");
	By merchatnamepath  = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[3]/input[1]");
	By accountnamepath  = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[4]/input[1]");
	By accountnopath  = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[6]/input[1]");
	By acctypepath  = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/button[1]");
	By acctypeselectpath  = By.xpath("//*[@id=\"holder\"]/e-mandate-create/div[1]/div/form/div[2]/div/div[5]/div[2]/div/div[1]/div/div/div/ul/li[6]/a/span[2]");
	By agentidpath  = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[7]/input[1]");
	By merchtypepath  = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[8]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]");
	By merchtypeselectpath  = By.xpath("//*[@id=\"holder\"]/e-mandate-create/div[1]/div/form/div[2]/div/div[8]/div[2]/div/div[1]/div/div/div/ul/li[2]/a/span[2]");
	By amounttypepath  = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[9]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]");
	By amounttypeselectpath  = By.xpath("//*[@id=\"holder\"]/e-mandate-create/div[1]/div/form/div[2]/div/div[9]/div[2]/div/div[1]/div/div/div/ul/li[2]/a/span[2]");
	By amountpath  = By.xpath("//input[@id='amount']");
	By reasonpath  = By.xpath("//body/div[@id='holder']/e-mandate-create[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[14]/input[1]");
	By next_button = By.xpath("//button[contains(text(),'Lanjut')]");

	//login to App
	public void setBillerData(String merchantId, String merchantname, String accname , String accnumber , String agentid, String ammount, String reason) throws InterruptedException {
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(merchantidpath ), "MerchantIdField", merchantId);
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(merchatnamepath ), "MerchantNameField", merchantname);
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(accountnamepath ), "AccountNameField", accname);
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(accountnopath ), "AccountNumberField", accnumber);
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(agentidpath ), "AgentIdField", agentid);
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(amountpath ), "AmmountField", ammount);
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(reasonpath ), "ReasonField", reason);
		TimeUnit.SECONDS.sleep(5);

	}
	
	public void createButton() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(create_button), "CreateMandateButton");

	}
	
	public void nextButton() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(next_button), "NextButton");

	}
	
	public void selectAccType() throws Throwable {
		TimeUnit.SECONDS.sleep(2);
		click_custom(DriverFactory.getInstance().getDriver().findElement(acctypepath), "AccountTypeDropdown");
		TimeUnit.SECONDS.sleep(2);
		click_custom(DriverFactory.getInstance().getDriver().findElement(acctypeselectpath), "AccountTypeSelected");
		//((Actions) DriverFactory.getInstance().getDriver()).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void selectMerchantType() throws Throwable {
		TimeUnit.SECONDS.sleep(2);
		click_custom(DriverFactory.getInstance().getDriver().findElement(merchtypepath), "MerchantTypeDropdown");
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(merchtypeselectpath), "MerchantTypeSelected");
		TimeUnit.SECONDS.sleep(5);
	}
	public void selectAmmountType() throws Throwable {
		TimeUnit.SECONDS.sleep(2);
		click_custom(DriverFactory.getInstance().getDriver().findElement(amounttypepath), "AmmountTypeDropdown");
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(amounttypeselectpath), "AmmountTypeSelected");
		//((Actions) DriverFactory.getInstance().getDriver()).sendKeys(Keys.ARROW_DOWN).perform();;
		//((Actions) DriverFactory.getInstance().getDriver()).sendKeys(Keys.RETURN).perform();
		//TimeUnit.SECONDS.sleep(5);
	}
	
	


}
