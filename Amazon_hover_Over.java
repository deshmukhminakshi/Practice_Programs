package practice_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_hover_Over 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement a1= driver.findElement(By.xpath("//span[@class=\"icp-nav-link-inner\"]"));
		Actions a2=new Actions(driver);
		a2.moveToElement(a1).perform();
		Thread.sleep(3000);
		List<WebElement> s1= driver.findElements(By.xpath("//div[@class='nav-template nav-flyout-content nav-tpl-itemList']/a"));
		int count_of_dp=s1.size();
		System.out.println(count_of_dp);
		s1.get(7).click();
	}

}
