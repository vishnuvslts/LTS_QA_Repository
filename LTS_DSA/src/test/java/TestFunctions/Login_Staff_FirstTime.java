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

public class Login_Staff_FirstTime extends BaseClass {

	public static WebDriverWait wait;

	
	@Test
	public void firstTimeLogin() {
		LoginPage objects = new LoginPage(driver);
		// Explicit wait
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(objects.SelectUserTypeStaff()));
		Read_OTP.OutlookMailReader("Inbox", "DSA OTP", 
				"OTP for DSA is ", 6);
		// Select the usertype for login
		objects.SelectUserTypeStaff().click();
		objects.EmailField().sendKeys(prop.getProperty("Staff_Email"));
		objects.PasswordField().sendKeys(Read_OTP.searchText);
		wait.until(ExpectedConditions.elementToBeClickable(objects.LoginBtn()));
				objects.LoginBtn().click();
				wait.until(ExpectedConditions.elementToBeClickable(objects.set_NewPwd()));
				objects.set_NewPwd().sendKeys(prop.getProperty("NewPwd"));
				objects.set_CnfrmPwd().sendKeys(prop.getProperty("NewPwd"));
				objects.subBtn().click();
				wait.until(ExpectedConditions.elementToBeClickable(objects.SelectUserTypeStaff()));
				objects.SelectUserTypeStaff().click();
				objects.EmailField().sendKeys(prop.getProperty("Staff_Email"));
				objects.PasswordField().sendKeys(prop.getProperty("NewPwd"));
				objects.LoginBtn().click();
				wait.until(ExpectedConditions.elementToBeClickable(objects.agreeDocs()));
				objects.agreeDocs().click();
				// Verify the signed in user details
				wait.until(ExpectedConditions.elementToBeClickable(objects.ProfileModule()));
				objects.ProfileModule().click();
				wait.until(ExpectedConditions.elementToBeClickable(objects.UserEmail()));
				String UserEmail = objects.UserEmail().getText();
				if (UserEmail.contentEquals(prop.getProperty("AdminEmail"))) {
					Assert.assertEquals(UserEmail, prop.getProperty("AdminEmail"));
					System.out.println("Verify login using valid username and password executed and passed successfully!!!     "
							+ objects.UserName().getText() + " signed in successfully");
				}

				else {
					Assert.fail();
					System.out.println("Verification failed");
				}

	}

}
