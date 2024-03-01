package FramesInAndWinfowSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("name")).sendKeys("Custom Test");
		String mainPage=driver.getWindowHandle();
		driver.findElement(By.id("newTabBtn")).click();
		Thread.sleep(1000);
		Set<String> windowHandles=driver.getWindowHandles();
		Iterator<String> itr=windowHandles.iterator();
		while(itr.hasNext()) {
			String winid=itr.next();
			if(!winid.equals(mainPage)) {
				driver.switchTo().window(winid);
				Thread.sleep(1000);
				System.out.println(driver.getTitle()); 
				System.out.println(driver.getCurrentUrl()); 
				driver.close();
			}
		}
		driver.switchTo().window(mainPage);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();

	}

}
