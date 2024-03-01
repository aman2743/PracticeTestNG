package FramesInAndWinfowSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountFrames {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
//		driver.get("https://jqueryui.com/resizable/");		
		driver.get("https://kitchen.applitools.com/ingredients/iframe");
		Thread.sleep(1000);
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of frame:" + iframes.size());
		
//	   you can reach each frame on your site
		for (WebElement iframe : iframes) {
//          switch to every frame
			System.out.println(iframe);
			driver.switchTo().frame(iframe);
			System.out.println(driver.getTitle());
//			System.out.println(driver.getCurrentUrl());
// 			now within the frame you can navigate like you are used to
			driver.switchTo().defaultContent();
		}	
		driver.quit();
	}
}
