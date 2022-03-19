package com.StudentEnrollmentSystem.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.StudentEnrollmentSystem.constants.AutomationConstants;
import com.StudentEnrollmentSystem.pages.AdminAllStudentsShowDetails;
import com.StudentEnrollmentSystem.utilities.ExcelUtility3;

public class AdminAllStudentsShowDetailsTestClass extends TestBase {
	
	AdminAllStudentsShowDetails objLogin;  
    @Test(priority=1)
    public void verifyAdminAllStudentsShowDetails() throws Exception {
    
    	//create login page object
    	objLogin=new AdminAllStudentsShowDetails(driver);
   
    	
    	
    	//String Title=driver.getTitle();
    	//System.out.println(Title);
    	
        
        objLogin.clicklogin();
        Thread.sleep(1000);

    String Email = ExcelUtility3.getCellData(0, 0);
    String Password = ExcelUtility3.getCellData(0, 1);
    String admin=ExcelUtility3.getCellData(0, 2);
    String listSearch=ExcelUtility3.getCellData(0,3);
    objLogin.setEmail(Email);
    objLogin.setPassword(Password);
    objLogin.setRole(admin);
    objLogin.clickSignIn();
    objLogin.getAlertText();
    objLogin.alertOK();
    objLogin.clickstudents();
    objLogin.setlistSearch(listSearch);
    objLogin.clickShowDetails();
  
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
    }
    
    
    
    
}



