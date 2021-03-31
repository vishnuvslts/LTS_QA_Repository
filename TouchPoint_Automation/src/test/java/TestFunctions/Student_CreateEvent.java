package TestFunctions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Common.StringHelper;
import Pages.StudentPage;
import Pages.Student_DashboardPage;

public class Student_CreateEvent extends BaseClass  {
	public static WebDriverWait wait;
	public static Actions actions;
	public static Select select;
	@Test
	public void student_createevent() throws Exception {
		
		Student_DashboardPage objects = new Student_DashboardPage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(objects.StudentDash()));
		objects.StudentDash().click();
		select = new Select(objects.selectStaffDrpDwn());
		select.selectByValue("1");
		System.out.println(StringHelper.getCurrentSystemDate());
		
		wait.until(ExpectedConditions.elementToBeClickable(objects.CalendarFrwdBtn()));
		objects.CalendarFrwdBtn().click();
		
		
		
		
		
	}

}
