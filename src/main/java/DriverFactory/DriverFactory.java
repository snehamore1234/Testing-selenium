package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory 
{

	

		public WebDriver driver;
		
		
		public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<>();
		
		//this method is used to initialize the threadlocal driver on the basis of given browser
		
		public WebDriver init_driver(String browser)
		{
			System.out.println("Driver name which we using......"+browser);
			if(browser.equals("chrome"))
			{
				 WebDriverManager.chromedriver().setup();
			
				tldriver.set(new ChromeDriver());
				
			}
			else if(browser.equals("FireFox"))
			{
				WebDriverManager.firefoxdriver().setup();
				tldriver.set(new FirefoxDriver());
			}
			else if(browser.equals("Safari"))
			{
				tldriver.set(new SafariDriver());
			}
			
			else
			{
				System.out.println("kindly pass valid name of browser"+browser);
			}
		
			getDriver().manage().deleteAllCookies();
			getDriver().manage().window().maximize();
			return getDriver();
			
		}
		/*
		 * use to get the driver with threadlocal
		  */
		
		public static synchronized WebDriver getDriver()
		{		
			return tldriver.get();
			
		}
		
	}	
		
		
		
	
	

