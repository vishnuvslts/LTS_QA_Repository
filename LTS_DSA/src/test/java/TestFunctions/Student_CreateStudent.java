package TestFunctions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Common.BaseClass;
import Pages.StudentPage;

public class Student_CreateStudent extends BaseClass  {
	public static WebDriverWait wait;
	
	public void createStudentProfile() {
		
		StudentPage objects = new StudentPage(driver);
		objects.HomeBtn().click();
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(objects.addNewBtn()));
		objects.addNewBtn().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(objects.student_firstname()));
		//Enter student details
		objects.student_firstname().sendKeys(prop.getProperty("Student_Firstname"));
	}

}
