package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationScenarion {
	WebDriver driver;
	SoftAssert softAssert;

	@BeforeTest 
	public void initialization() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void TearDown(){
		driver.quit();
	}


	@Test 
	public void LaunchApp() throws InterruptedException {
		driver.navigate().to("https://demo.testfire.net/login.jsp");
		Thread.sleep(2000);
	}
	@Test 
	public void EnterLoginDeatils() throws InterruptedException {
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("demo1234");
		driver.findElement(By.name("btnSubmit")).click(); 
		Thread.sleep(3000);
	}
	@Test
	public void VerifyLogin() {
		softAssert=new SoftAssert();
		Boolean b=driver.findElement(By.xpath("//font[text()='Sign Off']")).isDisplayed();
		softAssert.assertTrue(b);	
	}
	@Test
	public void SmallBusinessPageLaunch() {
		boolean b=driver.findElement(By.xpath("//a[text()='SMALL BUSINESS']")).isDisplayed();
		if(b==true) {
			System.out.println("Link shown to the user");
			driver.findElement(By.xpath("//a[text()='SMALL BUSINESS']")).click();
		}
		else {
			System.out.println("Link not ");
		}   
	}

	@Test 
	public void VerifySmallBusinessPage() {
		boolean b1=driver.findElement(By.xpath("//h1[text()='Small Business']")).isDisplayed();
		if(b1==true) {
			System.out.println("user at right page");
		}
		else {
			System.out.println("User at incorrect page");
		}
	}
}
