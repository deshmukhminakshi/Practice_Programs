package practice_programs;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class DemoRegistration 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/registration/");
		//driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("email"));
		e1.sendKeys("deshmukhminakshi1998@gmail.com");
		WebElement p1=driver.findElement(By.id("password"));
		p1.sendKeys("Minakshi@1234");
		WebElement r1=driver.findElement(By.id("male"));
		WebElement c1=driver.findElement(By.id("file"));
		c1.sendKeys("C:\\f1\\Manasi_N.pdf");

	}

}
