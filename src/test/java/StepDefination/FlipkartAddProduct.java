package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;
import POM.FlipkartLaunchPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartAddProduct
{
	WebDriver driver= DriverFactory.getDriver();
	private FlipkartLaunchPOM ob=new FlipkartLaunchPOM(driver);
	
	@Given("user is on flipkart website page")
	public void user_is_on_flipkart_website_page()
	{
		driver.get("https://www.flipkart.com/account/orders?link=home_orders ");
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	}

	@When("user enter product name in search bar")
	public void user_enter_product_name_in_search_bar() {
	    ob.EnterName();
	}

	@When("user get the suggestion of product list size and name")
	public void user_get_the_suggestion_of_product_list_size_and_name() {
	   ob.GetList();
	}

	@Then("select the product name through suggested list")
	public void select_the_product_name_through_suggested_list() {
	  // ob.GetList();
	}


}
