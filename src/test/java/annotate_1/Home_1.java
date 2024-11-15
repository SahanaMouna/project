package annotate_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Home_1 {

		ChromeDriver driver;
		 ExtentReports report;
		 @BeforeSuite
		 public void term1() {
			 System.out.println("started Sucessfully");
		 }
		 @BeforeTest
		 public void start() {
			 System.out.println("test started");
		 }
	
		@BeforeMethod
		public void begin() {

			driver=new ChromeDriver();
			driver.manage().window().maximize();
			String path = System.getProperty("user.dir")+"\\reports\\index.html";
			ExtentSparkReporter reporter=new ExtentSparkReporter(path);
			reporter.config().setReportName("shopping website report");
			reporter.config().setDocumentTitle("OMAYO BLOG");
			report=new ExtentReports();
			report.attachReporter(reporter);
			report.setSystemInfo("created by", "MAM");
			report.setSystemInfo("operating system", "windows");
}
		
		
		@Test
		public void demo() {
			ExtentTest etest = report.createTest("test_1");
			driver.get("https://omayo.blogspot.com/");
			etest.info("website opened");
			driver.findElement(By.linkText("Open a popup window")).click();
			Set<String> win = driver.getWindowHandles();
			Iterator<String> itr = win.iterator();
			String parent = itr.next();
			String child = itr.next();
			driver.switchTo().window(child);
			String name = driver.findElement(By.xpath("//h3[text()=\"New Window\"]")).getText();	
			etest.info("Text content identified");
//			driver.findElement(By.id("ironman4")).click();
			etest.info("TEST RUNNED SUCCESSFULLY");
		
		}

 @AfterTest
	   public void testReporting() {
	       System.out.println("Test Report generated using AfterTest");	
	      
	       }
		 @AfterSuite
		 public void term() {
			 System.out.println("Running Sucessfully");
			
		 }
		 public void end() {
				driver.quit();
				System.out.println("end of TEST");
			}
}
	