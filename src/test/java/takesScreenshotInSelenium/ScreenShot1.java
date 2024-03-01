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

public class ScreenShot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		Thread.sleep(1000);
		driver.get("https://demo.testfire.net/login.jsp");
		Thread.sleep(1000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		String str = ts.getScreenshotAs(OutputType.BASE64);
		byte[] byteArray = Base64.getDecoder().decode(str);
		FileOutputStream fos = new FileOutputStream("./Screenshot/test11.png");
		fos.write(byteArray);
		Thread.sleep(1000);

	}

}
