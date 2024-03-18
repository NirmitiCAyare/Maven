package basic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrgTest {

	@Test
	public void CreateOrgTest() throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		
		//To maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/");
		//To apply wait for findElement()
//		wutil.implicitwait(driver);
		
//		//To read data from Property File
//		String URL = putil.getDataFromPropertyFile("Url");
//		String USERNAME =putil.getDataFromPropertyFile("Username");
//		String PASSWORD = putil.getDataFromPropertyFile("Password");
//		
//		//To launch the application
//		driver.get(URL);
		
		//Login the application
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

		
	}
}
