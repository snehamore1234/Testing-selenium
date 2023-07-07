package demo;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class click {

	

			public static void main(String[] args) throws InterruptedException, IOException {
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get	("https://www.amazon.in/s?k=one+plus+8+pro&rh=p_89%3AOnePlus&dc&crid=2N6KVVAYTTR83&qid=1688627847&rnid=3837712031&sprefix=%2Caps%2C746&ref=sr_nr_p_89_2&ds=v1%3Air116FS5TPnHtLmukILRGa2PtaCDhR4xh7D3RDymeBM");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait (30,TimeUnit .SECONDS);
				Thread.sleep(1000);
				//driver.findElement(By.xpath("//div[@id='brandsRefinements']/child::ul/descendant::input[1]")).click();
				List<WebElement> l=driver.findElements(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
				Iterator a=l.iterator();
				String x="OnePlus 11 5G (Eternal Green, 8GB RAM, 128GB Storage)";
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

}
