package com.StudentEnrollmentSystem.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.StudentEnrollmentSystem.constants.AutomationConstants;
import com.StudentEnrollmentSystem.pages.AdminLoginUsingInvalidcred;
import com.StudentEnrollmentSystem.utilities.ExcelUtility1;

public class AdminLoginUsingInvalidcredTestClass extends TestBase {
	
	  AdminLoginUsingInvalidcred objLogin;  
	    @Test(priority=1)
	    public void verifyAdminLoginUsingInvalidcredTestClass() throws Exception {
	    
	    	//create login page object
	    	objLogin=new AdminLoginUsingInvalidcred(driver);
	   
	    	
	    	
	    	//String Title=driver.getTitle();
	    	//System.out.println(Title);
	        
	        objLogin.clicklogin();
	        Thread.sleep(2000);
 
	    String Email = ExcelUtility1.getCellData(0, 0);
	    String Password = ExcelUtility1.getCellData(0, 1);
	    String admin=ExcelUtility1.getCellData(0,2);
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
