package com.StudentEnrollmentSystem.scripts;

import org.testng.Assert;

import com.StudentEnrollmentSystem.constants.AutomationConstants;
import com.StudentEnrollmentSystem.pages.AdminAllStudentsDelete;
import com.StudentEnrollmentSystem.utilities.ExcelUtility;
import org.testng.annotations.Test;


public class AdminAllStudentsDeleteTestClass extends TestBase {
	
	AdminAllStudentsDelete objLogin;  
	@Test
	
	 public void verifyAdminAllStudentsShowDelete() throws Exception {
		    
	    	//create login page object
	    	objLogin=new AdminAllStudentsDelete(driver);
	    	
	    	//String Title=driver.getTitle();
	    	//System.out.println(Title);
	    	
	        
	        objLogin.clicklogin();
	        Thread.sleep(1000);

	    String Email = ExcelUtility.getCellData(0, 0);
	    String Password = ExcelUtility.getCellData(0, 1);
	    String admin=ExcelUtility.getCellData(0, 2);
	    String listSearch=ExcelUtility.getCellData(0,3);
	    objLogin.setEmail(Email);
	    objLogin.setPassword(Password);
	    objLogin.setRole(admin);
	    objLogin.clickSignIn();
	    objLogin.getAlertText();
	    objLogin.alertOK();
	    objLogin.clickstudents();
	    objLogin.setlistSearch(listSearch);
	    Thread.sleep(1000);
	    objLogin.clickDelete();
	    Thread.sleep(2000);
	    objLogin.alertOK1();
	    
	  
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	    }
	    
	   
	    	
	

}
