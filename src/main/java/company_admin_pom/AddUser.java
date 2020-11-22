package company_admin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser {
	WebDriver driver;

	public AddUser(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

//sidebar and title span
	@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[3]/a/span")
	WebElement addusersidebarElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div[1]/div/h3")
	WebElement titlElement;

//Field elements

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div/div[1]/input")
	WebElement firstNamElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div/div[2]/input")
	WebElement lastNamElement;

	@FindBy(xpath = "//option[contains(text(),'+88')]")
	WebElement isoCodElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div/div[3]/div/div[2]/input")
	WebElement phonElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div/div[4]/input")
	WebElement departElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div/div[5]/input")
	WebElement designationElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div/div[6]/input")
	WebElement nIDeElement;

// Button attributes or locators

	@FindBy(xpath = "//button[contains(text(),'Add')]")
	WebElement addBtnElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div/div[7]/div/button[2]")
	WebElement backBtnElement;

	// Method of addUserSidespan
	public void AddUserSidespan() {
		addusersidebarElement.isDisplayed();
		System.out.println("Add User");
	}
	//Method of addUserTitle
	public void AddUserTITLE() {
		titlElement.isDisplayed();
		System.out.println("Add User");
	}
	//Web fields
	public void field(String fname, String lname, String pnumber, String department, String designation, String NID) {

		firstNamElement.sendKeys(fname);
		lastNamElement.sendKeys(lname);
		phonElement.sendKeys(pnumber);
		departElement.sendKeys(department);
		designationElement.sendKeys(designation);
		nIDeElement.sendKeys(NID);

	}
	//AdduserSidespan button
	public void addusersideBTN() {
		addusersidebarElement.click();
	}
	//Iso code button
	public void iso() {
		isoCodElement.click();
	}
	//Add button
	public void add() {
		addBtnElement.click();
	}
	//Back button
	public void back() {
		backBtnElement.click();
	}

}
