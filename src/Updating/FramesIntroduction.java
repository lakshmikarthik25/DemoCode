package Updating;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesIntroduction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.cssSelector(".demo-frame")).size());
		driver.switchTo().frame(0);
//		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		Actions a = new Actions(driver);
		  WebElement source = driver.findElement(By.id("draggable"));
		  WebElement target = driver.findElement(By.id("droppable"));
		          
		          
		   a.dragAndDrop(source, target).build().perform()   ;    
           
	}

}
