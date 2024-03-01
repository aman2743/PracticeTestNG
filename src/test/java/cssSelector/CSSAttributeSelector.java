package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSAttributeSelector {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
	Thread.sleep(1000);
	//Attribute Name
	System.out.println(driver.findElements(By.cssSelector("input[placeholder]")).size());
	//Attribute Value
	System.out.println(driver.findElements(By.cssSelector("input[placeholder='First Name']")).size());
	//Attribute Value-Partial Text - Whole word (~)
	System.out.println(driver.findElements(By.cssSelector("input[placeholder~='question']")).size());
	//Attribute Value-Partial Text - text(*)
	System.out.println(driver.findElements(By.cssSelector("input[placeholder*='tion']")).size());
	//Attribute Value-Starts With - Whole Word(|)
	System.out.println(driver.findElements(By.cssSelector("p[class|='my']")).size());
	//Attribute Value-Starts With - text(^)
	System.out.println(driver.findElements(By.cssSelector("p[class^='my']")).size());
	//Attribute Value-Ends With - text($)
	System.out.println(driver.findElements(By.cssSelector("p[class$='class']")).size());
	
	
	
	
	}
}
