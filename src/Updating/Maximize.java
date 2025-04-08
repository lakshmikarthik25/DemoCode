package Updating;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
//	        driver.manage().addCookie();
	        
	        driver.get("https://amazon.com/");
	        
	      File src=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(src, new File("C:\\Users\\Lakshmikarthik\\screenshot.png"));
	}

}
