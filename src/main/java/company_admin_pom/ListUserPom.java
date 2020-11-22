package company_admin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListUserPom {

	WebDriver driver;

	public ListUserPom(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// side bar and title locator

	@FindBy(xpath = "//span[contains(text(),'List User')]")
	WebElement listusersidespanElement;

	@FindBy(xpath = "//h3[contains(text(),'User List')]")
	WebElement userListTitElement;

	// button attributes or locators

	@FindBy(xpath = "//td[text()='2020-11-05T04:31:24.171Z']/following::td[4]/button[1]")
	WebElement editBTN;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div/div[7]/div/button")
	WebElement insideEditBtnElement;

	@FindBy(xpath = "//*[@id=\"kt_table_1\"]/tbody/tr[1]/td[8] /button[2]")
	WebElement deleteBTN;

	@FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[3] /button[2]")
	WebElement confirmBTN;

	@FindBy(xpath = "//body/div[5]/div[1]/div[1]/div[3] /button[1]")
	WebElement CloseBTN;

	// Edit Fields locators or attributes

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div/div[1]/input")
	WebElement firstNamElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div/div[2]/input")
	WebElement lastNamElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div/div[3]/input")
	WebElement phNumberElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div/div[4]/input")
	WebElement departmentElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div/div[5]/input")
	WebElement designation;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div/div[6]/input")
	WebElement NID;
	
	//Methods of displays
	public void ListUserSidespan() {
		listusersidespanElement.isDisplayed();
		System.out.println("List User");
	}

	public void UserListTITLE() {
		userListTitElement.isDisplayed();
		System.out.println("User List");
	}
	
	//Web fields
	public void Fnameedit(String FirstField) {
		firstNamElement.clear();
		firstNamElement.sendKeys(FirstField);
	}

	public void Lnameedit(String LastField) {												
		lastNamElement.clear();
		lastNamElement.sendKeys(LastField);
	}

	public void FnamEdi() {
		firstNamElement.clear();
	}

	public void LnameEdi() {
		lastNamElement.clear();
	}
	//ListUserSide button
	public void listUserSide() {
		listusersidespanElement.click();
	}
	//Edit button
	public void edit() {
		editBTN.click();
	}
	//Inside edit button
	public void insideEditbtn() {
		insideEditBtnElement.click();
	}
	//Delete button
	public void delete() {
		deleteBTN.click();
	}
	//Confirm button
	public void confirmBTN() {
		confirmBTN.click();
	}
	//Close button
	public void closeButtoN() {
		CloseBTN.click();
	}
}
