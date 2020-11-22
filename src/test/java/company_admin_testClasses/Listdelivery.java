package company_admin_testClasses;

import org.testng.annotations.Test;

import company_admin_pom.ListDelivery;
import company_admin_pom.Company_admin_login_pom;

import org.testng.annotations.BeforeClass;

import org.openqa.selenium.WebDriver;


import org.testng.annotations.AfterClass;

public class Listdelivery {
	WebDriver driver;
	Company_admin_login_pom login;
	ListDelivery list;

	@BeforeClass
	public void beforeClass() {
		driver = BrowserFactory.startBrowser(driver, "Firefox", "http://104.248.53.138/");
		
		//Step 1: Company admin login
		
		login = new Company_admin_login_pom(driver);
		login.LogincompanyAdmin("california@yahoo.com", "1asdf234");

	}

	@Test
	public void listDeliv() {
		
		//Step 2: To view list delivery

		list = new ListDelivery(driver);

		list.listSidespan();

		list.listDelivery();

	/*	WebElement start = driver.findElement(By.xpath(
				"//div[@class='gm-svpc']")); //xpath created by class

		WebElement target = driver.findElement(By.xpath(
				"//*[@id=\\\"kt_content\\\"]/div/div/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div[1]/div[1]/div[3]"));

		Actions a = new Actions(driver);

		a.dragAndDropBy(start, 20, 15).perform();
		
		
		a.clickAndHold(start);
		a.moveToElement(target);
		a.release();
		a.build();
		a.perform();*/

	}

	@AfterClass
	public void afterClass() {
		
		//Step 3: Quit browser
		
		BrowserFactory.quitBrowser(driver);
	}

}
