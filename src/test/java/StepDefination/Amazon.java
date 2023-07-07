package StepDefination;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;
import POM.AmazonPOM;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import POM.AmazonLoginPOM;




public class Amazon {

	WebDriver driver=DriverFactory.getDriver();
	private AmazonLoginPOM page=new AmazonLoginPOM(driver);
	private AmazonPOM ob;
	//private AmazonPOM ob = new AmazonPOM(driver);

	@Given("User has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable dataTable) {
	    
		List<Map<String,String>> credList=dataTable.asMaps();
		String user=credList.get(0).get("username");
		System.out.println("uname"+user);
		String pass=credList.get(0).get("password");
		System.out.println("password"+pass);
		driver.get("https://www.amazon.in/");
		ob=page.doLogin(user, pass);
		
	}

	@Given("user is on amazon home page")
	public void user_is_on_amazon_home_page() {
	String title=ob.Title();
	
	}

	
		

	@When("user select a search option as all")
	public void user_select_a_search_option_as_all() {
		ob.dropdown();
		}

		

		@Then("user click on serach bar and enter product name")
		public void user_click_on_serach_bar_and_enter_product_name() {
		   ob.search();
		}

		@Then("user enter a button")
		public void user_enter_a_button() {
		    ob.enterbutton();
		}

		@Then("Scroll the window to get show more product")
		public void scroll_the_window_to_get_show_more_product() {
			
		  //  JavascriptExecutor js=(JavascriptExecutor)driver;
		    //js.executeScript("windows.scrollBy(0,60)");
		}

		@Then("user click filter which Brand is one plus")
		public void user_click_filter_which_brand_is_one_plus() throws InterruptedException {
		   Thread.sleep(1000);
			ob.filter();
		}
		@Then("user click on one product")
		public void user_click_on_one_product() throws InterruptedException {
			Thread.sleep(1000);
		   ob.selectproduct();
		   ob.winhandel();
		}

		@Then("user redirect to page that title should be {string}")
		public void user_redirect_to_page_that_title_should_be(String string) {
			//ob.winhandel();
			String ActualTitle=string;
			String ExpectedTitle=driver.getTitle();
			System.out.println("title"+ExpectedTitle);
			//Assert.assertTrue(ExpectedTitle.equals(ActualTitle));
			
			
		}

		@Then("user click on buy button")
		public void user_click_on_buy_button() {
			System.out.println("hiiiii");
			
		   ob.buy();
		  // ob.winhandel();
		}

		@Then("user return back to the Home page window")
		public void user_return_back_to_the_login_page_window() {
		  driver.switchTo().defaultContent();
		}

		
	}





