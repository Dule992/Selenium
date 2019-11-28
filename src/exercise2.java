import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class exercise2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dusan-PC\\Desktop\\workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/practice.php");

		driver.manage().window().maximize();

		driver.findElement(By.id("checkBoxOption2")).click();

		WebElement text = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[2]"));

		String option = text.getText();

		driver.findElement(By.id("dropdown-class-example")).click();
		driver.findElement(By.id("dropdown-class-example")).sendKeys(option);

		driver.findElement(By.id("name")).sendKeys(option);

		driver.findElement(By.id("alertbtn")).click();

		String message = driver.switchTo().alert().getText();

		if (message.contains(option)) {

			System.out.println("Alert message success");
		} else {

			System.out.println("Something wrong with execution!");
		}

	}

}
