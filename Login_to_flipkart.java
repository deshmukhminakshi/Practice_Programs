package practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_to_flipkart 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        WebElement a1=driver.findElement(By.xpath("//input[@class=\"_18u87m _3WuvDp\"]"));
        a1.sendKeys("8669115060");
        WebElement a2=driver.findElement(By.xpath("//button[.='Request OTP']"));
        a2.click();
	}

}
