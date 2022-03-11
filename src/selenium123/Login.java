package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	
	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("ap_email")).sendKeys("psaivinay2@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("DattaSai2");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
