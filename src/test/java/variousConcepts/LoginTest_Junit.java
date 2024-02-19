package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
	
	WebDriver driver;
	
	@Before
	public void LaunchCode() {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Super\\Selenium\\crm\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		// Delete the cookies first
		driver.manage().deleteAllCookies();
		// Go to website
		driver.get("https://www.codefios.com/ebilling/login");
		// Maximize the window
		driver.manage().window().maximize();
		// Manage time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@After
	public void CloseBrowser() throws InterruptedException {

		Thread.sleep(3000);
		driver.close();
	}

	@Test
	public void positiveLoginTest() {

		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();
	}

	@Test
	public void negativeLoginTest() {

		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc12345");
		driver.findElement(By.id("login_submit")).click();
	}

}



