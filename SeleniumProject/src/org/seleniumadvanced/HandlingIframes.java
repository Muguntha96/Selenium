package org.seleniumadvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		WebElement frame1 = driver.findElement(By.id("sampleHeading"));
		System.out.println(frame1.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame2");
		WebElement frame2 = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
		System.out.println(frame2.getText());
		driver.switchTo().defaultContent();
		List<WebElement> framesNumber = driver.findElements(By.tagName("frame"));
		
		System.out.println(framesNumber.size());
		driver.close();
		
	}

}
