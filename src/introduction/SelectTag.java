package introduction;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SelectTag {
public static void main(String[] args) {
	
	
	         WebDriver driver = new ChromeDriver();
	         driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
	         
	         WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	         
	         Select dropdown = new Select(staticDropdown);
	         dropdown.selectByIndex(3);
	        System.out.println( dropdown.getFirstSelectedOption().getText());
	         dropdown.selectByValue("INR");
	         System.out.println( dropdown.getFirstSelectedOption().getText());
	         dropdown.selectByVisibleText("AED");
	         driver.findElement(By.className(".ui-state-default.ui-state-active")).click();
	         
;}
}
