package practice_programs;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Practice 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Women Shoes");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement a1=driver.findElement(By.xpath("(//div[@class='s-image-padding'])[1]"));
		a1.click();
		String parent=driver.getWindowHandle();
		System.out.println("Id of parent window: "+parent);
		Set <String> parent_child=driver.getWindowHandles();
		System.out.println("Id of child window: "+parent_child);
		Iterator <String> pc=parent_child.iterator();
		String id_1=pc.next();
		String id_2=pc.next();
		System.out.println(id_1);
		System.out.println(id_2);
		driver.switchTo().window(id_2);
	}

}
