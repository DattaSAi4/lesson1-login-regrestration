package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Regristration {

	
	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_phone_number")).sendKeys("SaiVinay");
		driver.findElement(By.id("ap_phone_number")).sendKeys("9569679999");
		driver.findElement(By.id("ap_email")).sendKeys("psaivinay@123gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("continue")).click();
	}
}
