package company_admin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Company_admin_login_pom {

	WebDriver driver;
	//Fields locator
	@FindBy(id = "login")
	WebElement UserEmail;

	@FindBy(id = "password")
	WebElement Password;
	//Button Locator
	
	@FindBy(xpath = "//*[@id=\"formContent\"]/form/input[3]")
	WebElement LoginButton;

	//initializing the driver
	public Company_admin_login_pom(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	//Web fields and send keys
	public void LogincompanyAdmin(String Email, String password) {

	/*{

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		UserEmail.sendKeys(Email);
		Password.sendKeys(password);
		LoginButton.click();

	}

}
