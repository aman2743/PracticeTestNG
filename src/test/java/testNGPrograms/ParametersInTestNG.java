package testNGPrograms;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersInTestNG {
	WebDriver driver;
	SoftAssert softAssert;
	
    @Parameters("browserName")
	@BeforeTest 
	public void initialization(@Optional("chrome") String browserName) {
		switch(browserName.toLowerCase()){
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		}
	}

	@Parameters("sleeptime")
	@AfterTest
	public void TearDown(long sleeptime) throws NumberFormatException, InterruptedException{
		Thread.sleep(sleeptime);
		driver.quit();
	}

    @org.testng.annotations.Parameters("url")
	@Test 
	public void LaunchApp(String url) throws InterruptedException {
		driver.navigate().to(url);
		Thread.sleep(2000);
	}
    
    @Parameters({"username","password"})
	@Test 
	public void EnterLoginDeatils(String uname, String pwd) throws InterruptedException {
		driver.findElement(By.id("uid")).sendKeys(uname);
		driver.findElement(By.id("passw")).sendKeys(pwd);
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
