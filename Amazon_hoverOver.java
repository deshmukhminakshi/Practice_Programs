package practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_hoverOver 
{

	public static void main(String[] args) 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement a2= driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(a2).perform();

	}

}
