package annotate_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Shope_2 {
	public class Demo2 {
		ChromeDriver driver;
		@BeforeMethod
		public void Start() {

					driver=new ChromeDriver();
					driver.manage().window().maximize();
		}
		@Test
		public void begin() throws InterruptedException {
					driver.get("https://tutorialsninja.com/demo/");

			driver.findElement(By.xpath("//a[@title=\"My Account\"]")).click();

			//driver.findElement(By.xpath("//button[@data-ux-btn=\"primary\"]")).click();
			//driver.findElement(By.xpath("//span[@id=\"n-2566125698-membership-icon\"]")).click();
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("sana");
			driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("gowda");
			driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("sana45524@gmail.com");
			driver.findElement(By.xpath("//input[@name=\"telephone\"]")).sendKeys("9876543210");
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("S@123");
			driver.findElement(By.xpath("//input[@name=\"confirm\"]")).sendKeys("S@123");
			driver.findElement(By.xpath("//input[@name=\"newsletter\"]")).click();
			driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
			driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
			driver.findElement(By.linkText("Continue")).click();
			driver.findElement(By.linkText("Desktops")).click();
			driver.findElement(By.linkText("Mac (1)")).click();
			driver.findElement(By.xpath("//span[text()=\"Add to Cart\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@id=\"cart-total\"]")).click();
			driver.findElement(By.linkText("View Cart")).click();
			driver.findElement(By.linkText("Checkout")).click();
			String text = driver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]")).getText();
			System.out.println(text);
		}
		@AfterMethod
		public void end() {
			driver.quit();
				}
			}

}
