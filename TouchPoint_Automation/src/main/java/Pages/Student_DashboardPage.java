package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Student_DashboardPage {
WebDriver driver ;
	
	public Student_DashboardPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	//Common
	@FindBy(xpath= "//span[@class='fc-icon fc-icon-chevron-right']")WebElement CalendarFrwdBtn;
	@FindBy(xpath= "//a[@id='student_dasboard']")WebElement StudentDash;
	@FindBy(xpath= "//img[@alt='dsa-logo']")List <WebElement> DSALogo;
	@FindBy(xpath= "//h2[@class='fc-toolbar-title']")WebElement CalMonth;
	
	//Select user type for login
	@FindBy(xpath= "//a[@class='nav-link dropdown-toggle user-dp-toggle']")WebElement ViewUserBtn;
	@FindBy(xpath= "//span[text()='Logout']")WebElement LogoutBtn;
	@FindBy(xpath= "//select[@id='student_calendar_staff']")WebElement selectStaffDrpDwn;
	
	//Select staff dropdown
	@FindBy(xpath= "//select[@id='student_calendar_staff']")WebElement SelectStaffDropDown;
	
	
	
	
	
	//Common
	public WebElement CalendarFrwdBtn()
	{
		return CalendarFrwdBtn;
	}
	public WebElement ViewUserBtn()
	{
		return ViewUserBtn;
	}
	
	public WebElement LogoutBtn()
	{
		return LogoutBtn;
	}
	
	public WebElement StudentDash()
	{
		return StudentDash;
	}
	
	public List <WebElement> DSALogo()
	{
		return DSALogo;
	}
	
	public WebElement selectStaffDrpDwn()
	{
		return selectStaffDrpDwn;
	}
	
	public WebElement CalMonth()
	{
		return CalMonth;
	}
}
