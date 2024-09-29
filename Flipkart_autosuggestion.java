package practice_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_autosuggestion 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
       WebElement b1=driver.findElement(By.className("Pke_EE"));
       b1.sendKeys("Shoes");
       Thread.sleep(3000);
       List<WebElement> a1= driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
       int a2=a1.size();
       System.out.println(a2);
       a1.get(0).click();
	}

}
