package FramesInAndWinfowSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountFrames2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
//		driver.get("https://jqueryui.com/resizable/");		
		driver.get("https://kitchen.applitools.com/ingredients/iframe");
		Thread.sleep(1000);
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		int len=iframes.size();
		System.out.println("Total number of frame:" +len );
//		Working at window with 0 index
		driver.switchTo().frame(0);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
//		Working at window with 1 index		
		WebElement we2=driver.findElement(By.xpath("//iframe[@id='youtube-table-cypress']"));
		driver.switchTo().frame(1);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.quit();
	}
}
