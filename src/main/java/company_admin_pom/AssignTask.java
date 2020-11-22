package company_admin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignTask {
	WebDriver driver;

	public AssignTask(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

//Sidebar and title

	@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[3]/a/span")
	WebElement assigntasksidElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div[1]/div/h3")
	WebElement assignNewTaskElement;

//Field locators or attributes

	@FindBy(xpath = "//*[@id=\"example-text-input\"]")
	WebElement titlElement;

	@FindBy(xpath = "//*[@id=\"exampleSelect1\"]/option[3]")
	WebElement paidElement;

	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1] //*[@id=\"example-text-input\"]")
	WebElement addressElement;

	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/input[1]")
	WebElement latlongElement;

	@FindBy(xpath = "//option[contains(text(),'Fuad: 01711000000')]")
	WebElement userElement;

//Button Attributes or locators

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[2]/div/div/div[2]/button[1]")
	WebElement buttonElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[2]/div/div/div[2]/button[2]")
	WebElement cancelBTN;

	//Method of AssignTaskSidespan
	public void AssignTaskSidespan() {
		assigntasksidElement.isDisplayed();
		System.out.println("Assign Task");
	}
	//Method of AssignNewTaskTITLE
	public void AssignNewTaskTITLE() {
		assignNewTaskElement.isDisplayed();
		System.out.println("Assign New Task");
	}
	
	//web fields
	public void AddTask(String title,  String addres) {

		titlElement.sendKeys(title);
		addressElement.sendKeys(addres);
	}

	
	//select user button
	public void selectUSer() {
		userElement.click();
	}
	//assigntasksSideelement button
	public void assigntaskbtn() {
		assigntasksidElement.click();
	}
	//LatLong fields
	public void latlong(String lattitudeLongitude) {
		latlongElement.sendKeys(lattitudeLongitude);
	}
	//Paid button
	public void paid() {
		paidElement.click();
	}
	//Submit button
	public void Submit() {
		buttonElement.click();
	}
	//Cancel button
	public void cancel() {
		cancelBTN.click();
	}

}
