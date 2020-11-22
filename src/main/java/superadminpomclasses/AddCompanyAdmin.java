package superadminpomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCompanyAdmin {

	WebDriver driver;
	
	//Initializing driver
	
	public AddCompanyAdmin(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	// Side span and title display

	@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[3]/a/span")
	WebElement Addcompanyadminsidespan;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/h3")
	WebElement registercompanyTitlElement;

	// Field locators or attributes

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/input")
	WebElement firstnamefieldElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[2]/input")
	WebElement lastNamElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[3]/input")
	WebElement userNamElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[4]/input")
	WebElement emailElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[5]/input")
	WebElement pwdElement;

	@FindBy(xpath = "//option[contains(text(),'Hollieeeeester')]")
	WebElement selectUserElement;

	@FindBy(xpath = "//button[contains(text(),'Register')]")
	WebElement registerBTN;
	
	//Methods of displays
	
	public void addcompanyadminsidespanDISPLAY() {
		Addcompanyadminsidespan.isDisplayed();
		System.out.println("Add Company Admin");
	}

	public void RegisterAdminTitle() {
		registercompanyTitlElement.isDisplayed();
		System.out.println("Register Company Admin");
	}
	//Web fields
	public void registerAdminfields(String fname, String lname, String uname, String emailadd, String pwd) {
		firstnamefieldElement.sendKeys(fname);
		lastNamElement.sendKeys(lname);
		userNamElement.sendKeys(uname);
		emailElement.sendKeys(emailadd);
		pwdElement.sendKeys(pwd);
		

	}
	//AddCompanyAdmin Button
	public void addcomAdminBtn() {
		Addcompanyadminsidespan.click();
	}
	//Select button
	public void select() {
		selectUserElement.click();
	}
	//Register button
	public void Register() {
		registerBTN.click();
	}

}
