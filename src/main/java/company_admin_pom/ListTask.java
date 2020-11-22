package company_admin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListTask {
WebDriver driver;

public ListTask(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	
}
//sidebar and title locator


@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[2]/a/span")
WebElement listtasksidespanElement;

@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/h3")
WebElement tasklistTitlElement;

//Button attribues or locators

@FindBy(xpath = "//td[text()='176']/following::td[6] /a")
WebElement detailsBTN;

@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div/div/div/div/div[1]/div[2]/div/button")
WebElement deletetaskbtnElement;

@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[3] /button[2]")
WebElement confirmBTN;

@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[3] /button[1]")
WebElement closeBTnElement;

//Methods of displays

public void ListTaskSidespan() {
	listtasksidespanElement.isDisplayed();
	System.out.println("List Task");
}

public void TaskListTITLE() {
	tasklistTitlElement.isDisplayed();
	System.out.println("Task List");
}
//ListTaskSide button
public void listTaskside() {
	listtasksidespanElement.click();
	
}
//Details button
public void detailBtn() {
	detailsBTN.click();
}
//Delete button
public void delete() {
	deletetaskbtnElement.click();
}
//Confirm button
public void confirm() {
	confirmBTN.click();
}
//Close button
public void close() {
	closeBTnElement.click();
}

}
