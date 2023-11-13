package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import testBase.DriverFactory;
import testBase.TestBase;

public class ConfirmationScreenObjects extends TestBase {
	By otp_box = By.xpath("//input[@id='otp']");
	By send_button = By.xpath("//button[contains(text(),'Kirim')]");
	By pass_mark = By.xpath("//*[contains(text(),'Transaksi Berhasil')]");


	//login to App
	public void sendOTP (String OTP) throws InterruptedException {
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(otp_box), "LoginEmailFIeld", OTP);
		TimeUnit.SECONDS.sleep(5);
		click_custom(DriverFactory.getInstance().getDriver().findElement(send_button), "SendButton");
		TimeUnit.SECONDS.sleep(10);
		isElementPresent_custom(DriverFactory.getInstance().getDriver().findElement(pass_mark), "TransactionSuccessMarkExist");
	}


}
