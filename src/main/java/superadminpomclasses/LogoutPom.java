package superadminpomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPom {
	WebDriver driver;
	
	//Initializing driver
	
	public LogoutPom(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	// button attributes or locators

	@FindBy(xpath = "//*[@id=\"dropdown-basic-button\"]")
	WebElement abidElement;

	@FindBy(xpath = "//*[@id=\"kt_header\"]/div[2]/div/div/div //a[2]")
	WebElement log_outElement;
	//Name button
	public void nameButton() {
		abidElement.click();
	}
	//Logout button
	public void logoutBTN() {

		log_outElement.click();

	}

}
