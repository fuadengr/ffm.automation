package company_admin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdatePassword {
	WebDriver driver;
	public UpdatePassword(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	//Attributes or locators 
	
	@FindBy(xpath = "//*[@id=\"kt_header\"]/div[2]/div/div/div/a[1]")
	WebElement updatePasswordElement;
	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[1]/input")
	WebElement oldPasswordElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[2]/input")
	WebElement newpasswordElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[3]/input")
	WebElement confirmPasswordElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[2]/div/button")
	WebElement UpdateBTN;
	@FindBy(xpath = "//*[@id=\"dropdown-basic-button\"]")
	WebElement nameElement;
	
	//Web fields
	
	public void Updatepassword(String old, String newp, String confirm) {

		oldPasswordElement.sendKeys(old);
		newpasswordElement.sendKeys(newp);
		confirmPasswordElement.sendKeys(confirm);

	}
	//Name button
	public void nameButton() {

		nameElement.click();
	}
	//Update password button
	public void updatepwdbtn() {
		updatePasswordElement.click();

	}
	//Update button
	public void updatebtn() {
		UpdateBTN.click();
	}
}






	

	

	