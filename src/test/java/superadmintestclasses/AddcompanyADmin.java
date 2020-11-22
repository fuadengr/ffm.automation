package superadmintestclasses;

import org.testng.annotations.Test;

import company_admin_testClasses.BrowserFactory;
import superadminpomclasses.AddCompanyAdmin;
import superadminpomclasses.Login_pom;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class AddcompanyADmin {
  WebDriver driver;
  Login_pom login;
  AddCompanyAdmin cadmin;
  
	@BeforeClass
	  public void beforeClass() {
		driver= BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");
		
		//Step 1: Techserve4u admin login
		
		login= new Login_pom(driver);
		login.LoginSuperAdmin("Fuad.shetty@email.com", "fuad1122");
		
	  }

	
	
	
	@Test
  public void Add_company() {
		
		//Step 2: Add company admin
		
		cadmin= new AddCompanyAdmin(driver);
		cadmin.addcomAdminBtn();
		cadmin.registerAdminfields("Fuad", "Ahmed", "fuadengr", "fuad@outlook.com", "fuad1122");
		cadmin.select();
		cadmin.Register();
  }
  
  @AfterClass
  public void afterClass() {
	  
	//Step 3: Quit browser
	  
	  BrowserFactory.quitBrowser(driver);
  }

}
