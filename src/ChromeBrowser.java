
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class ChromeBrowser {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dusan-PC\\Desktop\\workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		/*driver.get("http://google.com");
		System.out.println("Trenutno smo na stranici: " + driver.getTitle()); // validate if you Page title is correct

		System.out.println(driver.getCurrentUrl()); // validate if you are landed on correct url

		System.out.println(driver.getPageSource()); //print page source
		
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close(); //It closes current browser
		driver.quit(); // It closes all the browsers opened by selenium script
		*/
		driver.get("http://facebook.com");
		//driver.findElement(By.className("inputtext")).sendKeys("HelloWorld");
		/*driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgot account?")).click();*/
		
		driver.findElement(By.cssSelector("#email")).sendKeys("HelloWorld");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
		getScreenshot(driver);
		
	}
	private static void getScreenshot(WebDriver driver) throws IOException {
		
		driver.get("http://google.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Files.copy(src, new File("C:\\Users\\Dusan-PC\\Desktop\\workspace\\Automation testing\\screenshot.png"));
	}
}
