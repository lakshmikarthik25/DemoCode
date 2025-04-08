package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='name']")).sendKeys("lakshmikarthik");
		driver.findElement(By.name("email")).sendKeys("lakshmi@123");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Paapu@0325");
		driver.findElement(By.id("exampleCheck1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']/option[1] ")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("25062003");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());

	}

}
