package FramesInAndWinfowSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleInSelenium {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
	Thread.sleep(1000);
	String mainWindow=driver.getWindowHandle();
	System.out.println(mainWindow);
	driver.findElement(By.id("name")).sendKeys("Test");
	driver.findElement(By.id("newWindowsBtn")).click();
	Thread.sleep(1000);
	Set<String> handles=driver.getWindowHandles();
	Iterator<String> itr=handles.iterator();
	while(itr.hasNext()) {
		String winid=itr.next();
		if(!winid.equals(mainWindow)) {
			driver.switchTo().window(winid);
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.close();
		}
	}
 
   driver.switchTo().window(mainWindow);
    Thread.sleep(2000);
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());
	driver.close();
}
}
