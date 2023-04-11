package org.seleniumadvanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDownloads {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/upload-download");
	
	WebElement download = driver.findElement(By.linkText("Download"));

	download.click();
	Thread.sleep(3000);
	File file=new File("C:\\\\Users\\\\BCP\\\\Downloads");
	File[] listFiles = file.listFiles();
	for (File fileList : listFiles) {
		
		if (fileList.getName().equals("sampleFile.jpeg")) {
		System.out.println("Downloaded");	
		break;
		}
		
	}
	driver.close();
}
	
	
}
