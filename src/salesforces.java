

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforces {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dusan-PC\\Desktop\\workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/");
		
		/*driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.id("password")).sendKeys("123456");
		// driver.findElement(By.className("button r4 wide primary")).click(); //Error for Selenium, because class name is wrong written
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		*/
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("fsc");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("sadsas");
		//driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		
		/* 
		 1.Verify in ChroPath before you run the script
		 2.css customized xpath
		 3.#idname .classname
		 4. find the unique attribute
		 */
		
		
		/*	css=	tagname[attribute='value']
		 
		  xpath= //tagname[@attribute='value']
		 */
				

	}

}
