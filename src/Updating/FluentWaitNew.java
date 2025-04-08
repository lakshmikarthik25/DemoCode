package Updating;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class FluentWaitNew {

	private static final Wait<WebDriver> wait = null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		FluentWaitNew v= new FluentWaitNew();
		
		String[] wishList = { "Cucumber", "Beetroot", "Brocolli" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		addItems(driver,wishList);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
	
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.cssSelector("span.promoInfo"));
			}
		});
		
				System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		

	}
	public static void addItems(WebDriver driver,String[] wishList) {
		int j = 0;
		
	 List<WebElement> options = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < options.size(); i++) {

			String[] name = options.get(i).getText().split("-");
			String formateName = name[0].trim();

			List<String> addAll = Arrays.asList(wishList);

			if (addAll.contains(formateName)) {

				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j==wishList.length) {
					break;
				}
			}

		}
	}

}
