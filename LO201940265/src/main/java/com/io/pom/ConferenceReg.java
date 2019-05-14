package com.io.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ConferenceReg {
	
	WebDriver webdriver;
	public ConferenceReg(WebDriver webdriver) {
		this.webdriver=webdriver;
	}
	//This method will chnages the actual name to dummy names.From here we can alter the actual names

	By firstName=By.name("txtFN");
	By lastName=By.name("txtLN");
	By email=By.name("Email");
	By contactNo=By.name("Phone");
	By noOfPeople=By.name("size");
	By buildingName=By.name("Address");
	By areaName=By.name("Address2");
	By city=By.name("city");
	By state=By.name("state");
	By conferenceAccess=By.name("memberStatus");
	// this method is used enter first name 

	public void giveFirstName() {
		System.out.println(webdriver.getTitle());
		webdriver.findElement(firstName).sendKeys("surya");
	}
	//this method is used to enter last name

	public void giveLastName() {
		webdriver.findElement(lastName).sendKeys("kala");
	}
	// this method is used to enter email 

	public void giveEmail() {
		webdriver.findElement(email).sendKeys("surya@gmail.com");
	}
	// this method is used  to enter contact number

	public void giveContactNo() {
		webdriver.findElement(contactNo).sendKeys("7842122341");
	}
	// this method is used to enter number of people

	public void giveNoOfPeople() {
		//driver.findElement(noOfPeople).sendKeys("");
		Select drpCountry = new Select(webdriver.findElement(noOfPeople));
		drpCountry.selectByVisibleText("1");
	}
	// this method is used to enter building name

	public void giveBuildingName() {
		webdriver.findElement(buildingName).sendKeys("ews 1065");
	}
	// this method is used to enter areaname

	public void giveAreaName() {
		webdriver.findElement(areaName).sendKeys("kphb colony");
	}
	// this method is used to enter city

	public void giveCity() {
		Select drpCountry = new Select(webdriver.findElement(city));
		drpCountry.selectByVisibleText("Bangalore");
	}
	// this method is used to enter state
	public void giveState() {
		Select drpCountry = new Select(webdriver.findElement(state));
		drpCountry.selectByVisibleText("Karnataka");
	}
	// this method is used to enter access values

	public void giveConferenceAccess() {
		WebElement radio1 = webdriver.findElement(conferenceAccess);
		radio1.click();
	}
	// this method is used to click on next

	public void clickNext() {
		webdriver.findElement(By.linkText("Next")).click();
		webdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		webdriver.switchTo().alert().accept();
		
	}
}
