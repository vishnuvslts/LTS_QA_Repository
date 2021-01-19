package TestFunctions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Pages.SettingsPage;

public class SettingsFunctions_Add_Institution extends BaseClass {
	
	public static WebDriverWait wait;
	@Test
	public void addInstitution() throws InterruptedException {
		
		SettingsPage objects = new SettingsPage(driver);
		objects.HomeBtn().click();
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(objects.SettingsModule()));
		objects.SettingsModule().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.InstitutionSubModule()));
		objects.InstitutionSubModule().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.AddNew()));
		objects.AddNew().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.EnterInstitutionNameField()));
		objects.EnterInstitutionNameField().sendKeys(prop.getProperty("InstitutionName"));
		objects.EnterInstitutionDescField().sendKeys(prop.getProperty("InstitutionDesc"));
		objects.SaveBtn().click();
		
	}
}
