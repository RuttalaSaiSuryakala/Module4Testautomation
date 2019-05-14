package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.io.example.PropertiesEx;
import com.io.pom.ConferenceReg;
import com.io.pom.PaymentDetails;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	 static ConferenceReg conferenceReg=null;
	 static PaymentDetails paymentDetails=null;
	static  PropertiesEx propertiesEx=null;
	WebDriver webdriver;
	
	@Given("^user is registering$")
	public void user_is_registering() throws Throwable {
		//this id to read the properties
				propertiesEx.readProperties();
				//this method helps to get the server
				propertiesEx.setBrowserConfig();
				//this method helps to create driver
		webdriver=propertiesEx.setBrowser();
		//this method is to get the url
		webdriver.get(propertiesEx.urlprop());
		
	}
//checks for regitration page
	@When("^title of page is conference registration$")
	public void title_of_page_is_conference_registration() throws Throwable {
String title=webdriver.getTitle();
		Assert.assertEquals("Conference Registartion", title);
		conferenceReg=new ConferenceReg(webdriver);
	}
//enters firstname
	@Then("^user enters first name$")
	public void user_enters_first_name() throws Throwable {
		
		conferenceReg.clickNext();
		conferenceReg.giveFirstName();
	}
	//enters lastname
	@Then("^user enters last name$")
	public void user_enters_last_name() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.giveLastName();
	}
	//enters email
	@Then("^user enters email$")
	public void user_enters_email() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.giveEmail();
	}
	//enters contact number
	@Then("^user enters contact number$")
	public void user_enters_contact_number() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.giveContactNo();
	}
	//enters number of people
	@Then("^user selects no of people$")
	public void user_selects_no_of_people() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.giveNoOfPeople();
	}
	//enters bulding name
	@Then("^user enters building name and room no$")
	public void user_enters_building_name_and_room_no() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.giveBuildingName();
	}
	//enters area
	@Then("^user enters area name$")
	public void user_enters_area_name() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.giveAreaName();
	}
	//enters city
	@Then("^user selects city$")
	public void user_selects_city() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.giveCity();
	}
	//enters state
	@Then("^user selects state$")
	public void user_selects_state() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.giveState();
	}
	//enters access
	@Then("^user selects conference access$")
	public void user_selects_conference_access() throws Throwable {
		conferenceReg.clickNext();
		conferenceReg.giveConferenceAccess();
	}

	@Then("^click on next$")
	public void click_on_next() throws Throwable {
		conferenceReg.clickNext();
	}

	@Then("^title of page is payment details$")
	public void title_of_page_is_payment_details() throws Throwable {
		String title = webdriver.getTitle();
		Assert.assertEquals("Payment Details", title);
		paymentDetails= new PaymentDetails(webdriver);
	}
	

	@Then("^user enters card holder name$")
	public void user_enters_card_holder_name() throws Throwable {
		paymentDetails.clickNext();
		paymentDetails.giveCardHolderName();
	}

	@Then("^user enters debit card number$")
	public void user_enters_debit_card_number() throws Throwable {
		paymentDetails.clickNext();
		paymentDetails.giveDebitCardName();
	}
	
	@Then("^user enters cvv number$")
	public void user_enters_cvv_number() throws Throwable {
		paymentDetails.clickNext();
		paymentDetails.giveCvvNumber();
	}

	@Then("^user enters card expiration month$")
	public void user_enters_card_expiration_month() throws Throwable {
		paymentDetails.clickNext();
		paymentDetails.giveCardExpiryMonth();
	}

	@Then("^user enters card expiration year$")
	public void user_enters_card_expiration_year() throws Throwable {
		paymentDetails.clickNext();
		paymentDetails.giveCardExpiryYear();
	}

	@Then("^click on make payment$")
	public void click_on_make_payment() throws Throwable {
		paymentDetails.clickNext();
	}
	@Then("^close the terminal$")
	public void close_the_terminal() throws Throwable {
	   propertiesEx.endTest();
	}
}
