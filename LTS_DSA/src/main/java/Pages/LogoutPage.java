package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
WebDriver driver ;
	
	public LogoutPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	//Select user type for login
	@FindBy(xpath= "//a[@class='nav-link dropdown-toggle user-dp-toggle']")WebElement ViewUserBtn;
	@FindBy(xpath= "(//span[@class='dropdown-item crsr-pntr'])[1]']")WebElement LogoutBtn;
	
	public WebElement ViewUserBtn()
	{
		return ViewUserBtn;
	}
	
	public WebElement LogoutBtn()
	{
		return LogoutBtn;
	}
}
