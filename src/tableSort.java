import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class tableSort {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dusan-PC\\Desktop\\workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		// driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

		List<WebElement> firstCoList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));

		ArrayList<String> originalList = new ArrayList<String>();

		for (int i = 0; i < firstCoList.size(); i++) {

			originalList.add(firstCoList.get(i).getText());

		}
		
		ArrayList<String> copiedList = new ArrayList<String>();
		
		for (int i=0; i<originalList.size(); i++) {
			
			copiedList.add(originalList.get(i));
		}
		
		System.out.println("***********Copied List***************");
		
		Collections.sort(copiedList); 
		
		Collections.reverse(copiedList); // reverse list in another sort
		
		for (String s: copiedList) // for(i=0; i<copiedList.size(); i++)
		{
			System.out.println(s);
		}
		
		System.out.println("***********Original List***************");
		
		for (String s: originalList)
		{
			System.out.println(s);
		}
		
		Assert.assertTrue(originalList.equals(copiedList));

	}

}
