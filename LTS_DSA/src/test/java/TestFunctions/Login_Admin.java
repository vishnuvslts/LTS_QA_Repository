package TestFunctions;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import Common.BaseClass;
import Common.Read_OTP;
import Common.StringHelper;
import Pages.LoginPage;

public class Login_Admin extends BaseClass {

	public static WebDriverWait wait;

	
	@Test
	public void verifyLogin() {
		LoginPage objects = new LoginPage(driver);
		// Explicit wait
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(objects.SelectUserTypeAdmin()));
		Read_OTP.OutlookMailReader("Inbox", "DSA OTP", "Your OTP is ", 6);
		// Select the usertype for login
		objects.SelectUserTypeAdmin().click();
		objects.EmailField().sendKeys(prop.getProperty("AdminEmail"));
		objects.PasswordField().sendKeys(prop.getProperty("AdminPassword"));
		wait.until(ExpectedConditions.elementToBeClickable(objects.LoginBtn()));
		objects.LoginBtn().click();
		
	}

}
