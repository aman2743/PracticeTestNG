package captureScreenshotFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ScreenshotTest extends BaseClass {
	SoftAssert softAssert = new SoftAssert();

	@Test(priority = 1)
	public void GoogleSearch() throws InterruptedException {
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("HYR tutorials", Keys.ENTER);
		// Assertion in the script
		String actualText = driver.findElement(By.xpath("(//span[contains(text(),'H Y R Tutorials')])[1]")).getText();
		String expectedText = "Test";
		Assert.assertEquals(actualText, expectedText);
		Thread.sleep(1000);
	}
	@Test(priority = 2 )
	public void OrangeHRM() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		// Assert OrangeHRM title
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		softAssert.assertEquals(actualTitle, expectedTitle, "Title Mismatched");
	}

	@Test(priority = 3)
	public void LoginTestFire() {
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://demo.testfire.net/login.jsp");
		driver.findElement(By.id("uid")).sendKeys("test123");
		driver.findElement(By.id("passw")).sendKeys("test12");
		driver.findElement(By.name("btnSubmit")).click();
		// Verify Title
		String expectedTitle = "Altoro 12Mutual";
		String actualTitle = driver.getTitle();
//    	Assert.assertEquals(actualTitle, expectedTitle,"Title Mismatched");//Hard assert
		softAssert.assertEquals(actualTitle, expectedTitle, "Title Mismatched");// Soft Assert

		// Verify URL
		String expectedURL = "https://demo.testfire.net/login.jsp";
		String actualURL = driver.getCurrentUrl();
//    	Assert.assertEquals(actualURL, expectedURL,"URL Mismatched");//Hard Assert
		softAssert.assertNotEquals(actualURL, expectedURL, "URL Mismatched");// SoftAssert

		// Verify text inside the field
		String expectedText = "";
		String actualText = driver.findElement(By.id("uid")).getAttribute("value");
//    	Assert.assertEquals(actualText, expectedText,"Text Mismatched"); //Hard Assert
		softAssert.assertEquals(actualText, expectedText, "Text Mismatched");// Soft Assert

		// Verify Error Message
		String expectedMessage = "Login Failed: We're sorry, but this username or password was not found in our system. Please try again.";
		String actualMessage = driver.findElement(By.xpath("//span[@id='_ctl0__ctl0_Content_Main_message']")).getText();
//    	Assert.assertEquals(actualMessage, expectedMessage,"Message mismatched");//Hard Assert
		softAssert.assertEquals(actualMessage, expectedMessage, "Message mismatched");// Soft Assert

		// Verify border
		String expectedWidth = "150px";
		String actualWidth = driver.findElement(By.id("uid")).getCssValue("width");
//    	Assert.assertEquals(actualWidth, expectedWidth,"Border Mismatched"); //Hard Assert
		softAssert.assertEquals(actualWidth, expectedWidth, "Border Mismatched"); // Soft Assert
		softAssert.assertAll();
	}

}
