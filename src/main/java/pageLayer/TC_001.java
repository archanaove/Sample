package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class TC_001 extends TestBase {
		
		public TC_001()
		{
			PageFactory.initElements(driver, this);
		}
		By serchBox = By.xpath("//*[@title=\"Search\"]");
		
		
		public void clickOnSearchbox()
		{
			driver.findElement(serchBox).sendKeys("Selenium");
		}
		
		public void ClickOnInputText()
		{
			driver.findElement(serchBox).sendKeys(Keys.ENTER);
		}
		
	}


