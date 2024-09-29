package practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Move 
{

	public static void main(String[] args) throws InterruptedException
	{
	    ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		//driver.manage().window().maximize();
		WebElement country=driver.findElement(By.linkText("Facebook"));
		Point xy=country.getLocation();
		int X=xy.getX();
		int Y=xy.getY();
		System.out.println(X);
		System.out.println(Y);
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveByOffset(1000,500).click().perform();

	}

}
