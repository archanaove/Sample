package testBase;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TestBase {
	
public static WebDriver driver;
	
	@BeforeMethod
	public void BrowserLaunch()
	{	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Changes for GIT");
		
	}
	
//	@BeforeMethod
//	public void OpenSelenium() {
//		
//		
//	}
//	
//	@AfterMethod
//	public void Close() {
//		driver.close();
//	}
	
	
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}

}
