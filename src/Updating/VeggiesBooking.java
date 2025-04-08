package Updating;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VeggiesBooking {

	
//	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lakshmikarthik/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		String[] wishList = { "Cucumber", "Beetroot", "Brocolli" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		addItems(driver,wishList);
		VeggiesBooking v= new VeggiesBooking();
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
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


