package company_admin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignAttendance {
	WebDriver driver;

	public AssignAttendance(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	// Side span Title

	@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[6]/div/ul/li[3]/a/span")
	WebElement AssignAttendanceSideSpan;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div[1]/div/h3")
	WebElement assignAttendanceTitlElement;

	// Field locators

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[1]/div/input")
	WebElement titlElement;

	@FindBy(xpath = "//input[@id='example-text-input']")
	WebElement latlongElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[5]/div/input")
	WebElement addressElement;

	@FindBy(xpath = "//option[contains(text(),'Fuad: 01711000000')]")
	WebElement selectUserElement;

	// Button Attributes or locators

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[2]/div/div/div[2]/button[1]")
	WebElement submitBTN;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[2]/div/div/div[2]/button[2]")
	WebElement cancelBTN;
	
	//Method of AssignAttendanceSidespan
	public void AssignAttendanceSidespan() {
		AssignAttendanceSideSpan.isDisplayed();
		System.out.println("Assign Attendance");
	}
	//Method of AssignAttendanceTitle
	public void AssignAttendanceTITLE() {
		assignAttendanceTitlElement.isDisplayed();
		System.out.println("Assign Attendance");
	}
	// AssignAttendance button
	public void AssignAttends() {

		AssignAttendanceSideSpan.click();
	}
	//Web fields
	public void fields(String title, String latlongs, String address) {

		titlElement.sendKeys(title);
		latlongElement.sendKeys(latlongs);
		addressElement.sendKeys(address);

	}
	//Select button
	public void select() {
		selectUserElement.click();
	}
	//Submit button
	public void suBmit() {
		submitBTN.click();
	}
	//Cancel button
	public void cancel() {
		cancelBTN.click();
	}

}
