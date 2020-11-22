package superadminpomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListCompanyAdminPom {

	WebDriver driver;

	// Side bar

	@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[2]/a/span")
	WebElement listcompanyadminsidepanElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/h3")
	WebElement companyAdminlisttitlElement;

	// Button Attributes or locators

	@FindBy(xpath = "//td[text() = \"airpostedus4rr@gmail.com\"]/following::td[2]")
	WebElement deletElement;

	@FindBy(xpath = "//body[1]/div[155]/div[1]/div[1]/div[3]/button[1]")
	WebElement closElement;

	@FindBy(xpath = "//body[1]/div[155]/div[1]/div[1]/div[3]/button[2]")
	WebElement confirmElement;
	
	//Initializing driver
	
	
	public ListCompanyAdminPom(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	//Methods for displays
	
	public void display() {

		listcompanyadminsidepanElement.isDisplayed();
		System.out.println("List Company Admin");
	}

	public void displayTitle() {

		companyAdminlisttitlElement.isDisplayed();
		System.out.println("Company Admin List");
	}
	//ListCompanyAdminSideBar button
	public void listCadminSidebar() {

		listcompanyadminsidepanElement.click();
	}
	//Delete button
	public void Delete() {

		deletElement.click();

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
