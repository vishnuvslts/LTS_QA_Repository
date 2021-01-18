package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateStudent {
	WebDriver driver;

	public CreateStudent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Common
	@FindBy(xpath = "//span[@class='add-new']")
	WebElement addNewBtn;
	@FindBy(xpath = "//div[@class='error-message']")WebElement errorMsg;
	//Add student details
	@FindBy(xpath = "//input[@placeholder='Enter first name']")WebElement student_firstname;
	@FindBy(xpath = "//input[@placeholder='Enter last name']")WebElement student_lastname;
	@FindBy(xpath = "//input[@placeholder='Enter phone']")WebElement student_phone;
	@FindBy(xpath = "//input[@placeholder='Enter last mobile']")WebElement student_mobile;
	@FindBy(xpath = "//input[@placeholder='Enter sfe registered email']")WebElement student_SFEEmail;

	// Common
	public WebElement addNewBtn() {
		return addNewBtn;
	}
	public WebElement errorMsg() {
		return errorMsg;
	}
	
	//Add student details
	public WebElement student_firstname() {
		return student_firstname;
	}
	
	public WebElement student_lastname() {
		return student_lastname;
	}
	
	public WebElement student_phone() {
		return student_phone;
	}
	public WebElement student_mobile() {
		return student_mobile;
	}
	public WebElement student_SFEEmail() {
		return student_SFEEmail;
	}
}
