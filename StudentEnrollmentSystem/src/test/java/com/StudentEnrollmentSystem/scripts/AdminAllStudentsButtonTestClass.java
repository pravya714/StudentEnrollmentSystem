package com.StudentEnrollmentSystem.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.StudentEnrollmentSystem.constants.AutomationConstants;
import com.StudentEnrollmentSystem.pages.AdminAllStudentsButton;
import com.StudentEnrollmentSystem.utilities.ExcelUtility;

public class AdminAllStudentsButtonTestClass extends TestBase {
	
		AdminAllStudentsButton objLogin;  
		
	    @Test()
	    public void verifyAdminAllStudentsButton() throws Exception {
	    
	    	//create AdminAllStudentsButton page object
	    	
	    	objLogin=new AdminAllStudentsButton(driver);
	   
	    	
	    	
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
	    objLogin.clickstudents();
	    
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	    }
}