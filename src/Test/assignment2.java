package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dusan-PC\\Desktop\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement table = driver.findElement(By.id("product"));

		System.out.println("Total rows: " + table.findElements(By.tagName("tr")).size());

		System.out.println("Total columns: " + table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		List<WebElement> secondRaw = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

		String instructor = secondRaw.get(0).getText();

		String course = secondRaw.get(1).getText();

		String price = secondRaw.get(2).getText();

		System.out.println("Instructor: " + instructor + "\n" + "Course: " + course + "\n" + "Price: " + price);

	}

}
