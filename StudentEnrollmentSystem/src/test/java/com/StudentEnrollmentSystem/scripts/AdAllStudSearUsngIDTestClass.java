package com.StudentEnrollmentSystem.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.StudentEnrollmentSystem.constants.AutomationConstants;
import com.StudentEnrollmentSystem.pages.AdAllStudSearUsngID;
import com.StudentEnrollmentSystem.utilities.ExcelUtility;

public class AdAllStudSearUsngIDTestClass extends TestBase {
	
	AdAllStudSearUsngID objLogin;  
	
    @Test()
    public void verifyAdminAllStudUsngIDTestClass() throws Exception {
    
    	//create login page object
    	objLogin=new AdAllStudSearUsngID(driver);
   
    	
    	
    	//String Title=driver.getTitle();
    	//System.out.println(Title);
    	
        
        objLogin.clicklogin();
        Thread.sleep(1000);

    String Email = ExcelUtility.getCellData(0, 0);
    String Password = ExcelUtility.getCellData(0, 1);
    String admin=ExcelUtility.getCellData(0, 2);
   String listSearch=ExcelUtility.getCellData(1, 0);
    objLogin.setEmail(Email);
    objLogin.setPassword(Password);
    objLogin.setRole(admin);
    objLogin.clickSignIn();
    objLogin.getAlertText();
    objLogin.alertOK();
    objLogin.clickstudents();
    objLogin.setlistSearch(listSearch);
    Thread.sleep(2000);
    
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
	
	
    }
    
    
    
}
