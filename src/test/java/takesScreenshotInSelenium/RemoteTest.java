package takesScreenshotInSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoteTest {
	public static void main(String[] args) throws MalformedURLException {
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		URL link = new URL("Https://181.23.45.13");
		RemoteWebDriver driver = new RemoteWebDriver(link, capabilities);
		driver.switchTo().alert();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	

	}
}
