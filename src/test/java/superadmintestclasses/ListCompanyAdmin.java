package superadmintestclasses;

import org.testng.annotations.Test;

import company_admin_testClasses.BrowserFactory;
import superadminpomclasses.ListCompanyAdminPom;
import superadminpomclasses.Login_pom;

import org.testng.annotations.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class ListCompanyAdmin {
	WebDriver driver;

	Login_pom login;

	ListCompanyAdminPom lca;

	@BeforeClass
	public void beforeClass() {
		driver = BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");
		
		//Step 1: Techserve4u admin login

		login = new Login_pom(driver);

		login.FFmAdminPanelTitledisplay();

		login.LoginSuperAdmin("Fuad.shetty@email.com", "fuad1122");
	}

	@Test
	public void ListcompanyAdmins() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Step 2: To view list of company admin and update and delete
		
		lca = new ListCompanyAdminPom(driver);

		lca.listCadminSidebar();

		lca.Delete();

		lca.close();

		lca.display();

		lca.displayTitle();

	}

	@AfterClass
	public void afterClass() {
		
		//Step 3: Quit browser
		
		BrowserFactory.quitBrowser(driver);
	}

}
