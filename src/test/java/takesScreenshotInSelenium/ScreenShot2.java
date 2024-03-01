package takesScreenshotInSelenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		Thread.sleep(1000);
		driver.get("https://www.google.co.in");
		Thread.sleep(1000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		byte[] byteArray=ts.getScreenshotAs(OutputType.BYTES);
	    FileOutputStream obj=new FileOutputStream("./Screenshot/test12.png");
	    obj.write(byteArray);
	    Thread.sleep(1000);
	    obj.close();
	    driver.quit();
		
	}
	
}
