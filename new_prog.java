package practice_programs;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class new_prog 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/registration/createAccount");
		//driver.manage().window().maximize();
		WebElement g1=driver.findElement(By.xpath("//span[.=\"Google\"]"));
		g1.click();
		String parent=driver.getWindowHandle();
		System.out.println("parent" +parent);
		Set<String> parent_child=driver.getWindowHandles();
		System.out.println("parent_child" +parent_child);
	    //WebElement g2=driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf'][1]"));
	    //g2.sendKeys("deshmukhminakshi1998@gmail.com");
		
		//driver.close();//this close that browser which has control
	    Iterator<String> pc=parent_child.iterator();
	    String id1= pc.next();//parent_id
	    String id2= pc.next();//1st child_id
	    System.out.println(id1);
	    System.out.println(id2);
	    driver.switchTo().window(id2);
	    Thread.sleep(3000);
	    //driver.close();
	    WebElement g2=driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf'][1]"));
	    g2.sendKeys("deshmukhminakshi1998@gmail.com");
	    WebElement g3= driver.findElement(By.id("identifierNext"));
	    g3.click();
	}

}
