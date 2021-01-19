package TestFunctions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Pages.SettingsPage;

public class SettingsFunctions_Add_CourseOfStudy extends BaseClass {
	
	public static WebDriverWait wait;
	@Test
	public void addCourseOfStudy() throws InterruptedException {
		
		SettingsPage objects = new SettingsPage(driver);
		objects.HomeBtn().click();
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(objects.SettingsModule()));
		objects.SettingsModule().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.CourseSubModule()));
		objects.CourseSubModule().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.AddNew()));
		objects.AddNew().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.EnterCourseNameField()));
		objects.EnterCourseNameField().sendKeys(prop.getProperty("CourseName"));
		objects.EnterCourseDescField().sendKeys(prop.getProperty("CourseDesc"));
		objects.SaveBtn().click();
		
	}
}
