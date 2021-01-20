package TestFunctions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Pages.StudentPage;

public class Student_CreateStudent extends BaseClass  {
	public static WebDriverWait wait;
	public static Actions actions;
	public static Select select;
	@Test
	public void createStudentProfile() throws Exception {
		
		StudentPage objects = new StudentPage(driver);
		objects.HomeBtn().click();
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(objects.StudentsModule()));
		objects.StudentsModule().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.addNewBtn()));
		objects.addNewBtn().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(objects.student_firstname()));
		//Enter student details
		objects.student_firstname().sendKeys(prop.getProperty("Student_Firstname"));
		objects.student_lastname().sendKeys(prop.getProperty("Student_Lastname"));
		objects.student_phone().sendKeys(prop.getProperty("Student_Phone"));
		objects.student_mobile().sendKeys(prop.getProperty("Student_Mobile"));
		objects.student_SFEEmail().sendKeys(prop.getProperty("Student_Email"));
		objects.student_address().sendKeys(prop.getProperty("Student_Address"));
		actions.moveToElement(objects.Student_Course_Field());
		actions.perform();  
		objects.Student_Course_Field().click();
		Thread.sleep(2000);
		objects.Student_Course_DD_Option().click();
		objects.Student_Institution_Field().click();
		Thread.sleep(2000);
		objects.Student_Institution_DD_Option().click();
		objects.Student_Organisation_Field().click();
		Thread.sleep(2000);
		objects.Student_Organisation_DD_Option().click();
		Thread.sleep(2000);
		actions.moveToElement(objects.SaveBtn());
		actions.perform();
		wait.until(ExpectedConditions.elementToBeClickable(objects.SelectSupportType()));
		select = new Select(objects.SelectSupportType()); 
		select.selectByVisibleText(prop.getProperty("SupportTypeName"));
		select = new Select(objects.SelectSupportStaff()); 
		select.selectByVisibleText(prop.getProperty("Staff_Fullname"));
		objects.Student_PlannedHoursField().sendKeys(prop.getProperty("Student_Plannedhours"));
		objects.Student_Support_StartDate().click();
		objects.Calendar_NextMonthBtn().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.Student_courseDate()));
		objects.Student_courseDate().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.Student_Support_EndDate()));
		objects.Student_Support_EndDate().click();
		objects.Calendar_NextMonthBtn().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.Student_courseDate()));
		objects.Student_courseDate().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.SaveBtn()));
		objects.SaveBtn().click();
		
		String toastsuccessMessage = objects.toastMsg().getText();
		objects.toastCloseBtn().click();
		if (toastsuccessMessage.contentEquals("Student profile created successfully")) {
			Assert.assertEquals(toastsuccessMessage, "Student profile created successfully");
			System.out.println("Verify create student profile manually executed and passed successfully!!!   "+toastsuccessMessage);
		}

		else {
			Assert.fail();
			System.out.println("Verification failed");
		}

	}

}
