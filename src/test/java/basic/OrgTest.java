package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrgTest {

	@Test
	public void CreateOrgTest() {
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost:8888/");
		
	}
}
