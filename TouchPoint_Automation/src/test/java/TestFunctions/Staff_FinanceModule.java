package TestFunctions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;
import Common.StringHelper;
import Pages.DashboardPage;
import Pages.FinancePage;
import Pages.JoblistPage;
import Pages.StudentOnSupportPage;
import Pages.StudentPage;
import Pages.StudentTimesheetPage;

public class Staff_FinanceModule extends BaseClass {
	public static WebDriverWait wait;
	public static Actions actions;
	public static Select select;
	public static int claimedhrs = 3;
	public static int RoleRate = 10;

	@Test(priority = 1)
	public void verifyFinacePageDetails() throws Exception {

		FinancePage objects = new FinancePage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(objects.HomeBtn()));
		objects.HomeBtn().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.FinanceModule()));
		objects.FinanceModule().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.getAmountEarnedGeneric()));
		
		String Actual_FinancePage_HoursWorked = objects.getHoursWorksedGeneric().getText();
		String Actual_FinancePage_AmountEarned = objects.getAmountEarnedGeneric().getText();
		String Actual_FinancePage_StudentName = objects.getStudentName().getText();
		
		if (Actual_FinancePage_HoursWorked.contentEquals(prop.getProperty("ClaimWorkedTime"))) {
			Assert.assertEquals(Actual_FinancePage_HoursWorked, prop.getProperty("ClaimWorkedTime"));
			System.out.println(
					"Verify actual hours worked on staff finance page executed and passed successfully!!! ");

		} else {
			Assert.fail();
			System.out.println("Verification failed");
			
		}
		
		if (Actual_FinancePage_AmountEarned.contentEquals(prop.getProperty("CurrencySymbol")+(claimedhrs*RoleRate))) {
			Assert.assertEquals(Actual_FinancePage_AmountEarned, prop.getProperty("CurrencySymbol")+(claimedhrs*RoleRate));
			System.out.println(
					"Verify actual amount on staff finance page executed and passed successfully!!! ");

		} else {
			Assert.fail();
			System.out.println(prop.getProperty("CurrencySymbol")+(claimedhrs*RoleRate));
			
		}
		
		if (Actual_FinancePage_StudentName.contentEquals(prop.getProperty("Student_Fullname"))) {
			Assert.assertEquals(Actual_FinancePage_StudentName, prop.getProperty("Student_Fullname"));
			System.out.println(
					"Verify studentname on staff finance page executed and passed successfully!!! ");

		} else {
			Assert.fail();
			System.out.println("Verification failed");
			
		}
		
		objects.viewDetailsBtn().click();
		wait.until(ExpectedConditions.elementToBeClickable(objects.closeBtn()));
		String DetailsPage_GetStudentName = objects.getStudNameDetails().getText();
		String DetailsPage_GetStudentEmail = objects.getStudEmailDetails().getText();
		String DetailsPage_GetSessionTitle = objects.getSessionNameDetails().getText();
		String DetailsPage_GetST = objects.getSupportTypeDetails().getText();
		String DetailsPage_GetRole = objects.getRoleDetails().getText();
		String DetailsPage_GetLocation = objects.getLocationDetails().getText();
		String DetailsPage_GetMOD = objects.getMODDetails().getText();
		String DetailsPage_GetFB = objects.getFBDetails().getText();
		String DetailsPage_GetAmount = objects.getAmountDetails().getText();
		String DetailsPage_GetBreak = objects.getBreakDetails().getText();
		String DetailsPage_GetTotalHours = objects.getTotalHoursDetails().getText();

		if (DetailsPage_GetStudentName.contentEquals(prop.getProperty("Student_Fullname"))) {
			Assert.assertEquals(DetailsPage_GetStudentName, prop.getProperty("Student_Fullname"));
			System.out.println(
					"Verify student name on finance view details page executed and passed successfully!!! ");

		} else {
			Assert.fail();
			System.out.println("Verification failed");
			
		}
		
		if (DetailsPage_GetStudentEmail.contentEquals(prop.getProperty("Student_Email"))) {
			Assert.assertEquals(DetailsPage_GetStudentEmail, prop.getProperty("Student_Email"));
			System.out.println(
					"Verify student email on finance view details page executed and passed successfully!!! ");

		} else {
			Assert.fail();
			System.out.println("Verification failed");
			
		}
		
		
		if (DetailsPage_GetSessionTitle.contentEquals(prop.getProperty("EventTitle"))) {
			Assert.assertEquals(DetailsPage_GetSessionTitle, prop.getProperty("EventTitle"));
			System.out.println(
					"Verify event title on finance view details page executed and passed successfully!!! ");

		} else {
			Assert.fail();
			System.out.println("Verification failed");
			
		}
		
		if (DetailsPage_GetST.contentEquals(prop.getProperty("SupportTypeName"))) {
			Assert.assertEquals(DetailsPage_GetST, prop.getProperty("SupportTypeName"));
			System.out.println(
					"Verify support type on finance view details page executed and passed successfully!!! ");

		} else {
			Assert.fail();
			System.out.println("Verification failed");
			
		}
		
		if (DetailsPage_GetRole.contentEquals(prop.getProperty("RoleName"))) {
			Assert.assertEquals(DetailsPage_GetRole, prop.getProperty("RoleName"));
			System.out.println(
					"Verify role on finance view details page executed and passed successfully!!! ");

		} else {
			Assert.fail();
			System.out.println("Verification failed");
			
		}
		
		if (DetailsPage_GetLocation.contentEquals(prop.getProperty("EventLoctation"))) {
			Assert.assertEquals(DetailsPage_GetLocation, prop.getProperty("EventLoctation"));
			System.out.println(
					"Verify location on finance view details page executed and passed successfully!!! ");

		} else {
			Assert.fail();
			System.out.println("Verification failed");
			
		}
		
		if (DetailsPage_GetMOD.contentEquals(prop.getProperty("ClaimMOD"))) {
			Assert.assertEquals(DetailsPage_GetMOD, prop.getProperty("ClaimMOD"));
			System.out.println(
					"Verify mode of delivery on finance view details page executed and passed successfully!!! ");

		} else {
			Assert.fail();
			System.out.println("Verification failed");
			
		}
		
		
		if (DetailsPage_GetFB.contentEquals(prop.getProperty("FBName"))) {
			Assert.assertEquals(DetailsPage_GetFB, prop.getProperty("FBName"));
			System.out.println(
					"Verify funding board on finance view details page executed and passed successfully!!! ");

		} else {
			Assert.fail();
			System.out.println("Verification failed");
			
		}
		
		if (DetailsPage_GetAmount.contentEquals(Actual_FinancePage_AmountEarned)) {
			Assert.assertEquals(DetailsPage_GetAmount, Actual_FinancePage_AmountEarned);
			System.out.println(
					"Verify amount earned on finance view details page executed and passed successfully!!! ");

		} else {
			Assert.fail();
			System.out.println("Verification failed");
			
		}
		
		if (DetailsPage_GetBreak.contentEquals(prop.getProperty("ClaimBreakTime"))) {
			Assert.assertEquals(DetailsPage_GetBreak, prop.getProperty("ClaimBreakTime"));
			System.out.println(
					"Verify break time on finance view details page executed and passed successfully!!! ");

		} else {
			Assert.fail();
			System.out.println("Verification failed");
			
		}
		
		if (DetailsPage_GetTotalHours.contentEquals(prop.getProperty("ClaimWorkedTime"))) {
			Assert.assertEquals(DetailsPage_GetTotalHours, prop.getProperty("ClaimWorkedTime"));
			System.out.println(
					"Verify hours worked on finance view details page executed and passed successfully!!! ");

		} else {
			Assert.fail();
			System.out.println("Verification failed");
			
		}
		
		objects.closeBtn().click();
		
	}


}
