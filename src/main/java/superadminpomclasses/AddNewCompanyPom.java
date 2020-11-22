package superadminpomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCompanyPom {

	WebDriver driver;

	// Browser Elements

	public AddNewCompanyPom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// SiteBarTitleLocator

	@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[3]/a/span")
	WebElement AddCompanySideSpan;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div[1]/div/h3")
	WebElement AddNewCompanyTitle;

	// Field Locators

	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	WebElement companyName;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[2]/input")
	WebElement companyAddress;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[5]/input")
	WebElement enterTIN;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[6]/div[1]/input")
	WebElement AttendanceSelect;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[6]/div[2]/input")
	WebElement deliverySelect;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[6]/div[3]/input")
	WebElement taskSelect;

	// Button attributes or locators

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[3]/input")
	WebElement CompanyAgreement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[4]/input")
	WebElement VerificationElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[2]/div/button")
	WebElement SubmitBTN;

	// Methods of displays

	public void AddCompaniesSidespan() {
		AddCompanySideSpan.isDisplayed();
			System.out.println("Add Companies");
		}

		public void AddNewCompanyTITLE() {
			AddNewCompanyTitle.isDisplayed();
			System.out.println("Add New Company");
		}
		//Addcompany button
	public void Addcompany() {

		AddCompanySideSpan.click();
	}
	//Web fields
	public void CompanyFields(String name, String address, String TIN) {

		companyName.sendKeys(name);
		companyAddress.sendKeys(address);
		enterTIN.sendKeys(TIN);

	}
	//Web fields
	public void AgreementVerificationField(String companyAgree, String companyVerific) {
		
		CompanyAgreement.sendKeys(companyAgree);
		
		VerificationElement.sendKeys(companyVerific);

	}
	//Agreement button
	public void Agreement() {

		CompanyAgreement.click();
	}
	//Verification button
	public void Verification() {

		VerificationElement.click();
	}
	//Select list
	public void select() {
		
		AttendanceSelect.click();
		deliverySelect.click();
		taskSelect.click();
	}
	//Submit button
	public void submitBTN() {

		SubmitBTN.click();
	}

}
