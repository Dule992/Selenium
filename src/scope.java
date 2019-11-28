import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dusan-PC\\Desktop\\workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/practice.php");

		driver.manage().window().maximize();

		// 1. Give me the count of the links on the page.
		// 2. Count of the footer section.

		// a - Limiting WebDriver scope

		WebElement headerDriver = driver.findElement(By.xpath("//header[@class='jumbotron text-center header_style']"));

		System.out.println("Header links: " + headerDriver.findElements(By.tagName("a")).size());

		System.out.println("Body links: " + driver.findElements(By.tagName("a")).size());

		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

		System.out.println("Footer links: " + footerDriver.findElements(By.tagName("a")).size());

		// 3. Count of the column section

		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		System.out.println("Column links: " + columnDriver.findElements(By.tagName("a")).size());
		
		// 4. Click on each link in the column section and check if the pages are opening
		
		for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
			
			String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000L);
		} // opens all the tabs
		
			Set<String> abc = driver.getWindowHandles(); //4
			
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext()) {
				
				driver.switchTo().window(it.next());
				
				System.out.println(driver.getTitle());
			}
		}

}


