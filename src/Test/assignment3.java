package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dusan-PC\\Desktop\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();

		WebElement country = driver.findElement(By.id("autocomplete"));

		country.sendKeys("RUS");
		Thread.sleep(3000);

		/*
		 * for (int i = 0;i<4; i++) { country.sendKeys(Keys.DOWN); }
		 * 
		 * System.out.println(country.getAttribute("value"));
		 */

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String script = "return document.getElementById(\"autocomplete\").value;";
		
		String text = (String) js.executeScript(script);
		
		int i = 0;
		
		while (!text.equalsIgnoreCase("Russian Federation")) {
			
			i++;
			country.sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);

			if (i > 10) {
				break;
			}

		}
		if (i > 10) {

			System.out.println("Element not found");

		} else {

			System.out.println("Verify pass: " + text);
			System.out.println("Element found");

		}

	}

}
