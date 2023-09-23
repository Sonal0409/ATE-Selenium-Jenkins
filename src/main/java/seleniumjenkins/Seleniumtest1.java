package seleniumjenkins;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Seleniumtest1 {
	
	@Test
	public void method1() throws InterruptedException
	{

		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		
		driver.manage().window().maximize();
		
		//1. Open the url on the browser
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//div[@class='floatL leftwidth']/descendant::input[3]")).click();
		
		Thread.sleep(3000);
		
		//Switch from current window to Alert box
		
		// Alert is a class in selenium, responsible to handle alert box element
		
		Alert a= driver.switchTo().alert();
		
		System.out.println(	a.getText());
		
		Thread.sleep(2000);
		
		a.accept();  // click on ok or Yes
		
		//a.dismiss();  // click on NO, cancel button on the alert box
		
	driver.findElement(By.xpath("//div[@class=\"table\"]/descendant::input[1]")).clear();
		driver.findElement(By.xpath("//div[@class=\"table\"]/descendant::input[1]")).sendKeys("sonal");	
	

	}

}
