package TestFunctions;

import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import Common.BaseClass;
import Common.StringHelper;
import Pages.LoginPage;

public class Login_Student extends BaseClass {

	public static WebDriverWait wait;

	
	@Test
	public void verifyLogin() throws Exception {
		LoginPage objects = new LoginPage(driver);

		// Explicit wait
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(objects.SelectUserTypeStudent()));

		// Select the usertype for login
		objects.SelectUserTypeStudent().click();
		objects.EmailField().sendKeys(prop.getProperty("Student_Email"));
		objects.PasswordField().sendKeys(prop.getProperty("Password"));
		wait.until(ExpectedConditions.elementToBeClickable(objects.LoginBtn()));
		objects.LoginBtn().click();
		
		Thread.sleep(3000);
		if(objects.agreeDocsCount().size()>0) {
			objects.agreeDocs().click();	
		}
		
		
	}

}
