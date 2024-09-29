package practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCo_ordinates 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		WebElement a1=driver.findElement(By.linkText("United Arab Emirates"));
		Point xandy=a1.getLocation();
		int x=xandy.getX();
		int y=xandy.getY();
		System.out.println(x);
		System.out.println(y);
	}

}
