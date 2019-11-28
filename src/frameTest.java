import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dusan-PC\\Desktop\\workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		/*
		 * driver.get("https://jqueryui.com/droppable/");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * //driver.switchTo().frame(0);
		 * 
		 * System.out.println(driver.findElements(By.tagName("iframe")).size());
		 * 
		 * driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		 * 
		 * WebElement drag = driver.findElement(By.id("draggable"));
		 * 
		 * WebElement drop = driver.findElement(By.id("droppable"));
		 * 
		 * Actions a = new Actions(driver);
		 * 
		 * a.dragAndDrop(drag, drop).build().perform();
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * driver.findElement(By.linkText("Accept")).click();
		 */

		driver.get("https://the-internet.herokuapp.com/nested_frames");

		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-right");
		
		System.out.println(driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText());
		
		

	}

}
