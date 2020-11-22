package company_admin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignDeliverypom {

	WebDriver driver;

	public AssignDeliverypom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// side bar and title

	@FindBy(xpath = "//span[contains(text(),'Assign Delivery')]")
	WebElement assigndeliverysideSpanElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div[1]/div/h3")
	WebElement assigndeliveryTitle;

	// Field elements attributes or locators

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[1]/div/input")
	WebElement titlElement;

	@FindBy(xpath = "//option[contains(text(),'Yes')]")
	WebElement paidTaskYesElement;

	@FindBy(xpath = "//option[contains(text(),'No')]")
	WebElement paidTaskNO;

	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/input[1]")
	WebElement billAmountElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[5]/div //*[@id=\"example-text-input\"]")
	WebElement latlongElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[7]/div/input")
	WebElement clientaddElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[8]/div/input")
	WebElement clientNamElement;

	@FindBy(xpath = "//option[contains(text(),'Fuad: 01711000000')]")
	WebElement selecTuserElement;

	// Button Attributes or locators

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	WebElement SubmitBTN;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement canceLBTN;
	
	//Method of assigndeliverySideDisplay

	public void assigndeliverySideDisplay() {

		assigndeliverysideSpanElement.isDisplayed();
		System.out.println("Assign Delivery");

	}
	//Method of assigndeliveryTitleDisplay
	public void assignDeliveryTitleDisplay() {
		assigndeliveryTitle.isDisplayed();
		System.out.println("Assign Delivery");
	}
	
	//Method of assignDelivery button
	public void assignDelivery() {
		assigndeliverysideSpanElement.click();
	}
	 
	//Web fields method
	public void fields(String ttl, String bill, String latlong, String clientad, String clientnam) {

		titlElement.sendKeys(ttl);
		billAmountElement.sendKeys(bill);
		latlongElement.sendKeys(latlong);
		clientaddElement.sendKeys(clientad);
		clientNamElement.sendKeys(clientnam);

	}
	//Method of paidTaskYes button
	public void paidTaskYes() {
		paidTaskYesElement.click();
	}
	
	//Method of paidTaskNO button
	public void paidTaskNO() {
		paidTaskNO.click();
	}
	//Method of select user button
	public void selectUsr() {
		selecTuserElement.click();
	}
	//Submit button
	public void sbmit() {
		SubmitBTN.click();
	}
	//Cancel button
	public void cancel() {
		canceLBTN.click();
	}
}
