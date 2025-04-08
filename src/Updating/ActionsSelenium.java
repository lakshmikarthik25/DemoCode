package Updating;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("#nav-link-accountList"));
		
		a.moveToElement(move).build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("karthkRaBeete").doubleClick().build().perform();
		a.moveToElement(move).contextClick().build().perform();

	}

}
