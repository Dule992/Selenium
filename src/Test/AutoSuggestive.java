package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dusan-PC\\Desktop\\workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement source = driver.findElement(By.id("fromCity"));
		source.click();
		source.sendKeys("MUM");
		source.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);

		WebElement destination = driver.findElement(By.id("toCity"));
		destination.click();
		destination.sendKeys("DEL");
		Thread.sleep(2000);

		for (int i = 1; i < 5; i++) {
			destination.sendKeys(Keys.ARROW_DOWN);
		}

		destination.sendKeys(Keys.ENTER);

	}

}
