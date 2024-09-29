package practice_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_autosuggetion 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		WebElement s2=driver.findElement(By.id("twotabsearchtextbox"));
		s2.sendKeys("boys shoes");
		Thread.sleep(3000);
		List <WebElement> s3=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
        int count_of_s3=s3.size();
        System.out.println(count_of_s3);
        s3.get(4).click();
	}

}
