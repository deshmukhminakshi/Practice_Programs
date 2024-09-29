package practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Co_ordinates_1 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
	    WebElement f1=driver.findElement(By.linkText("Amazon Web Services"));
	    Point xandy=f1.getLocation();
	    int x=xandy.getX();
	    int y=xandy.getY();
	    System.out.println(x);
	    System.out.println(y);

	}

}
