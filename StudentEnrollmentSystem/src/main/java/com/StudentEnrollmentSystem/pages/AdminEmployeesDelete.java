package com.StudentEnrollmentSystem.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminEmployeesDelete {
	
	 /** 
	  * All WebElements are identified by @FindBy annotation
 */
WebDriver driver;



@FindBy(xpath="/html/body/app-root/app-header/section[2]/div/div[2]/ul[2]/li/button/a")
private WebElement  login;

@FindBy(name="email")
private WebElement email;
@FindBy(name="password")
private WebElement password;
@FindBy(name="role")
private WebElement role;

@FindBy(name="admin")
private WebElement admin;

@FindBy(name="sign-in")
private WebElement SignIn;
@FindBy(xpath="//a[@href='/employees']")
private WebElement employees;
@FindBy(xpath="/html/body/app-root/app-employees/div/ul[13]/li/div[2]/button[2]")
private WebElement Delete;


public AdminEmployeesDelete(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}

public void clicklogin() {
	  login.click();
}
public void setEmail(String strEmail) {
	email.sendKeys(strEmail); 
}
public void setPassword(String strPassword) {
	 password.sendKeys(strPassword);
}

//set admin from dropdown

public void setRole(String strRole) {
 role.click();
 Select category=new Select(role);
 category.selectByValue(strRole);
 
}

public void clickSignIn(){
	 SignIn.click();
}
public String getAlertText() throws Exception {
	 Thread.sleep(1000);
	 Alert alert=driver.switchTo().alert();
	 String alertText=alert.getText();
	 return alertText;
	 
}
public void alertOK() {
	 Alert alert=driver.switchTo().alert();
	 alert.accept();
}
public void clickemployees() {
	employees.click();
}
 public void clickDelete() {
	 Delete.click();
 }
 public String getAlertText1() throws Exception {
	 Thread.sleep(1000);
	 Alert alert=driver.switchTo().alert();
	 String alertText=alert.getText();
	 return alertText;
	 
}
 
 public void alertOK1() {
	 Alert alert=driver.switchTo().alert();
	 alert.accept();
}
}
