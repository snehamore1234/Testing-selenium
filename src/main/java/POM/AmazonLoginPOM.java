package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLoginPOM
{
	
	private WebDriver driver;
	
	public AmazonLoginPOM(WebDriver driver)
	{
	this.driver=driver;	
	}
	private By Account=By.xpath("//span[@class='nav-line-2 ']");
	private By User=By.xpath("//input[@id='ap_email']");
	private By Continue=By.xpath("//input[@id='continue']");
	private By password=By.xpath("//input[@id='ap_password']");
	private By signin=By.xpath("//input[@id='signInSubmit']");
	
	public void account()
	{
		driver.findElement(Account).click();
	}
	
	public void user(String uname)
	{
		driver.findElement(User).sendKeys(uname);
	}
	public void Continue()
	{
		driver.findElement(Continue).click();
	}
	public void pass(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void sign()
	{
		driver.findElement(signin).click();
	}
	
	
public AmazonPOM doLogin(String un, String pwd) {
		
		System.out.println("Login with username: " +un+ " and password "+ pwd);
		driver.findElement(Account).click();
		driver.findElement(User).sendKeys(un);
		driver.findElement(Continue).click();
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signin).click();
		
		return new AmazonPOM(driver);
		//	return ss;
		
		
	}
}
