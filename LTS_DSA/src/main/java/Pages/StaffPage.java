package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaffPage {
	WebDriver driver;

	public StaffPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Common
	@FindBy(xpath = "//a[@class='navbar-brand']")
	WebElement HomeBtn;
	@FindBy(xpath = "//button[@class='save-btn']")
	WebElement SaveBtn;
	@FindBy(xpath = "//div[@class='toast-message']")
	WebElement toastMsg;
	@FindBy(xpath = "//button[@class='toast-close-button']")
	WebElement toastCloseBtn;
	
	@FindBy(xpath = "//input[@class='form-control search-inp']")
	WebElement searchField;
	@FindBy(xpath = "//button[@title='Click to change status']")
	WebElement statusBtn;
	@FindBy(xpath = "//a[@title='Edit']")
	WebElement editBtn;
	@FindBy(xpath = "//a[@title='Delete']")
	WebElement deleteBtn;
	@FindBy(xpath = "//button[@class='yes-btn']")
	WebElement cnfrmYesBtn;

	// Page details
	@FindBy(xpath = "//a[@id='admin_staffs']")
	WebElement staffsModule;
	@FindBy(xpath = "//span[@class='add-new']")
	WebElement addNewBtn;
	@FindBy(xpath = "//div[@class='error-message']")
	WebElement errorMsg;
	// Add staff details
	@FindBy(xpath = "//input[@placeholder='Enter first name']")
	WebElement staff_firstname;
	@FindBy(xpath = "//input[@placeholder='Enter last name']")
	WebElement staff_lastname;
	@FindBy(xpath = "//input[@placeholder='Enter phone']")
	WebElement staff_phone;
	@FindBy(xpath = "//input[@placeholder='Enter last mobile']")
	WebElement staff_mobile;
	@FindBy(xpath = "//input[@placeholder='Enter sfe registered email']")
	WebElement staff_SFEEmail;
	@FindBy(xpath = "//textarea[@id='add_staff_address']")
	WebElement staff_address;
	@FindBy(xpath = "//input[@id='add_staff_dateofbirth']")
	WebElement staff_dob;
	
	@FindBy(xpath = "//div[@class=' css-1hwfws3']")
	WebElement staff_Organisation_Field;
	
	@FindBy(xpath = "//div[@id='react-select-2-option-0']")
	WebElement staff_Organisation_DD_Option;
	
	// common
	public WebElement HomeBtn() {
		return HomeBtn;
	}
	public WebElement SaveBtn() {
		return SaveBtn;
	}
	
	public WebElement editBtn() {
		return editBtn;
	}
	
	public WebElement searchField() {
		return searchField;
	}
	
	public WebElement statusBtn() {
		return statusBtn;
	}
	
	public WebElement deleteBtn() {
		return deleteBtn;
	}
	
	public WebElement cnfrmYesBtn() {
		return cnfrmYesBtn;
	}
	
	public WebElement toastMsg() {
		return toastMsg;
	}
	
	public WebElement toastCloseBtn() {
		return toastCloseBtn;
	}
	// page details
	public WebElement staffsModule() {
		return staffsModule;
	}

	public WebElement addNewBtn() {
		return addNewBtn;
	}

	public WebElement errorMsg() {
		return errorMsg;
	}

	// Add staff details
	public WebElement staff_firstname() {
		return staff_firstname;
	}

	public WebElement staff_lastname() {
		return staff_lastname;
	}

	public WebElement staff_phone() {
		return staff_phone;
	}

	public WebElement staff_mobile() {
		return staff_mobile;
	}

	public WebElement staff_SFEEmail() {
		return staff_SFEEmail;
	}

	public WebElement staff_address() {
		return staff_address;
	}
	
	public WebElement staff_dob() {
		return staff_dob;
	}
	
	
	
	public WebElement staff_Organisation_Field() {
		return staff_Organisation_Field;
	}
	
	public WebElement staff_Organisation_DD_Option() {
		return staff_Organisation_DD_Option;
	}
}
