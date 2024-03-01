package FramesInAndWinfowSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(1000);
		
		driver.findElement(By.id("name")).sendKeys("on Main page");
		String originalWindow=driver.getWindowHandle();
		System.out.println(originalWindow);
		driver.findElement(By.id("newWindowsBtn")).click();
		Thread.sleep(2000);
	    Set<String> handles=driver.getWindowHandles();
	    Iterator<String> itr=handles.iterator();
	    while(itr.hasNext()){
	    	String str=itr.next();
	    	System.out.println(str);
	    	if(!str.equals(originalWindow)) 
	    	{
	    		driver.switchTo().window(str);
	    		Thread.sleep(1000);
	    		System.out.println(driver.getCurrentUrl());
	    		System.out.println(driver.getTitle());
	    		driver.close();
	    	 }
	     }	
	    Thread.sleep(1000);
	    driver.switchTo().window(originalWindow);
	    Thread.sleep(1000);
	    driver.findElement(By.id("name")).sendKeys("New content on Main page");
	    driver.getTitle();
	    driver.close();
	}
}
