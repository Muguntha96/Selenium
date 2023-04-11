package org.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Muguntha");
 driver.findElement(By.id("userEmail")).sendKeys("mugunthadurairaj@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Pattukkotai,Thanjavur");
		driver.findElement(By.id("permanentAddress")).sendKeys("Pattukkottai,Thanjavur");
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(3000);
		System.out.println("submitted successfully");
		
	}

}
