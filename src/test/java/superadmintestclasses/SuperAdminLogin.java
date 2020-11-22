package superadmintestclasses;

import org.testng.annotations.Test;

import company_admin_testClasses.BrowserFactory;
import superadminpomclasses.Login_pom;

import org.testng.annotations.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class SuperAdminLogin {
	WebDriver driver;
	 Login_pom login;
	@BeforeClass
	public void beforeClass() {
		driver = BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");
		
	}

	@Test
	public void LoginSAdmin() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Step 1: Techserve4u admin login
		
		login= new Login_pom(driver);
		
		login.LoginSuperAdmin("Fuad.shetty@email.com", "fuad1122");
		
		login.FFmAdminPanelTitledisplay();
		
	}

	@AfterClass
	public void afterClass() {
		
		//Step 2: Quit browser
		
		BrowserFactory.quitBrowser(driver);
	}

}
