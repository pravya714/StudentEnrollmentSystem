package com.StudentEnrollmentSystem.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.StudentEnrollmentSystem.constants.AutomationConstants;
import com.StudentEnrollmentSystem.pages.AdminLoginUsingInvalidPwd;
import com.StudentEnrollmentSystem.utilities.ExcelUtility2;

public class AdminLoginUsingInvalidPwdTestClass extends TestBase {
	
	AdminLoginUsingInvalidPwd objLogin;  
    @Test(priority=1)
    public void verifyAdminLoginUsingInvalidPwdTestClass() throws Exception {
    
    	//create login page object
    	objLogin=new AdminLoginUsingInvalidPwd(driver);
   
    	
    	
    	//String Title=driver.getTitle();
    	//System.out.println(Title);
        
        objLogin.clicklogin();
        Thread.sleep(1000);

    String Email = ExcelUtility2.getCellData(0,0);
    String Password = ExcelUtility2.getCellData(0,1);
    String admin=ExcelUtility2.getCellData(0,2);
    objLogin.setEmail(Email);
    objLogin.setPassword(Password);
    objLogin.setRole(admin);
    objLogin.clickSignIn();
    Thread.sleep(2000);
    objLogin.getAlertText();
    objLogin.alertOK();
   
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
    }
    
    
    

}
