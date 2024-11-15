package annotate_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class shop_1 {
	
		ChromeDriver driver;
		@BeforeMethod
		public void begin_1()  {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		@Test
		public  void mid_1() {
			driver.get("https://seleniumpractise.blogspot.com/");
			
		}
		@AfterMethod
		public void end() {
			driver.quit();
		}
	}


