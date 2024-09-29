package practice_programs;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_to_cart 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
	    WebElement se=driver.findElement(By.id("twotabsearchtextbox"));
	    se.sendKeys("Kurtis for women");
	    Thread.sleep(4000);
	    List <WebElement> list_1= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	    int count=list_1.size();
	    System.out.println(count);
	    list_1.get(7).click();
	    List <WebElement> list_2= driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
	    int count_2=list_2.size();
	    Thread.sleep(3000);
	    System.out.println(count_2);
	    list_2.get(4).click();
	    //String parent=driver.getWindowHandle();
	   // System.out.println("parent" +parent);
	    Set<String> parent_child=driver.getWindowHandles();
	   // System.out.println("parent_child" +parent_child);
	    Iterator<String> pc=parent_child.iterator();
	    String id_1=pc.next();
	   // System.out.println(id_1);
	    String id_2=pc.next();
	    //System.out.println(id_2);
	    driver.switchTo().window(id_2);
	    Thread.sleep(3000);
	    WebElement add_to_cart=driver.findElement(By.id("add-to-cart-button"));
	    add_to_cart.click();
	    Thread.sleep(3000);
	    driver.switchTo().window(id_1);
	    driver.close();
	    Thread.sleep(3000);
	    driver.switchTo().window(id_2);
	    driver.close();

	}

}
