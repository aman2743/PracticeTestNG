package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionFirstTest {

	WebDriver driver;
	@Test
	public void GoogleSearch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("HYR tutorials",Keys.ENTER);
		System.out.println( driver.getTitle());
		//Assertion in the script

		Thread.sleep(1000);    
		driver.quit();
	}

	@ Test
	public void TestFacebook() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("Test123",Keys.ENTER);
		Thread.sleep(2000);

		//Assert Facebook title
		String expectedTitle="Log in to Facebook";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle,"Test Case is pass");

		//Text Assertion
//		String expectedText="Test123";
//		String actualText= driver.findElement(By.id("email")).getAttribute("Value");
//		Assert.assertEquals(actualText, expectedText, "Text mismatched");

		//Border Assertion
//		String expectedBorder="1px solid rgb(221, 223, 226)";
//		String actualBorder=driver.findElement(By.id("Email")).getCssValue("border");
//		Assert.assertEquals(actualBorder, expectedBorder, "Border Mismatched");

		//Error Message Assertion
//		String expectedMessage="Invalid username or password";
//		String actualMessage=driver.findElement(By.xpath("//div[text()='Invalid username or password']")).getText();
//		Assert.assertEquals(actualMessage, expectedMessage,"Error message Mismatched");

		//Assert URL
//		String expectedURL="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzA2MDMyMTAyLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
//		String actualURL=driver.getCurrentUrl();
//		Assert.assertEquals(actualURL, expectedURL, "URL mismatched");

		Thread.sleep(1000); 
		driver.quit();
	}
     @Test
	public void LoginTestFire() {
        SoftAssert softAssert=new SoftAssert();
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.navigate().to("https://demo.testfire.net/login.jsp");
    	driver.findElement(By.id("uid")).sendKeys("test123");
    	driver.findElement(By.id("passw")).sendKeys("test12");
    	driver.findElement(By.name("btnSubmit")).click();
    	// Verify Title
    	String expectedTitle="Altoro 12Mutual";
    	String actualTitle=driver.getTitle();
//    	Assert.assertEquals(actualTitle, expectedTitle,"Title Mismatched");//Hard assert
    	softAssert.assertEquals(actualTitle, expectedTitle,"Title Mismatched");//Soft Assert
    	
    	//Verify URL
    	String expectedURL="https://demo.testfire.net/login.jsp";
    	String actualURL=driver.getCurrentUrl();
//    	Assert.assertEquals(actualURL, expectedURL,"URL Mismatched");//Hard Assert
    	softAssert.assertNotEquals(actualURL, expectedURL,"URL Mismatched");//SoftAssert
    	
      	//Verify text inside the field
    	String expectedText="";
    	String actualText=driver.findElement(By.id("uid")).getAttribute("value");
//    	Assert.assertEquals(actualText, expectedText,"Text Mismatched"); //Hard Assert
    	softAssert.assertEquals(actualText, expectedText,"Text Mismatched");//Soft Assert
    	
    	//Verify Error Message
    	String expectedMessage="Login Failed: We're sorry, but this username or password was not found in our system. Please try again.";
    	String actualMessage=driver.findElement(By.xpath("//span[@id='_ctl0__ctl0_Content_Main_message']")).getText();
//    	Assert.assertEquals(actualMessage, expectedMessage,"Message mismatched");//Hard Assert
    	softAssert.assertEquals(actualMessage, expectedMessage,"Message mismatched");//Soft Assert
    	
    	//Verify border
    	String expectedWidth="150px";
    	String actualWidth=driver.findElement(By.id("uid")).getCssValue("width");
//    	Assert.assertEquals(actualWidth, expectedWidth,"Border Mismatched"); //Hard Assert
    	softAssert.assertEquals(actualWidth, expectedWidth,"Border Mismatched"); //Soft Assert
  
    	driver.quit();	
    	softAssert.assertAll();
	}	
}
