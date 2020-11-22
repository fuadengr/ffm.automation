package company_admin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyaAdminList {

	WebDriver driver;

	public CompanyaAdminList(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Company admin list side bar span

	@FindBy(xpath = "//span[contains(text(),'Company Admin List')]")
	WebElement companyAdminListSpanElement;

	// company admin list Title bar span
	@FindBy(xpath = "//h3[contains(text(),'Company Admin List')]")
	WebElement companyadminlistTitlElement;

	// sl NO
	@FindBy(xpath = "//th[contains(text(),'SL No')]")
	WebElement slNoElement;

	// Name Bar
	@FindBy(xpath = "//*[@id=\"kt_table_1\"]/thead/tr/th[2]")
	WebElement namElement;

	// Email bar
	@FindBy(xpath = "//*[@id=\"kt_table_1\"]/thead/tr/th[3]")
	WebElement emaiElement;

	// Action bar
	@FindBy(xpath = "//*[@id=\"kt_table_1\"]/thead/tr/th[4]")
	WebElement actElement;

	// AreYouSure pop out bar
	@FindBy(xpath = "//h4[contains(text(),'Are You Sure ?')]")
	WebElement Areyousure;

	// Button attributes Or Locators
	// DeleteBTN
	@FindBy(xpath = "//*[@id=\"kt_table_1\"]/tbody/tr/td[4]/button")
	WebElement deleteBtnElement;

	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	WebElement confirmElement;

	@FindBy(xpath = "//button[contains(text(),'Close')]")
	WebElement closElement;

	// ListBar and Title's displaying

	public void CompanyAdminListSidespan() {
		companyAdminListSpanElement.isDisplayed();
		System.out.println("Company Admin List");
	}

	public void CompanyAdminListTITLE() {
		companyadminlistTitlElement.isDisplayed();
		System.out.println("Company Admin List");
	}
	//CompanyadminList button
	public void companyAdminList() {

		companyAdminListSpanElement.click();

	}
	//Delete button
	public void Deletebtn() {
		deleteBtnElement.click();
	}
	//Confirm button
	public void confirm() {
		confirmElement.click();
		
	}
	//Close button
	public void close() {
		closElement.click();
	}
	
}
