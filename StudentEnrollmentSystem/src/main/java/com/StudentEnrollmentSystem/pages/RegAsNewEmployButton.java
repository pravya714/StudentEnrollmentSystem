package com.StudentEnrollmentSystem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegAsNewEmployButton {
	
	 WebDriver driver;
	 
	 @FindBy(xpath="/html/body/app-root/app-header/section[2]/div/div[2]/ul[2]/li/button/a")
	  private WebElement  login;
	 @FindBy(xpath="/html/body/app-root/app-login/div/div[1]/a[2]/strong")
	 private WebElement  RegisterasNewEmployee;
	 @FindBy(xpath="/html/body/app-root/app-header/section[2]/div/div[2]/ul[1]/li[1]/a")
	 private WebElement Home;
	  
	 
	 public RegAsNewEmployButton(WebDriver driver){
	      this.driver = driver;
	      //This initElements method will create all WebElements
	      PageFactory.initElements(driver, this);
	  }
	  
	  public void clicklogin() {
		  login.click();
	  }
    
	  public void clickRegisterasNewEmployee() {
		  RegisterasNewEmployee.click();
	  } 
	  
	  public void clickHome() {
		  Home.click();
	  }
	  
	  }
	  
