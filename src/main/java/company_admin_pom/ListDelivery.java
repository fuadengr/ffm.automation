package company_admin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListDelivery {
	WebDriver driver;

	public ListDelivery(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	// side bar and titles

	@FindBy(xpath = "//span[contains(text(),'List Delivery')]")
	WebElement listdeliverySidespanElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div[1]/div[1]/h3")
	WebElement DeliverylistTitle;

	// Button attributes or locators

	@FindBy(xpath = "//td[text()='145']/following::td[5] /a")
	WebElement UpdateBTN;

	@FindBy(xpath = "//td[text()='145']/following::td[6] /a")

	WebElement detailsbuttonElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[2]/div/button[1]")
	WebElement submitbtn;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[2]/div/button[2]")
	WebElement cancelbtn;

	@FindBy(xpath = "//button[contains(text(),'Delete Task')]")
	WebElement deletetask;

	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	WebElement confirmBtn;

	@FindBy(xpath = "///button[contains(text(),'Close')]")
	WebElement closebtN;

	// Field locators

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[1]/input")
	WebElement titElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[3]/input")
	WebElement assignLatElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[4]/input")
	WebElement assignlongiElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[5]/input")
	WebElement clientaddElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[6]/input")
	WebElement clientnamElement;
	//ListSidespan button
	public void listSidespan() {

		listdeliverySidespanElement.click();
	}
	//ListDelivery button
	public void listDelivery() {

		detailsbuttonElement.click();

	}
	//Method of listSidespanDisplay
	public void listsidespanDisplay() {

		listdeliverySidespanElement.isDisplayed();
		System.out.println("List Delivery");

	}
	//Method of deliverListdisplay
	public void deliverListDisplay() {

		DeliverylistTitle.isDisplayed();
		System.out.println("Delivery List");
	}
	//Update button
	public void UpdatebtN() {
		UpdateBTN.click();
	}
	//Web fields
	public void assigndeliveryUpdate(String title, String lat, String Long, String cliendAd, String clientnam) {

		titElement.clear();
		titElement.sendKeys(title);
		assignLatElement.clear();
		assignLatElement.sendKeys(lat);
		assignlongiElement.clear();
		assignlongiElement.sendKeys(Long);
		clientaddElement.clear();
		clientaddElement.sendKeys(cliendAd);
		clientnamElement.clear();
		clientnamElement.sendKeys(clientnam);

	}
	//Submit button
	public void sbmtBTN() {
		submitbtn.click();
	}
	//Cancel button
	public void cancel() {
		cancelbtn.click();
	}
	//Delete button
	public void delete() {
		deletetask.click();
	}
	//Confirm button
	public void confirm() {
		confirmBtn.click();
	}
	//Close button
	public void close() {
		closebtN.click();
	}

}
