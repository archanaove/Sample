package testLayer;

import org.testng.annotations.Test;

import pageLayer.TC_002;
import testBase.TestBase;

public class TC_02 extends TestBase {
	
	TC_002 b = new TC_002();
	
	@Test
	public void test02()
	 {
		 b.openSeleniumSite();
	 }

}
