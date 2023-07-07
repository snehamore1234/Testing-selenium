package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartLaunchPOM
{
	private WebDriver driver;
	
	// private  String ItemName ="kurti pant set";
	
	public FlipkartLaunchPOM(WebDriver driver)
	{
		this.driver=driver;
				
	}
	
	private By SearchBar=By.xpath("//input[@class='_3704LK']");
	private By  listtext=By.xpath("//ul/li[@class='Y5N33s']");

	public void EnterName()
	{
		driver.findElement(SearchBar).sendKeys("one plus 10 pro");
	}

	public void GetList()
	{
		driver.findElement(SearchBar).sendKeys(Keys.ENTER);
	}
	
	/*public  FlipkartLaunchPOM Details()
	{
		driver.findElement(SearchBar).sendKeys("one plus 10 pro");
		driver.findElement(SearchBar).sendKeys(Keys.ENTER);
		return new FlipkartLaunchPOM(driver);
		
		
	}*/
		
	}
		
		
		









	