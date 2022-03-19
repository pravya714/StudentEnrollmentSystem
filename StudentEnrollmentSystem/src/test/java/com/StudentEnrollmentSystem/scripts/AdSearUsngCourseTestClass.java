package com.StudentEnrollmentSystem.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.StudentEnrollmentSystem.constants.AutomationConstants;
import com.StudentEnrollmentSystem.pages.AdSearUsngCourse;
import com.StudentEnrollmentSystem.utilities.ExcelUtility4;

public class AdSearUsngCourseTestClass extends TestBase {
	
	AdSearUsngCourse objLogin;
	
	 @Test(priority=1)
	    public void AdSearUsngCourse() throws Exception {
	    
	    	//create login page object
	    	objLogin=new AdSearUsngCourse(driver);
	   
	    
	    	//String Title=driver.getTitle();
	    	//System.out.println(Title);
	    	
	        
	        objLogin.clicklogin();
	        Thread.sleep(1000);

	    String Email = ExcelUtility4.getCellData(0, 0);
	    String Password = ExcelUtility4.getCellData(0, 1);
	    String admin=ExcelUtility4.getCellData(0, 2);
	    String listSearch=ExcelUtility4.getCellData(0,5);
	    objLogin.setEmail(Email);
	    objLogin.setPassword(Password);
	    objLogin.setRole(admin);
	    objLogin.clickSignIn();
	    objLogin.getAlertText();
	    objLogin.alertOK();
	    objLogin.clicksearch();
	    objLogin.setlistSearch(listSearch);
	
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	
	 }


}
