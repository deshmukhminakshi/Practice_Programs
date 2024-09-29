package practice_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down 
{

	public static void main(String[] args) throws InterruptedException 
	{  
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement ddown=driver.findElement(By.id("searchDropdownBox"));
		Select ddown1=new Select(ddown);
		List<WebElement> e=ddown1.getOptions();
		//System.out.println(allItems.size());
		Thread.sleep(2000);
		List<WebElement> ddown_3=driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
		System.out.println(e.size());
		for(WebElement p:ddown_3)
		{
			System.out.println(p.getText());
		}
		
		
		

	}

}
