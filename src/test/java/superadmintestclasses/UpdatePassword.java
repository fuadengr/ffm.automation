package superadmintestclasses;

import org.testng.annotations.Test;

import company_admin_testClasses.BrowserFactory;
import superadminpomclasses.Login_pom;
import superadminpomclasses.Updatepassword;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class UpdatePassword {
	WebDriver driver;
	Login_pom login;
	Updatepassword pwd;

	@BeforeClass
	public void beforeClass() {
		driver = BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");
	}

	@Test
	public void passWordUpdate() {
		
		//Step 1: Techserve4u admin login
		
		login = new Login_pom(driver);

		login.LoginSuperAdmin("Fuad.shetty@email.com", "fuad1122");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Step 2: Update password of superadmin

		pwd = new Updatepassword(driver);
		pwd.abidbutton();
		pwd.updatepwdbtn();
		pwd.UpdatePassword("abid2211", "abid1122", "abid1122");

		pwd.updatebtn();

	}

	@AfterClass
	public void afterClass() {
		
		//Step 3: Quit browser
		
		BrowserFactory.quitBrowser(driver);
	}

}
