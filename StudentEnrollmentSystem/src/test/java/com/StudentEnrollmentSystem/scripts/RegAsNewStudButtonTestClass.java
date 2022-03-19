package com.StudentEnrollmentSystem.scripts;

import org.testng.Assert;

import com.StudentEnrollmentSystem.constants.AutomationConstants;
import com.StudentEnrollmentSystem.pages.RegAsNewStudButton;
import org.testng.annotations.Test;

public class RegAsNewStudButtonTestClass extends TestBase {
	
	RegAsNewStudButton objLogin;
	
	@Test
	public void VerifyRegAsNewStudButton() throws Exception {
		
		// create RegAsNewStudButton object
		
		objLogin= new RegAsNewStudButton(driver);
				
				
				objLogin.clicklogin();
				Thread.sleep(1000);
				objLogin.clickRegisterasNewStudent();
				Thread.sleep(2000);
				objLogin.clickHome();
				
				
				
				 String expectedTitle =AutomationConstants.HOMEPAGETITLE;
				    String actualTitle =driver.getTitle();
				    Assert.assertEquals(expectedTitle,actualTitle);
				
				
	
	
	}
}
