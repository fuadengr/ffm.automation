package superadmintestclasses;

import org.testng.annotations.Test;

import company_admin_testClasses.BrowserFactory;
import superadminpomclasses.Login_pom;
import superadminpomclasses.LogoutPom;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Logout {

	WebDriver driver;
	Login_pom login;
	LogoutPom logout;

	@BeforeClass
	public void beforeClass() {

		driver = BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");

	}

	@Test
	public void logout() {
		
		//Step 1: Techserve4u admin login

		login = new Login_pom(driver);

		login.LoginSuperAdmin("Fuad.shetty@email.com", "fuad1122");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Step 2: Techserve4u admin logout

		logout = new LogoutPom(driver);

		logout.nameButton();

		logout.logoutBTN();

	}

	@AfterClass
	public void afterClass() {
		
		//Step 3: Quit browser
		
		BrowserFactory.quitBrowser(driver);
	}

}
