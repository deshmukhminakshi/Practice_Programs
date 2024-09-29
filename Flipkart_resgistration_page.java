package practice_programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_resgistration_page 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/account/?rd=0&link=home_account");
		driver.manage().window().maximize();
		

	}

}
