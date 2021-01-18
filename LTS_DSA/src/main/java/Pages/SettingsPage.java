package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {
	WebDriver driver;

	public SettingsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Select user type for login
	@FindBy(xpath = "//a[@data-toggle='collapse']")
	WebElement SettingsModule;
	// Common items
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
	@FindBy(xpath = "(//tbody/tr/td)[2]")
	WebElement entrySearched;
	@FindBy(xpath = "(//tbody/tr/td)[3]")
	WebElement entrydescSearched;
	@FindBy(xpath = "//i[@class='fa fa-thumbs-down']")
	WebElement noentryFound;
	@FindBy(xpath = "//a[@class='navbar-brand']")
	WebElement HomeBtn;
	@FindBy(xpath = "//span[@class='add-new']")
	WebElement AddNew;

	// Course
	@FindBy(xpath = "//a[text()='Course of Study']")
	WebElement CourseSubModule;
	@FindBy(xpath = "//input[@id='settings_course_coursename']")
	WebElement EnterCourseNameField;
	@FindBy(xpath = "//input[@placeholder='Enter description']")
	WebElement EnterCourseDescField;

	// Institution
	@FindBy(xpath = "//a[text()='Institution']")
	WebElement InstitutionSubModule;
	@FindBy(xpath = "//input[@id='settings_institution_institutionname']")
	WebElement EnterInstitutionNameField;
	@FindBy(xpath = "//input[@id='settings_institution_description']")
	WebElement EnterInstitutionDescField;

	// Organisation
	@FindBy(xpath = "//a[text()='Organisation']")
	WebElement OrganisationSubModule;
	@FindBy(xpath = "//input[@id='settings_organisation_orgName']")
	WebElement EnterOrganisationNameField;
	@FindBy(xpath = "//input[@id='settings_organisation_description']")
	WebElement EnterOrganisationDescField;

	// Support Type
	@FindBy(xpath = "//a[text()='Support Type']")
	WebElement SupportTypeSubModule;
	@FindBy(xpath = "//input[@id='settings_supporttype_supporttypename']")
	WebElement EnterSupportTypeNameField;
	@FindBy(xpath = "//input[@id='settings_supporttype_description']")
	WebElement EnterSupportTypeDescField;

	// Role
	@FindBy(xpath = "//a[text()='Role']")
	WebElement RoleSubModule;
	@FindBy(xpath = "//input[@id='settings_role_rolename']")
	WebElement EnterRoleNameField;
	@FindBy(xpath = "//input[@id='settings_role_description']")
	WebElement EnterRoleDescField;
	@FindBy(xpath = "//select[@id='settings_role_supporttype']")
	WebElement SelectSupportType;

	public WebElement SettingsModule() {
		return SettingsModule;
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

	public WebElement searchField() {
		return searchField;
	}

	public WebElement statusBtn() {
		return statusBtn;
	}

	public WebElement editBtn() {
		return editBtn;
	}

	public WebElement deleteBtn() {
		return deleteBtn;
	}

	public WebElement cnfrmYesBtn() {
		return cnfrmYesBtn;
	}

	public WebElement entrySearched() {
		return entrySearched;
	}

	public WebElement entrydescSearched() {
		return entrydescSearched;
	}

	public WebElement noentryFound() {
		return noentryFound;
	}

	public WebElement HomeBtn() {
		return HomeBtn;
	}

	public WebElement AddNew() {
		return AddNew;
	}
	
	
	public WebElement CourseSubModule() {
		return CourseSubModule;
	}


	public WebElement EnterCourseNameField() {
		return EnterCourseNameField;
	}

	public WebElement EnterCourseDescField() {
		return EnterCourseDescField;
	}
	
	public WebElement InstitutionSubModule() {
		return InstitutionSubModule;
	}


	public WebElement EnterInstitutionNameField() {
		return EnterInstitutionNameField;
	}

	public WebElement EnterInstitutionDescField() {
		return EnterInstitutionDescField;
	}
	
	public WebElement OrganisationSubModule() {
		return OrganisationSubModule;
	}


	public WebElement EnterOrganisationNameField() {
		return EnterOrganisationNameField;
	}

	public WebElement EnterOrganisationDescField() {
		return EnterOrganisationDescField;
	}
	
	public WebElement SupportTypeSubModule() {
		return SupportTypeSubModule;
	}


	public WebElement EnterSupportTypeNameField() {
		return EnterSupportTypeNameField;
	}

	public WebElement EnterSupportTypeDescField() {
		return EnterSupportTypeDescField;
	}
	
	public WebElement RoleSubModule() {
		return RoleSubModule;
	}


	public WebElement EnterRoleNameField() {
		return EnterRoleNameField;
	}

	public WebElement EnterRoleDescField() {
		return EnterRoleDescField;
	}
	
	public WebElement SelectSupportType() {
		return SelectSupportType;
	}
}
