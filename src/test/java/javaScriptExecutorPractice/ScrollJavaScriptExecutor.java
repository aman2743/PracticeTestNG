package javaScriptExecutorPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollJavaScriptExecutor {
@Test
	public void ScrollScenarios() throws InterruptedException {
    	 WebDriverManager.chromedriver().setup();
    	 WebDriver driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 Thread.sleep(1000);
    	 driver.get("https://www.hyrtutorials.com/");
    	 Thread.sleep(5000);
    	JavascriptExecutor js=(JavascriptExecutor) driver;
//    	Scroll at size 1000 from top
//    	js.executeScript("window.scrollTo(0,1000)");
//    	Scroll By
//    	js.executeScript("window.scrollBy(0,1000)");
//    	Scroll to bottom
//    	js.executeScript("window.scrollTo(0,3438);");
//    	Scroll to Element location
    	WebElement we=driver.findElement(By.id("Feed1_feedItemListDisplay"));
//    	js.executeScript("window.scrollTo(arguments[0],arguments[1])",we.getLocation().x,we.getLocation().y);
    	
//    	Scroll to bottom Alternate
//    	js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//    	Scroll to view
//    	js.executeScript("document.getElementById('Feed1_feedItemListDisplay').scrollIntoView()");
    	js.executeScript("arguments[0].scrollIntoView()", we);
    	 
     }
}
