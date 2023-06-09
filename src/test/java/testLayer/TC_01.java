package testLayer;

import org.testng.annotations.Test;

import pageLayer.TC_001;
import testBase.TestBase;

public class TC_01 extends TestBase {
	
	 TC_001 a = new TC_001();
	 
	 @Test
	 public void test01()
	 {
		 a.clickOnSearchbox();
		 a.ClickOnInputText();
	 }

	}


