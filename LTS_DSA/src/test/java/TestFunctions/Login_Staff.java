package TestFunctions;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import Common.BaseClass;
import Common.StringHelper;
import Pages.LoginPage;

public class Login_Staff extends BaseClass {

	public static WebDriverWait wait;

	
	@Test
	public void verifyLogin() {
		LoginPage objects = new LoginPage(driver);
		// Explicit wait
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(objects.SelectUserTypeStaff()));

		// Select the usertype for login
		objects.SelectUserTypeStaff().click();
		objects.EmailField().sendKeys(prop.getProperty("Staff_Email"));
		objects.PasswordField().sendKeys(prop.getProperty("AdminPassword"));
		wait.until(ExpectedConditions.elementToBeClickable(objects.LoginBtn()));
		objects.LoginBtn().click();
		
	}

}