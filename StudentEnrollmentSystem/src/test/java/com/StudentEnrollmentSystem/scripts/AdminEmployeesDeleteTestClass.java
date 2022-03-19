package com.StudentEnrollmentSystem.scripts;

import org.testng.annotations.Test;

import com.StudentEnrollmentSystem.pages.AdminEmployeesDelete;
import com.StudentEnrollmentSystem.utilities.ExcelUtility;

public class AdminEmployeesDeleteTestClass extends TestBase {
	
	AdminEmployeesDelete objLogin;
	
	 @Test(priority=1)
	    public void verifyAdminEmployeesDelete() throws Exception {
	    
	    	//create login page object
	    	objLogin=new  AdminEmployeesDelete(driver);
	   
	    	
	    	
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
	    objLogin.clickemployees();
	    Thread.sleep(2000);
	    objLogin.clickDelete();
	    objLogin.alertOK1();
	 }
}
