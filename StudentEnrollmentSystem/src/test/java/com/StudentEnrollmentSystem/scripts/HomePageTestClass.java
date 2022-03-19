package com.StudentEnrollmentSystem.scripts;

import com.StudentEnrollmentSystem.constants.AutomationConstants;
import com.StudentEnrollmentSystem.pages.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTestClass extends TestBase {
	
	HomePage objLogin;
	
	@Test(priority=1)
	public void VerifyHomePage () throws Exception {
		//create HomePage object
		
		objLogin=new HomePage(driver);
		
		objLogin.clickCourses();
		Thread.sleep(1000);
		objLogin.clickScroll();
		objLogin.clickKnowMore();
		 String expectedTitle =AutomationConstants.HOMEPAGETITLE;
		    String actualTitle =driver.getTitle();
		    Assert.assertEquals(expectedTitle,actualTitle);
		
	}
	
	

}
