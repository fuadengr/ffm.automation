package superadminpomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListCompaniesPom {
	
WebDriver driver;
	
	//Browser Elements
	
		public ListCompaniesPom(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);

		}

		// SideBarTitleLocators

		@FindBy(xpath = "//div[@id='kt_aside_menu']/ul/li[4]/div/ul/li[2]/a/span")
		WebElement ListCompaniesSideSpan;
		
		@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/h3")
		WebElement companyListTitlElement;
		
		@FindBy(xpath = "//*[@id=\"kt_table_1\"]/thead/tr/th[1]")
		WebElement SlNoSpan;
		
		@FindBy(xpath = "//*[@id=\"kt_table_1\"]/thead/tr/th[2]")
		WebElement nameTitle;
		
		@FindBy(xpath = "//*[@id=\"kt_table_1\"]/thead/tr/th[3]")
		WebElement AddressTitle;
		
		@FindBy(xpath = "//*[@id=\"kt_table_1\"]/thead/tr/th[4]")
		WebElement TinNumberTitle;
		
		@FindBy(xpath = "//*[@id=\"kt_table_1\"]/thead/tr/th[5]")
		WebElement ActionTitle;
		
		@FindBy(xpath = "/html/body/div[163]/div/div/div[2]/h4")
		WebElement AreYouSureTitle;
		
		//Button Locator or Attributes
		
		@FindBy(xpath = "//*[@id=\"kt_table_1\"]/tbody /tr[3]/td[5]/button[1]")
		WebElement editBtnElement;
		
		@FindBy(xpath = "//*[@id=\"kt_table_1\"] //tbody/tr[3]/td[5]/button[2]") 
		WebElement deletebtnElement;
		
		@FindBy(xpath = "//body/div[163]/div[1]/div[1]/div[3]/button[2]")
		WebElement confirmBtnElement;
		
		@FindBy(xpath = "/html/body/div[163]/div/div/div[3]/button[1]")
		WebElement closeBtElement;
		
		/* @FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/div/div[1]/div[2]/div/div/a")
		WebElement addNewCompanyElement; */
		

		//For Display
		 
		 public void Displayed() {
			 
			 ListCompaniesSideSpan.isDisplayed();
			 System.out.println("List Companies");
			 companyListTitlElement.isDisplayed();
			 System.out.println("Company List");
			 SlNoSpan.isDisplayed();
			 nameTitle.isDisplayed();
			 AddressTitle.isDisplayed();
			 TinNumberTitle.isDisplayed();
			 ActionTitle.isDisplayed();
			 AreYouSureTitle.isDisplayed();
			 
		 }

		 //ButtonWorks
		 
		 public void listcompany() {
			 ListCompaniesSideSpan.click();
				
			}

			public void companyListEdit() {

				editBtnElement.click();
			}
			public void DeleteCompany() {
				deletebtnElement.click();

			}

			public void confirmButton() {

				confirmBtnElement.click();
			}

			public void closeButton() {

				closeBtElement.click();
			}
			/* public void AddNewCompany() {

				addNewCompanyElement.click();
			} */
		
		
		
		
}
