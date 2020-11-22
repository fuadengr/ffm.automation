package company_admin_testClasses;

import org.testng.annotations.Test;

import company_admin_pom.ListAttendancePom;
import company_admin_pom.Company_admin_login_pom;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class ListAttendance {
	WebDriver driver;
	Company_admin_login_pom login;
	ListAttendancePom LA;
	
	
	@BeforeClass
	public void beforeClass() {
		driver= BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");
		
		//Step 1: Company admin login
		
		login = new Company_admin_login_pom(driver);
		login.LogincompanyAdmin("california@yahoo.com", "1asdf234");
		
	}

	@Test
	public void LisTAttendance() {
		
		//Step 2: To view list attendance
		
		LA  = new ListAttendancePom(driver);
		LA.attendancelistside();
		/*LA.uPdateBTN();
		LA.upDatefields("Automation");
		LA.latitude("23.84814371944699");
		LA.longitude(" 90.29016981124782");
		LA.addres("USA");
		LA.SubmitBtn();*/
		
		/*
		LA.detail();
		LA.delete();
		LA.close();*/
		
		/*LA.detail();
		LA.mapMaximize();*/
		
		/*LA.detail();
		LA.zoomin();
		LA.zoomout();*/
		
		/*LA.detail();
		LA.mapTerrain();*/
		
		/*LA.detail();
		LA.sateliTe();*/
		
		
		
	}

	@AfterClass
	public void afterClass() {
		
		//Step 3: Quit browser
		
		BrowserFactory.quitBrowser(driver);
	}

}
