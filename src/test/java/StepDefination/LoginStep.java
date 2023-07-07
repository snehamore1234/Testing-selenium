package StepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;
import POM.OrangePOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStep
{
	WebDriver driver=DriverFactory.getDriver();
	private OrangePOM ob=new OrangePOM(driver);
private static String title="";


	@Given("User is on login page")
	public void user_is_on_login_page() 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}
   
	

	@When("user Check forgot click is present")
	public void user_check_forgot_click_is_present() {
	
		String Actual=ob.link();
		String Expected="Forgot your password?";
		 Assert.assertEquals(Expected,Actual);
	}

	@When("click on Forgot link")
	public void click_on_forgot_link() throws InterruptedException {
	   ob.forgotpass();
	   Thread.sleep(2000);
	}

	@When("User enter username {string}")
	public void user_enter_username(String string) {
	   ob.username(string);
	}

	@When("click on Reset password button")
	public void click_on_reset_password_button() {
	    ob.ResetButton();
	}

	@Then("window contain text {string}")
	public void window_contain_text(String string) {
		String expectedtitle=ob.success();
		String Actual=string;
		Assert.assertEquals(expectedtitle,Actual);
	}

	@Then("User redirect to login page")
	public void user_redirect_to_login_page() {
	    ob.redirectpage();
	}

	@Then("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
	   ob.username(string);
	   ob.Password(string2);
	}

	@Then("User click on submit button")
	public void user_click_on_submit_button() {
	   ob.click();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
	   title=ob.getTitle();
	   Assert.assertTrue(title.contains(string));
	}


	
	
	
	
	
}
