package tests;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
//	public static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class method...started");
/*		System.setProperty("webdriver.chrome.driver", "H:\\Head First Java 2e\\Selenium\\Drivers\\Chrome\\chromedriver_win.exe");
		driver = new ChromeDriver();*/
		System.out.println("Before Class method...completed");
	}
	
	@Test
	public void openMyBlog() {
		System.out.println("Test method...started");
/*		driver.get("https://www.softwaretestingmaterial.com/");*/
		System.out.println("Test method...completed");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class method...started");
/*		driver.quit();*/
		System.out.println("After Class method...completed");
	}
	
}