package com.careerhack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//page factory - java library to manage web elements
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	//WebElement SearchBox;
	//searchBox = driver.findElement(By.name("q");
	//searchBox.sendKeys(keyword);
	
	
	@FindBy(name= "q")
	WebElement searchBox;
	
	public void enterSearch(String keyword) {
		searchBox.sendKeys(keyword);
	}
	
	@FindBy(name="btnk")
	WebElement searchButton;
	
	public void enterSearchButton() {
		searchButton.click();
	}
	
}

	
	
	