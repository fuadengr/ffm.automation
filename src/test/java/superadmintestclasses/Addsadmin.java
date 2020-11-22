package superadmintestclasses;

import org.testng.annotations.Test;

import company_admin_testClasses.BrowserFactory;
import superadminpomclasses.AddSuperAdmin;
import superadminpomclasses.Login_pom;

import org.testng.annotations.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Addsadmin {
	WebDriver driver;
	
	Login_pom login;
	
	AddSuperAdmin addadmin;
	
	@BeforeClass
	  public void beforeClass() {
		driver = BrowserFactory.startBrowser(driver, "Chrome", "http://104.248.53.138/");
		
		//Step 1: Techserve4u admin login
		
		login= new Login_pom(driver);
		
		login.LoginSuperAdmin("Fuad.shetty@email.com", "fuad1122");
		
	  }
	
  @Test
  public void AddSuperAdmin() {
	  
	//Step 2: Add super admin
	  
	  addadmin = new AddSuperAdmin(driver);
	  addadmin.Addsupadmin();
	  addadmin.RegisterAdmin("Mr", "ahmed", "fuad.ahmed@google.com", "fuad1122");
	  addadmin.RegBtn();
	  
  }
  

  @AfterClass
  public void afterClass() {
	  
	//Step 3: Quit browser
	  
	  BrowserFactory.quitBrowser(driver);
  }

}
