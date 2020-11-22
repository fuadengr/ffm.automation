package company_admin_testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	
	public static WebDriver startBrowser(WebDriver driver, String browserName, String Url){
		
		if(browserName.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "Drivers./chromedriver.exe");
			driver = new ChromeDriver();
			                                                                       // Notes: if you want to change anything, like browser, maximize window, timeouts another things
			                                                                      //         then you can change in this class(browser factory). you dont need to change in all the classes.
			
		}
		else if (browserName.equals("Firefox")) {
			
			
			System.setProperty("webdriver.gecko.driver", "Drivers./geckodriver.exe");
			driver = new FirefoxDriver();
			
			
		}
		else {
			System.out.println("Browser is not supported");
		}
		
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(Url);
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver){
		
		driver.quit();
	}
}
