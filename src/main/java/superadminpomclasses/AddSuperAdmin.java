package superadminpomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSuperAdmin {

	WebDriver driver;

	// Browser Elements

	public AddSuperAdmin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// SideBarTitleLocators

	@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")
	WebElement AddSuperAdminSideSpan;

	// RegisterAdmin Title Locators

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/h3")
	WebElement registerAdminTitlElement;

	// field locators/attributes
	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/input")
	WebElement firstNamElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[2]/input")
	WebElement lastName;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[3]/input")
	WebElement emailAddress;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[4]/input")
	WebElement passElement;

	@FindBy(xpath = "//button[contains(text(),'Register')]")
	WebElement registerButtonElement;
	
	//List of displays
	
	public void AddSuperadminSidespan() {
		AddSuperAdminSideSpan.isDisplayed();
			System.out.println("Add Super Admin");
		}

		public void RegisterAdminTITLE() {
			registerAdminTitlElement.isDisplayed();
			System.out.println("Register Admin");
		}
		//Web fields
	public void RegisterAdmin(String firstname, String Lstname, String email, String Pwd) {
		
		
		
		firstNamElement.sendKeys(firstname);
		lastName.sendKeys(Lstname);
		emailAddress.sendKeys(email);
		passElement.sendKeys(Pwd);
		
		
	}
	//Addsuper admin button
	public void Addsupadmin() {
		AddSuperAdminSideSpan.click();
	}
	//Register button
	public void RegBtn() {
		registerButtonElement.click();
	}
	
}
