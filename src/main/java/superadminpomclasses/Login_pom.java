package superadminpomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login_pom {

	WebDriver driver;
	
	//Attributes or locators
	
	@FindBy(id = "login")
	WebElement UserEmail;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(xpath = "//*[@id=\"formContent\"]/form/input[3]")
	WebElement LoginButton;

	@FindBy(xpath = "//*[@id=\"formContent\"]/div/h3")
	WebElement FFMadminpanelTitle;
	//Initializing driver
	public Login_pom(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	//Methods of displays
	public void FFmAdminPanelTitledisplay() {

		FFMadminpanelTitle.isDisplayed();
		System.out.println("FFM admin Panel");

		/*
		 * try { FFMadminpanelTitle.isDisplayed();
		 * 
		 * System.out.println("FFM Admin Panel");
		 * 
		 * } catch (NoSuchElementException e) {
		 * 
		 * System.out.println("Title not exist"); }
		 */
	}
	//Web fields and buttons
	public void LoginSuperAdmin(String Email, String password) {

		UserEmail.sendKeys(Email);
		Password.sendKeys(password);
		LoginButton.click();

	}

}
