package org.seleniumbasics;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingButtons {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		Actions action=new Actions(driver);
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(doubleclick).perform();
		System.out.println("double clicked");
		Thread.sleep(4000);
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rightclick).perform();
		System.out.println("Right clicked");
		Thread.sleep(4000);

		WebElement clickme = driver.findElement(By.xpath("//*[starts-with(text(),'Click')]"));


		clickme.click();

		System.out.println("Clicked");
	}
}
