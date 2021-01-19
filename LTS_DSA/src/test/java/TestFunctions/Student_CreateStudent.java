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
		objects.student_lastname().sendKeys(prop.getProperty("Student_Student_Lastname"));
		objects.student_phone().sendKeys(prop.getProperty("Student_Phone"));
		objects.student_mobile().sendKeys(prop.getProperty("Student_Mobile"));
		objects.student_SFEEmail().sendKeys(prop.getProperty("Student_Email"));
		objects.student_address().sendKeys(prop.getProperty("Student_Address"));
		objects.student_dob().sendKeys(prop.getProperty("Student_dob"));
	}

}
