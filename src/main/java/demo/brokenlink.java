package demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlink {
		
	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		try
		{
		for(int i=0;i<=link.size();i++)
		{
			WebElement e=link.get(i);
			String url1=e.getAttribute("href");
			//verify(url);
	
			URL url=new URL(url1);
			HttpURLConnection hrc=(HttpURLConnection)url.openConnection();
			hrc.setConnectTimeout(5000);
			hrc.connect();
			if(hrc.getResponseCode()>=400)
			{
				System.out.println(url1+" - "+hrc.getResponseMessage()+"is a broken link");
			}
			else {
				System.out.println(url1+" - "+hrc.getResponseMessage());
			}
		}
		}
		catch(Exception e)
		{
			
		}
		
		
	}
		
		

	}


