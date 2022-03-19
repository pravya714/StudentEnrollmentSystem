package com.StudentEnrollmentSystem.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.StudentEnrollmentSystem.constants.AutomationConstants;
import com.StudentEnrollmentSystem.pages.AdEmployeeEditUsngEmail;
import com.StudentEnrollmentSystem.utilities.ExcelUtility;

public class AdEmployeeEditUsngEmailTestClass extends TestBase {
	

	   AdEmployeeEditUsngEmail objLogin;  
	    @Test(priority=1)
	    public void verifyAdEmployeeEditUsngEmailTestClass() throws Exception {
	    
	    	//create login page object
	    	objLogin=new  AdEmployeeEditUsngEmail(driver);
	   
	    	
	    	
	    	//String Title=driver.getTitle();
	    	//System.out.println(Title);
	        
	        objLogin.clicklogin();
	        Thread.sleep(2000);

	    String Email = ExcelUtility.getCellData(0, 0);
	    String Password = ExcelUtility.getCellData(0, 1);
	    String admin=ExcelUtility.getCellData(0,2);
	    String email2=ExcelUtility.getCellData(0,4);
	    objLogin.setEmail(Email);
	    objLogin.setPassword(Password);
	    objLogin.setRole(admin);
	    objLogin.clickSignIn();
	    objLogin.getAlertText();
	    objLogin.alertOK();
	    objLogin.clickemployees();
	    Thread.sleep(2000);
	    objLogin.clickEdit();
	    Thread.sleep(2000);
	    objLogin.setEmail2(email2);
	    Thread.sleep(2000);
	    objLogin.clickUpdate();
	    
	   
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	    }
	    
	    

}
