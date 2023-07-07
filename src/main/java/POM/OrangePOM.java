package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangePOM 
{

	private WebDriver driver;
	
	//Constructor
	public OrangePOM(WebDriver driver)
	{
		 this.driver=driver;
		  
	}
	
	//By Locator
	 private By User=By.xpath("//input[@placeholder='Username']");
	 private By Pass=By.xpath("//input[@placeholder='Password']");
	 private By Login=By.xpath("//button[@type='submit']");
	 private By forgot=By.xpath("//div[@class='orangehrm-login-forgot']");
	 private By reset=By.xpath("//button[@type='submit']");
	 private By link=By.xpath("//h6[text()='Reset Password link sent successfully']");
	//Page Action
	 
	 
	 
	 public String link()
	 {
		WebElement s= driver.findElement(forgot);
		String forgot=s.getText();
		System.out.println("forgot text.........."+forgot);
		return forgot;
	 }
	 public String success() {
		WebElement s=driver.findElement(link);
		String v=s.getText();
		return v;
		
		
	 }
	 
	 
	 public void redirectpage()
	 {
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	 }
	 
	 public void forgotpass()
	 {		 
		 driver.findElement(forgot).click();;
	 }
	 
	 public void ResetButton()
	 {
		 driver.findElement(reset).click();;
	 }
	 
	 
	 public void username(String user)
	 {
		 driver.findElement(User).sendKeys(user);
	 }
	 public void Password(String pass)
	 {
		 driver.findElement(Pass).sendKeys(pass);
	 }
	
	 public void click()
	 {
		 driver.findElement(Login).click();
	 }
	public String getTitle()
	{
		return driver.getTitle();
		 
		
	}
	/*public AccountPOM loginpage(String user,String pass)
	{
		driver.findElement(User).sendKeys(user);
		 driver.findElement(Pass).sendKeys(pass);
		 driver.findElement(Login).click();
		 return new AccountPOM(driver);
		 
	}*/
	

}
