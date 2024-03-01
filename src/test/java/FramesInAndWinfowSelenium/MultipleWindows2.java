package FramesInAndWinfowSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String BasicControls = null;
		String XPathPractice = null;
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("on Main page");
		String originalWindow = driver.getWindowHandle();
		System.out.println(originalWindow);
		driver.findElement(By.id("newWindowsBtn")).click();
		Thread.sleep(2000);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			driver.switchTo().window(str);
			String title = driver.getTitle();
			if (title.contains("Controls")) {
				BasicControls = str;
			} else if (title.contains("Practice")) {
				XPathPractice = str;
			}
		}

		// Working on Basic Control
		driver.switchTo().window(BasicControls);
		System.out.println("*****Working on Basic Control****");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();

		// Working on XPath Practice
		driver.switchTo().window(XPathPractice);
		System.out.println("*****Working on Xpath Practice****");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();

		// Working on home page
		Thread.sleep(1000);
		driver.switchTo().window(originalWindow);
		System.out.println("*****Working on home page****");
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("New content on Main page");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
