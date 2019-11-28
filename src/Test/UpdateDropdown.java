package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//TestNG is one of the testing framework

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dusan-PC\\Desktop\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// .ui-state-default.ui-state-highlight.ui-state-active

		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		/*
		 * Count the number of checkboxes
		 * 
		 * System.out.println(driver.findElements(By.cssSelector(
		 * "input[type='checkbox']")).size());
		 * driver.findElement(By.id("divpaxinfo")).click();
		 * Assert.assertTrue(driver.findElement(By.id("divpaxinfo")).isSelected());
		 * Thread.sleep(2000L);
		 * 
		 * 
		 * int i = 1; while (i < 5) {
		 * driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click(); // 4 times
		 * i++; }
		 * 
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 * 
		 * for(int n=1;n<5;n++) {
		 * driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click(); }
		 * 
		 * driver.findElement(By.id("btnclosepaxoption")).click();
		 * Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),
		 * "5 Adult");
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 */
	}

}
