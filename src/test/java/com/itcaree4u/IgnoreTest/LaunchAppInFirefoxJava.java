package com.itcaree4u.IgnoreTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchAppInFirefoxJava {
	

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new FirefoxDriver();
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		Thread.sleep(1000);
		driver.get("Https://google.co.in");
		
	}

}
