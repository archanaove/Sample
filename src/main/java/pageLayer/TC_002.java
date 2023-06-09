package pageLayer;

import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class TC_002 extends TestBase{
	
	public TC_002()
	{
		PageFactory.initElements(driver, this);
	}
	By SeleniumSite = By.xpath("//h3[text()='Selenium']");
	
	
	public void openSeleniumSite()
	{
		driver.findElement(SeleniumSite).click();
	}
	
	

}
