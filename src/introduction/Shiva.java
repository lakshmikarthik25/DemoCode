package introduction;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Shiva{

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/msedgedriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.gecko.driver", "C:/Users/Lakshmikarthik/Documents/geckodriver.exe");

		driver.get("https://sso.teachable.com/secure/9521/identity/login/password?force=true");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("lakshmikarthik13256@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Lakshmi@123");
//		driver.findElement(By.xpath("//input[contains(@class,'m-l-0-xs')]")).click();
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		
		driver.findElement(By.linkText("Home")).click();
//		Thread.sleep(2000);
		System.out.println( driver.findElement(By.cssSelector("div[class='header-text hidden-xs'] h2")).getText());
		Assert.assertEquals( driver.findElement(By.cssSelector("div[class='header-text hidden-xs'] h2")).getText(), "An Academy to Learn Earn & Shine  in your QA Career"
);
		
		
	  
	
	}

}