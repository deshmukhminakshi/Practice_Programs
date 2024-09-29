package practice_programs;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_dropdown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		WebElement s1=driver.findElement(By.id("searchDropdownBox"));
		Select ddown=new Select(s1);
		ddown.selectByVisibleText("Amazon Fashion");
		List<WebElement> w1=ddown.getOptions();
		Thread.sleep(2000);
		List<WebElement> s2=driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
		System.out.println(w1.size());
		for(WebElement p:s2)
		{
			System.out.println(p.getText());
		}

	}

}
