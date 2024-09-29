package practice_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggetion 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement s1= driver.findElement(By.id("APjFqb"));
		s1.sendKeys("India");
		Thread.sleep(3000);
		List<WebElement> au=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count_of_au=au.size();
        System.out.println(count_of_au);
        au.get(9).click();
	}

}
