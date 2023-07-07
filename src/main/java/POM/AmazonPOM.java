package POM;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonPOM 
{
	
	private WebDriver driver;
	
	public AmazonPOM(WebDriver driver)
	{
	this.driver=driver;	
	}
	
	//private By account=By.xpath("//select[@id='searchDropdownBox']");
			private By selectdrop=By.xpath("//select[@id='searchDropdownBox']");			
			private By entertext=By.xpath("//input[@id='twotabsearchtextbox']");
			private By filter=By.xpath("//div[@id='brandsRefinements']/child::ul/descendant::input[1]");
			private By selectprod=By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']");
			private By buy=By.xpath("//input[@id='buy-now-button']");
	
	public String Title()
	{
		String title=driver.getTitle();
		return title;
		
	}
	
	public void dropdown()
	{
		WebElement s=driver.findElement(selectdrop);
		s.click();
		Select a=new Select(s);
		a.selectByIndex(0);
		
	}
	public void search()
	{
		WebElement w=driver.findElement(entertext);
		w.sendKeys("one plus 8 pro");
		
	}
	public void enterbutton()
	{
		WebElement w=driver.findElement(entertext);
		w.sendKeys(Keys.ENTER);
	}
	public void filter()
	{
		WebElement w=driver.findElement(filter);
		Actions a=new Actions(driver);
		a.doubleClick(w);
	}
	public void selectproduct()
	{
		
		List<WebElement> l=driver.findElements(selectprod);
		Iterator a=l.iterator();
		String x="OnePlus Nord CE 3 Lite 5G (Pastel Lime, 8GB RAM, 128GB Storage)";
		while(a.hasNext())
		{
		WebElement i= (WebElement) a.next();
			System.out.println("list"+i.getText());
			if(i.getText().equals(x))
			{
				System.out.println("hiii");
				i.click();
			}
			
		}
		
	}
	
	public void winhandel()
	{
		
		for(String winhandle:driver.getWindowHandles())
		{
			driver.switchTo().window(winhandle);
		System.out.println("Window switch to child window");	
		}
	}
	public void buy()
	{
		driver.findElement(buy).click();
	}
	
	
	
}
