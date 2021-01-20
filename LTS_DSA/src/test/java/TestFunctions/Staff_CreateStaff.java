package TestFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Pages.StaffPage;

public class Staff_CreateStaff extends BaseClass {
	public static Actions actions;
	public static WebDriverWait wait;

	@Test
	public void createStaffProfile() throws Exception {

		StaffPage objects = new StaffPage(driver);
		objects.HomeBtn().click();
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(objects.staffsModule()));
		objects.staffsModule().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.addNewBtn()));
		objects.addNewBtn().click();

		wait.until(ExpectedConditions.elementToBeClickable(objects.staff_firstname()));
		// Enter staff details
		objects.staff_firstname().sendKeys(prop.getProperty("Staff_Firstname"));
		objects.staff_lastname().sendKeys(prop.getProperty("Staff_Lastname"));
		objects.staff_SFEEmail().sendKeys(prop.getProperty("Staff_Email"));
		objects.staff_Organisation_Field().click();
		Thread.sleep(3000);
		objects.staff_Organisation_DD_Option().click();
		actions.moveToElement(objects.SaveBtn());
		actions.perform();

		// Select role
		driver.findElement(By.xpath("//input[@value='" + prop.getProperty("RoleName") + "']")).click();
		objects.SaveBtn().click();
		
		String toastsuccessMessage = objects.toastMsg().getText();
		objects.toastCloseBtn().click();
		if (toastsuccessMessage.contentEquals("Staff profile created successfully")) {
			Assert.assertEquals(toastsuccessMessage, "Staff profile created successfully");
			System.out.println("Verify create staff profile executed and passed successfully!!!   "+toastsuccessMessage);
		}

		else {
			Assert.fail();
			System.out.println("Verification failed");
		}

	}

}
