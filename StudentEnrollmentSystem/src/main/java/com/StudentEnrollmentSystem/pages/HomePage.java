package com.StudentEnrollmentSystem.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	//locating elements
	@FindBy(xpath="//a[@href='/courses']")
	private WebElement courses;
	@FindBy(xpath="//div[@class='team-hover']")
	private WebElement scroll;
	@FindBy(xpath="//a[contains(text(),'Know More')]")
	private WebElement KnowMore;
	
	public HomePage(WebDriver driver){
	      this.driver = driver;
	      //This initElements method will create all WebElements
	      PageFactory.initElements(driver, this);
	  }
	  
	public void clickCourses() {
		courses.click();
	}
 public void clickScroll() {
	 Actions action=new Actions(driver);
	 action.moveToElement(scroll).perform();
	 scroll.click();
}
 public void clickKnowMore() {
	 KnowMore.click();
 }
 
 
 
}
