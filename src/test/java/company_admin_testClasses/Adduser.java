package company_admin_testClasses;

import org.testng.annotations.Test;

import company_admin_pom.AddUser;
import company_admin_pom.Company_admin_login_pom;


import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Adduser {
	WebDriver driver;
	Company_admin_login_pom login;
	AddUser adding;
	
	@BeforeClass
	  public void beforeClass() {
		driver= BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");
		
		//Step 1: Company admin login
		
		login= new Company_admin_login_pom(driver);
		
		login.LogincompanyAdmin("california@yahoo.com", "1asdf234");
		
	  }

  @Test
  public void AddingUsers() {
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //Step 2:  Adding user
	  
	  adding= new AddUser(driver);
	  adding.addusersideBTN();
	  adding.iso();
	  adding.field("Fuad", "Ahmed", "01711000000", "Game", "Developer", "12345678987654321");
	  //adding.add();
	  adding.back();
  }
  
  @AfterClass
  //Step 3: Quit browser
  public void afterClass() {
	  BrowserFactory.quitBrowser(driver);
  }

}
