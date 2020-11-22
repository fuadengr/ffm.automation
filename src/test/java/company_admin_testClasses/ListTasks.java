package company_admin_testClasses;

import org.testng.annotations.Test;

import company_admin_pom.ListTask;
import company_admin_pom.Company_admin_login_pom;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class ListTasks {

	WebDriver driver;
	
	Company_admin_login_pom login;

	ListTask lt;

	@BeforeClass
	public void beforeClass() {
		driver= BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");
		
		//Step 1: Company admin login
		
		login = new Company_admin_login_pom(driver);
		
		login.LogincompanyAdmin("california@yahoo.com", "1asdf234");
		
	}

	@Test
	public void ListTASK() {
		
		//Step 2: To view list task and delete the task
		
			lt = new ListTask(driver);
			
			lt.listTaskside();
			
			lt.detailBtn();
			
			lt.delete();
			
			lt.close();
	}

	@AfterClass
	public void afterClass() {
		
		//Step 3: Quit browser
		
		BrowserFactory.quitBrowser(driver);
	}
	

}
