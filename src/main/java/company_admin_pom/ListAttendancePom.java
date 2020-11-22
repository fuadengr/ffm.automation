package company_admin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListAttendancePom {

	WebDriver driver;

	public ListAttendancePom(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// sidebar and title locators

	@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[6]/div/ul/li[2]/a/span")
	WebElement listAttendancesidespanElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div[1]/div[1]/h3")
	WebElement attendancelistTitlElement;

	// Button attributes or locators

	@FindBy(xpath = "////td[text()='159']/following::td[4] /a")
	WebElement updateBTN;

	@FindBy(xpath = "//td[text()='159']/following::td[5] /a")
	WebElement detailsBTN;

	// Update Attendance Title, Fields and Buttons

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div[1]/div/h3")
	WebElement updateAttendanceTitlElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[1]/input")
	WebElement titlElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[3]/input")
	WebElement lattitudElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[4]/input")
	WebElement longitudElement;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/div[5]/input")
	WebElement addressElement;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	WebElement submitElement;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancElement;

	// Delete task's buttons

	@FindBy(xpath = "//button[contains(text(),'Delete Task')]")
	WebElement deleteBTN;

	@FindBy(xpath = "//button[contains(text(),'Close')]")
	WebElement closeBTN;

	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	WebElement confirmBTN;

	// Map Elements

	// Map Terrain

	@FindBy(xpath = "//label[contains(text(),'Terrain')]")
	WebElement mapTerrainElement;

	// Satelite

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div/div[9]/div[2]/div[1]")
	WebElement satelite;

	// Satelite labels

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div/div[9]/div[2]/div[2]/div")
	WebElement sateliteLabelsElement;

	// Map Maximize

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div/button")
	WebElement mapMaximizElement;

	// Map zoom in zoom out

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div/div[8]/div[1]/div/button[1]")
	WebElement zoomIN;

	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div/div[8]/div[1]/div/button[2]")
	WebElement zoomOUT;
	//Method of ListAttendanceSidespan
	public void ListAttendanceSidespan() {
		listAttendancesidespanElement.isDisplayed();
		System.out.println("List Attendance");
	}
	//Method of AttendanceListTITLE
	public void AttendanceListTITLE() {
		attendancelistTitlElement.isDisplayed();
		System.out.println("Attendance List");
	}
	
	//AttendanceList button
	public void attendancelistside() {
		listAttendancesidespanElement.click();
	}
	//Update button
	public void uPdateBTN() {
		updateBTN.click();
	}
	//Update fields and send keys
	public void upDatefields(String title) {
		titlElement.clear();
		titlElement.sendKeys(title);
	}
	//Latitude field and send keys
	public void latitude(String lat) {
		lattitudElement.clear();
		lattitudElement.sendKeys(lat);
	}
	//Longitude field and send keys
	public void longitude(String Long) {
		longitudElement.clear();
		longitudElement.sendKeys(Long);
	}
	//Address field and send keys
	public void addres(String add) {
		addressElement.clear();
		addressElement.sendKeys(add);

	}
	//Submit button
	public void SubmitBtn() {

		submitElement.click();

	}
	//Cancel button
	public void cancel() {
		cancElement.click();
	}
	//Details button
	public void detail() {
		detailsBTN.click();
	}
	//Delete button
	public void delete() {
		deleteBTN.click();
	}
	//Confirm button
	public void confirm() {
		confirmBTN.click();
	}
	//Close button
	public void close() {
		closeBTN.click();
	}
	//Map terrain button
	public void mapTerrain() {
		mapTerrainElement.click();
	}
	//Satelite button
	public void sateliTe() {
		satelite.click();
	}
	//sateliteLabelsElement button
	public void sateliteBTN() {
		sateliteLabelsElement.click();
	}
	//Map maximize button
	public void mapMaximize() {
		mapMaximizElement.click();
	}
	//Zoom in button
	public void zoomin() {
		zoomIN.click();
	}
	//Zoom out button
	public void zoomout() {
		zoomOUT.click();
	}

}
