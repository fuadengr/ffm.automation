package company_admin_testClasses;

import org.testng.annotations.Test;

import company_admin_pom.AssignTask;
import company_admin_pom.Company_admin_login_pom;

import org.testng.annotations.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class AssignTaskTest {
	WebDriver driver;
	Company_admin_login_pom login;
	
	AssignTask At;
	
	
	@BeforeClass
	  public void beforeClass() {
		driver = BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");
		
		//Step 1: Company admin login
		
		login= new Company_admin_login_pom(driver);
		
		login.LogincompanyAdmin("california@yahoo.com", "1asdf234");
		
		
	  }
	
  @Test
  public void AddNewTask() {
	  
	  //Step 2: Assigning task
	  At = new AssignTask(driver);											
	  At.assigntaskbtn();
	  
	  At.AddTask("IOS APP", "Dhaka");
	  
	  //At.AddTasks("Dhaka Airport");
	  At.paid();
	  
	  At.latlong("23.846284264771757, 90.40215080671602");						//23.846284264771757, 90.40215080671602
	  At.selectUSer();
	  At.Submit();
  }
  

  @AfterClass
  public void afterClass() {
	  
	  //Step 3: Quit browser
	  
	  BrowserFactory.quitBrowser(driver);
  }

}
