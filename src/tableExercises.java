import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableExercises {

	public static void main(String[] args) {
		
		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dusan-PC\\Desktop\\workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22978/afg-vs-wi-only-test-afghanistan-v-west-indies-in-india-2019");

		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.cssSelector("[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		int rawCount = table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for (int i=0; i<count-2; i++) {
			
		String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		
		int valueInteger = Integer.parseInt(value);
		
		sum = sum +valueInteger; 
		}
		
		System.out.println("Points: " + sum);
		
		String extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		
		System.out.println("Extras: " + extras);
		
		int extrasInteger = Integer.parseInt(extras);
		
		int total = sum + extrasInteger;
		
		System.out.println("Check total: " + total);
		
		String actualTotalValue = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		
		System.out.println("Total: " + actualTotalValue);
		
		int actualTotalValueInt = Integer.parseInt(actualTotalValue);
		
		if (actualTotalValueInt == total) {
			
			System.out.println("Count Matches");
		}
		else {
			
			System.out.println("Count Failes");
		}
	}

}
