package practice_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/drag-and-drop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement drag_1=driver.findElement(By.id("drag7"));
		WebElement drop_1=driver.findElement(By.id("div2"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag_1, drop_1).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement drag_2=driver.findElement(By.id("div2"));
		WebElement drop_2=driver.findElement(By.id("div1"));
		a1.dragAndDrop(drag_2, drop_2).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement drag_3=driver.findElement(By.id("drag2"));
		WebElement drop_3=driver.findElement(By.id("div2"));
		a1.dragAndDrop(drag_3, drop_3).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement drag_4=driver.findElement(By.id("drag2"));
		WebElement drop_4=driver.findElement(By.id("div1"));
		a1.dragAndDrop(drag_4, drop_4).perform();

	}

}
