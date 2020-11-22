package company_admin_testClasses;

import org.testng.annotations.Test;

import company_admin_pom.AssignAttendance;
import company_admin_pom.Company_admin_login_pom;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class AssignAttenDance {
	WebDriver driver;
	Company_admin_login_pom login;
	AssignAttendance AD;
	
	@BeforeClass
	  public void beforeClass() {
		driver= BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");
		//Step 1: Company admin login
		
		login = new Company_admin_login_pom(driver);
		login.LogincompanyAdmin("california@yahoo.com", "1asdf234");
	  }

	
  @Test
  public void AddAttendance() {
	//Step 2: Assigning attendance
	  
	  AD = new AssignAttendance(driver);
	  AD.AssignAttends();
	  AD.fields("QA", "23.81045705068642, 90.51847944259488", "London UK");
	  AD.select();
	  AD.suBmit();
  }
  
  @AfterClass
  public void afterClass() {
	//Step 3: Quit browser
	  
	  BrowserFactory.quitBrowser(driver);
  }

}
