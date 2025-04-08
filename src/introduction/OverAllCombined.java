package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OverAllCombined {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
	
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
      driver.findElement(By.xpath("//a[@value='BLR']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	}

	}


