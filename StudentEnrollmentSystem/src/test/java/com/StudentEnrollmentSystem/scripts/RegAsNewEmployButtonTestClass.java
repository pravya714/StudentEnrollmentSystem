package com.StudentEnrollmentSystem.scripts;

import com.StudentEnrollmentSystem.constants.AutomationConstants;
import com.StudentEnrollmentSystem.pages.RegAsNewEmployButton;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegAsNewEmployButtonTestClass extends TestBase {
	
	RegAsNewEmployButton objLogin;
	
	@Test
	public void VerifyRegAsNewEmployButton() throws Exception {
		
		//create RegAsNewEmployButton object
		
		objLogin= new RegAsNewEmployButton(driver);
		
		objLogin.clicklogin();
		Thread.sleep(2000);
		objLogin.clickRegisterasNewEmployee();
		Thread.sleep(2000);
		objLogin.clickHome();
		
		 String expectedTitle =AutomationConstants.HOMEPAGETITLE;
		    String actualTitle =driver.getTitle();
		    Assert.assertEquals(expectedTitle,actualTitle);
	}
	
	
	
	

}
