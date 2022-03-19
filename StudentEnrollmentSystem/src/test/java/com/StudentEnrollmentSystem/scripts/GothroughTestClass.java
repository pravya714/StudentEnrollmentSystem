package com.StudentEnrollmentSystem.scripts;

import org.testng.Assert;

import com.StudentEnrollmentSystem.constants.AutomationConstants;
import com.StudentEnrollmentSystem.pages.Gothrough;
import org.testng.annotations.Test;

public class GothroughTestClass extends TestBase{
	
	Gothrough objLogin;
	
	@Test
	public void VerifyGothrough() {
		
		//create Gothrough object
		objLogin= new Gothrough(driver);
	
	objLogin.clickGothroughourcourses();
	objLogin.clickScroll();
	objLogin.clickKnowMore();
	
	String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);

}
}