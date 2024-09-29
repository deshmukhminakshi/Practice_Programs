package practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_GTM 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement fn= driver.findElement(By.id("fname"));
		fn.sendKeys("Manasi");
		Thread.sleep(3000);
		WebElement ln=driver.findElement(By.id("lname"));
		ln.sendKeys("Naik");
		Thread.sleep(3000);
		WebElement us=driver.findElement(By.id("Username"));
		us.sendKeys("manasinaik@1234");
		Thread.sleep(3000);
		WebElement ps=driver.findElement(By.name("password"));
		ps.sendKeys("12345678");
		WebElement ge=driver.findElement(By.id("FeMale"));
		ge.click();
		WebElement se=driver.findElement(By.id("Skills"));
		Select s1=new Select(se);
		s1.selectByVisibleText("Technical Skills");
		WebElement ad=driver.findElement(By.id("w3review"));
		ad.sendKeys("Nagpur");
		//int min=60;
		Thread.sleep(3000);
		WebElement f1=driver.findElement(By.id("Country"));
		Select s2=new Select(f1);
		s2.selectByVisibleText("Combodia ");
		Thread.sleep(3000);
		WebElement pe=driver.findElement(By.id("Address"));
		pe.sendKeys("Pune");
		Thread.sleep(2000);
		WebElement pi=driver.findElement(By.id("Pincode"));
		pi.sendKeys("443404");
		Thread.sleep(2000);
		WebElement sr=driver.findElement(By.id("Relegion"));
		Select s3=new Select(sr);
		s3.selectByVisibleText("Adherent");
		Thread.sleep(2000);
		WebElement res=driver.findElement(By.name("Resume"));
		res.sendKeys("C:\\f1\\Manasi_N.pdf");
		WebElement check_box=driver.findElement(By.id("Agree"));
		check_box.click();
		Thread.sleep(2000);
		WebElement sub=driver.findElement(By.xpath("(//div//input)[38]"));
		sub.click();

	}

}
