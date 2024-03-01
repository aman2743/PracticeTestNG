package com.itcaree4u.IgnoreTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchAppInFirefox {
	@Test
	public void LaunchApp() throws InterruptedException {
	 WebDriverManager.firefoxdriver().setup();
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.navigate().to("https://www.google.co.in");
	 driver.quit();
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver=new EdgeDriver();
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.navigate().to("https://www.google.co.in");
//		driver.quit();

	}
}
