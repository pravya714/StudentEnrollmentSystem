package com.StudentEnrollmentSystem.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.StudentEnrollmentSystem.pages.AdminLogin;
import com.StudentEnrollmentSystem.utilities.ExcelUtility;
import com.StudentEnrollmentSystem.constants.AutomationConstants;


	public class AdminLoginTestClass extends TestBase
	{
	   AdminLogin objLogin;  
	    @Test(priority=2)
	    public void verifyAdminLoginTestClass() throws Exception {
	    
	    	//create login page object
	    	objLogin=new AdminLogin(driver);
	   
	    	
	    	
	    	//String Title=driver.getTitle();
	    	//System.out.println(Title);
	        
	        objLogin.clicklogin();
	        Thread.sleep(2000);
   
	    String Email = ExcelUtility.getCellData(0, 0);
	    String Password = ExcelUtility.getCellData(0, 1);
	    String admin=ExcelUtility.getCellData(0,2);
	    objLogin.setEmail(Email);
	    objLogin.setPassword(Password);
	    objLogin.setRole(admin);
	    objLogin.clickSignIn();
	    objLogin.getAlertText();
	    objLogin.alertOK();
	   
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	    }
	    
	    
	    
	    
}
