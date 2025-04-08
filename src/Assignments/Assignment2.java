package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy ");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.id("usertype")).click();
		driver.findElement(By.cssSelector("option[value='consult']")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

	}
	public void newTest() {
		System.out.println(";pikla");
		System.out.println("sudiii");
		System.out.println("ds;koola");
		System.out.println("tamall");
	}
	public void newTest1() {
		System.out.println(" ghibhi pikla");
		System.out.println("gaadu sudiii");
		System.out.println("ds;koola");
		System.out.println("tamall");
	}
	public void newTest2() {
		System.out.println("tath pikla");
		System.out.println("sudiii");
		System.out.println("ds2;koola");
		System.out.println("tamall");
	}
	public void newTest3() {
		System.out.println("tath pikla");
		System.out.println("sudiii");
		System.out.println("ds2;koola");
		System.out.println("tamall");
	}
	public void newTest4() {
		System.out.println("tath pikla");
		System.out.println("sudiii");
		System.out.println("ds2;koola");
		System.out.println("tamall");
	}
	public void newTest5() {
		System.out.println("tath pikla");
		System.out.println("sudiii");
		System.out.println("ds2;koola");
		System.out.println("tamall");
	}

}
