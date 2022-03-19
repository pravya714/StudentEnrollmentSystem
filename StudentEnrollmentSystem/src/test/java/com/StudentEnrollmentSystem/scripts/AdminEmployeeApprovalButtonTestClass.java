package com.StudentEnrollmentSystem.scripts;

import com.StudentEnrollmentSystem.constants.AutomationConstants;
import com.StudentEnrollmentSystem.pages.AdminEmployeeApprovalButton;
import com.StudentEnrollmentSystem.utilities.ExcelUtility;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminEmployeeApprovalButtonTestClass extends TestBase {
	
	AdminEmployeeApprovalButton objLogin;
	
	@Test
	public void verifyAdminEmployeeApprovalButton() throws Exception {
	    
    	//create AdminAllStudentsButton page object
    	
    	objLogin=new AdminEmployeeApprovalButton(driver);
    	
    	//String Title=driver.getTitle();
    	//System.out.println(Title);
    	
        
        objLogin.clicklogin();
        Thread.sleep(1000);

    String Email = ExcelUtility.getCellData(0, 0);
    String Password = ExcelUtility.getCellData(0, 1);
    String admin=ExcelUtility.getCellData(0, 2);
    
    objLogin.setEmail(Email);
    objLogin.setPassword(Password);
    objLogin.setRole(admin);
    objLogin.clickSignIn();
    objLogin.getAlertText();
    objLogin.alertOK();
    objLogin.clickEmployeeApproval();
    objLogin.clickApprove();
    objLogin.alertOK1();
    
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
    
    }
    	
   
	

}
