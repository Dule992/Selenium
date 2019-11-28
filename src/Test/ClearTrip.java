package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dusan-PC\\Desktop\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// calendar
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(2000);

		WebElement adult = driver.findElement(By.id("Adults"));

		Select s = new Select(adult);

		s.selectByIndex(2);

		WebElement ch = driver.findElement(By.id("Childrens"));

		Select s1 = new Select(ch);

		s1.selectByIndex(2);

		driver.findElement(By.id("MoreOptionsLink")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		Thread.sleep(2000);
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(2000);
		// validate error message
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
