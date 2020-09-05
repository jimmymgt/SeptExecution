package com.careerhack.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.careerhack.common.GoogleBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch extends GoogleBase{


	 
	@Given("^I am on google homepage$")
	public void i_am_on_google_homepage() {
		
		getDriver();
		
	}
	
	
	

	@When("^I enter the technical single \"([^\"]*)\"$")
	public void i_enter_the_technical_single(String keyword) {
	
	WebElement searchBox;
	searchBox = driver.findElement(By.name("q"));
	searchBox.sendKeys(keyword);
	
	
	
	}

	@When("^I enter google search button$")
	public void i_enter_google_search_button()  {
	 WebElement searchButton;
	 searchButton = driver.findElement(By.name("btnk"));
	 searchButton.click();
		
		
		
	}

	@Then("^I see relevant results$")
	public void i_see_relevant_results()  {
	   String title;
	   title = driver.getTitle();
	   System.out.println(title);
		driver.close();//close active browser
		//driver.quit()= close all browser
		
		
	}


	
	
}
