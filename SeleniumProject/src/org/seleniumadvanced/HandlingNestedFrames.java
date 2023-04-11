package org.seleniumadvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNestedFrames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/nestedframes");
driver.manage().window().maximize();
driver.switchTo().frame("frame1");
WebElement parentframe = driver.findElement(By.xpath("//*[starts-with(text(),'Parent')]"));
System.out.println(parentframe.getText());
WebElement Frame = driver.findElement(By.xpath("/html/body/iframe"));
	driver.switchTo().frame(Frame);
	WebElement childframe = driver.findElement(By.xpath("//*[starts-with(text(),'Child')]"));
	System.out.println(childframe.getText());
	driver.switchTo().defaultContent();
	List<WebElement> frameNumbers = driver.findElements(By.tagName("iframe"));
	System.out.println("No of frames : "+frameNumbers.size());
	driver.close();
	}
}
