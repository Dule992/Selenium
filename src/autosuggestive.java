import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Enter the letters BENG
// Verify if Airport option is displayed in the suggestive box


public class autosuggestive {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dusan-PC\\Desktop\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();

		WebElement place = driver.findElement(By.id("fromPlaceName"));

		place.sendKeys("BENG");
		Thread.sleep(2000);
		
		// JavaScript DOM can extract hidden elements
		// Because Selenium cannot identify hidden elements - (Ajax implementation)
		// Investigate the properties of object if it have any hidden text

		// JavaScriptExecutor

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById(\"fromPlaceName\").value;";

		String text = (String) js.executeScript(script);
		
		System.out.println(text);
		
		int i = 0;
		
		//"BENGALURU INTERNATION AIRPORT" - the word we want to find

		while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			
			i++;
			
			place.sendKeys(Keys.DOWN);
			
			text = (String) js.executeScript(script);
			
			if(i>10) {
				
				break;
			}
		}
		
		if (i>10) {
			
			System.out.println("Element not found");
		}
		else {
			
			System.out.println("Verify pass: " + text);
			System.out.println("Element found");
		}
	}

}
