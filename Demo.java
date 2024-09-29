package practice_programs;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement ty=driver.findElement(By.id("twotabsearchtextbox"));
		ty.sendKeys("Shoes for women");
	    List<WebElement> s2=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
        int count=s2.size();
        System.out.println(count);
        s2.get(8).click();
	    
	}

}
