package superadminpomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListSuperAdminPagePom {

	WebDriver driver;

	// Browser Elements

	public ListSuperAdminPagePom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Button Locators

	@FindBy(xpath = "//td[text()=\"llwatkins81@gmail.com\"]/following::td[1]") // xpath of specific email's delete
																				// button.
	WebElement DeleteButton;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div/div[1]/div[2]/div/div/a")
	WebElement addSuperAdminButtonElement;

	@FindBy(xpath = "//body/div[125]/div[1]/div[1]/div[3] /button[2]")
	WebElement confirmButtonElement;

	@FindBy(xpath = "//body/div[125]/div[1]/div[1]/div[3] //button[1]")
	WebElement closeButtonElement;

	// SideBarTitleLocators

	@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[2]/a/span")
	WebElement listSuperAdminSpan;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/h3")
	WebElement SuperAdminListSpan;

	@FindBy(xpath = "//*[@id=\"kt_table_1\"]/thead/tr/th[1]")
	WebElement SlNoSpan;

	@FindBy(xpath = "//*[@id=\"kt_table_1\"]/thead/tr/th[2]")

	WebElement NameTitleSpan;

	@FindBy(xpath = "//*[@id=\"kt_table_1\"]/thead/tr/th[3]")

	WebElement emailTitleSpan;

	@FindBy(xpath = "//*[@id=\"kt_table_1\"]/thead/tr/th[4]")
	WebElement ActionTitleSpan;

	// For Display

	public void ListSuperAdminSidespan() {
		listSuperAdminSpan.isDisplayed();
		System.out.println("List Super Admin");
	}

	public void ListSuperAdminTITLE() {
		SuperAdminListSpan.isDisplayed();
		System.out.println("Super Admin List");
	}

	//ListSuperAdmin button

	public void listSuperAdminButton() {
		listSuperAdminSpan.click();

	}
	//AddSuperAdmin button
	public void addSuperAdminButtonElement() {

		addSuperAdminButtonElement.click();
	}
	//Delete button
	public void DeleteButton() {
		DeleteButton.click();

	}
	//Confirm button
	public void confirmButtonElement() {

		confirmButtonElement.click();
	}
	//Close button
	public void closeButtonElement() {

		closeButtonElement.click();
	}

}
