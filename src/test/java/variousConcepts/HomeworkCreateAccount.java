package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkCreateAccount {
	static WebDriver driver;

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		
		

		driver.get("https://www.codefios.com/ebilling/login");

		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();
	}

}
