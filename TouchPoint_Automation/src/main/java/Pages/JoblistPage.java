package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JoblistPage {
	WebDriver driver;

	public JoblistPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Common
	@FindBy(xpath = "//img[@class='brand-logo']")
	WebElement HomeBtn;
	@FindBy(xpath = "//button[@class='save-btn']")
	WebElement SaveBtn;
	@FindBy(xpath = "//div[@class='toast-message']")
	WebElement toastMsg;
	@FindBy(xpath = "//button[@class='toast-close-button']")
	WebElement toastCloseBtn;
	
	//Joblist
	
	@FindBy(xpath = "//a[@id='staff_joblist']")
	WebElement JoblistModule;
	@FindBy(xpath = "//button[@class='view-table-btn view-table-yes-btn']")
	WebElement acceptBtn;
	
	
	
	
	
	
	
	
	// common
	public WebElement HomeBtn() {
		return HomeBtn;
	}
	public WebElement SaveBtn() {
		return SaveBtn;
	}
	
	public WebElement toastMsg() {
		return toastMsg;
	}
	
	public WebElement toastCloseBtn() {
		return toastCloseBtn;
	}
	
	public WebElement JoblistModule() {
		return JoblistModule;
	}
	
	public WebElement acceptBtn() {
		return acceptBtn;
	}
	
}
