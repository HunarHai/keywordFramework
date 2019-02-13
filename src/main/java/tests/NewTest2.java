package tests;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {
/*    private WebDriver driver;		*/
	@Test				
	public void testEasy() {
		System.out.println("Test method...");
/*		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 		*/
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test ...");
/*		System.setProperty("webdriver.chrome.driver", "H:\\Head First Java 2e\\Selenium\\Drivers\\Chrome\\chromedriver_win.exe");
		driver = new ChromeDriver();*/
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test...");
/*		driver.quit();			*/
	}
}
