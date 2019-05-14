package com.io.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentDetails {
	WebDriver webdriver;

	public PaymentDetails(WebDriver webdriver) {
		this.webdriver = webdriver;
	}
	//This is to change the names of actual to dummy

	By cardHolderName=By.name("txtFN");
	By debitCardNo=By.name("debit");
	By cvvNumber=By.name("cvv");
	By cardExpiryMonth=By.name("month");
	By cardExpiryYear=By.name("year");
	// this method is used to enter cardholdername

	public void giveCardHolderName() {
		webdriver.findElement(cardHolderName).sendKeys("surya");
	}
	// this method is used to enter cardname

	public void giveDebitCardName() {
		webdriver.findElement(debitCardNo).sendKeys("1234AB");
	}
	// this method is used enter cvv 

	public void giveCvvNumber() {
		webdriver.findElement(cvvNumber).sendKeys("123");
	}
	// this method is used to enter expirymonth

	public void giveCardExpiryMonth() {
		webdriver.findElement(cardExpiryMonth).sendKeys("January");
	}
	// this method is used to enter expiryyear

	public void giveCardExpiryYear() {
		webdriver.findElement(cardExpiryYear).sendKeys("2021");
	}
	// this method is used to click on payment

	public void clickNext() {
		WebElement loginbtn= webdriver.findElement(By.xpath("//input[@type='button']"));
		JavascriptExecutor js=(JavascriptExecutor) webdriver;
		webdriver.findElement(By.id("btnPayment")).click();
		webdriver.switchTo().alert().accept();
	}
}
