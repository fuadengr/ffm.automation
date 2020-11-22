package superadmintestclasses;

import org.testng.annotations.Test;

import company_admin_testClasses.BrowserFactory;
import superadminpomclasses.AddNewCompanyPom;
import superadminpomclasses.Login_pom;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class AddNewCompany {

	WebDriver driver;
	Login_pom login;
	AddNewCompanyPom AddNew;

	@BeforeClass
	public void beforeClass() {

		driver = BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");
	}

	@Test
	public void AddCompany() {
		
		//Step 1: Techserve4u admin login
		
		login = new Login_pom(driver);

		login.LoginSuperAdmin("Fuad.shetty@email.com", "fuad1122");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Step 2: Add new company

		AddNew = new AddNewCompanyPom(driver);

		AddNew.Addcompany();

		AddNew.CompanyFields("Supreme", "Newyork", "112233445566");
		//AddNew.Agreement();
		//AddNew.Verification();
		AddNew.select();
		
		AddNew.AgreementVerificationField("C:\\Users\\Fuad Pc\\Desktop\\dummy1.pdf", "C:\\Users\\Fuad Pc\\Desktop\\dummy2.pdf");
		

		AddNew.submitBTN();
	}

	@AfterClass
	public void afterClass() {
		
		//Step 3: Quit browser
		
		BrowserFactory.quitBrowser(driver);
	}

}
