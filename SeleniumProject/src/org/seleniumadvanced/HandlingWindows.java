package org.seleniumadvanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://nxtgenaiacademy.com/multiplewindows/");
	driver.manage().window().maximize();
	String oldwindow = driver.getWindowHandle();
	Thread.sleep(4000);
	  driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/section[3]/div/div[1]/div/div/div/center/button")).click();
	  
	  
	  Set<String> newWindow = driver.getWindowHandles();
	  for (String handles : newWindow) {
		driver.switchTo().window(handles);
	}
	  
	driver.manage().window().maximize();
	  WebElement python = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[5]/a"));
	python.click();
	driver.close();
	driver.switchTo().window(oldwindow);

	
	WebElement messageWindow = driver.findElement(By.name("123newmessagewindow321"));
	messageWindow.click();
	
	driver.quit();
	}
}
