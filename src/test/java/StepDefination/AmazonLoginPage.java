package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import DriverFactory.DriverFactory;
import POM.AmazonLoginPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import POM.AmazonLoginPOM;
public class AmazonLoginPage 

{
	
	WebDriver driver=DriverFactory.getDriver();
	// AmazonLoginPage()hm=new AmazonLoginPOM(driver);
	
	AmazonLoginPOM ob=new AmazonLoginPOM(driver);
	
	@Given("User is on AmazonLogin page")
	public void user_is_on_amazon_login_page() {
	   driver.get("https://www.amazon.in/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	}

	@When("user click on Accoun Sign in Text")
	public void user_click_on_accoun_sign_in_text() {
	   ob.account();
	}

	@When("user pass mobile number in to text field {string}")
	public void user_pass_mobile_number_in_to_text_field(String string) {
	   ob.user(string);
	}

	@When("user click on continue button")
	public void user_click_on_continue_button() {
	   ob.Continue();
	}

	@When("user pass password in text field {string}")
	public void user_pass_password_in_text_field(String string) {
	    ob.pass(string);
	}

	@When("user click on sign in button")
	public void user_click_on_sign_in_button() {
	   ob.sign();
	}

	@Then("user is login to Amazon Account that page contains text which is {string}")
	public void user_is_login_to_amazon_account_that_page_contains_text_which_is(String string) {
	 /* String t=string;
	  String x=driver.getPageSource();
	  Assert.assertTrue(x.contains(string));
	  System.out.println("Page contain text");*/
	   
	}

	
}
