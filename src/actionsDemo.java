import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dusan-PC\\Desktop\\workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		/*
		 * driver.get("https://cubes.edu.rs");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * Actions a = new Actions(driver);
		 * 
		 * WebElement move =
		 * driver.findElement(By.xpath("//a[contains(text(),'Kursevi')]"));
		 * 
		 * a.moveToElement(driver.findElement(By.id("instant-input"))).click().keyDown(
		 * Keys.SHIFT).sendKeys("qa").doubleClick().build().perform(); //Moves to
		 * Specific element a.moveToElement(move).contextClick().build().perform();
		 */

		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator();

		String parentWindow = it.next();

		driver.switchTo().window(it.next());

		WebElement newTab = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]"));

		System.out.println(newTab.getText());

		driver.switchTo().window(parentWindow);

		WebElement firstTab = driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]"));

		System.out.println(firstTab.getText());

	}

}
