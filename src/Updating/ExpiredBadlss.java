package Updating;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExpiredBadlss {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        options.setAcceptInsecureCerts(true);
	        
	        Proxy proxy = new Proxy();
	        proxy.setHttpProxy("ipAdress:0271");
	        options.setCapability("proxy", proxy);
	        
	        WebDriver driver = new ChromeDriver(options);
	        driver.get("https://expired.badssl.com");
	        System.out.println( driver.getTitle());
	        

	}

}
