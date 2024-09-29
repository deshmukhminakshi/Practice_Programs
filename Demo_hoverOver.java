package practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_hoverOver 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement a1=driver.findElement(By.xpath("(//span[@class='nav-line-2'])[1]"));
		Actions a2=new Actions(driver);
		a2.moveToElement(a1).perform();
		Thread.sleep(3000);
		WebElement a3=driver.findElement(By.linkText("Learn more"));
		a3.click();
	}

}
