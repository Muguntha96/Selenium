package org.seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAlerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		WebElement simpleAlert = driver.findElement(By.id("alertButton"));
		simpleAlert.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		System.out.println("Simple Alert clicked sucessfully");
		WebElement timeAlert = driver.findElement(By.id("timerAlertButton"));
		timeAlert.click();
		Thread.sleep(5000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		System.out.println("Time alert clicked");


		WebElement confirmButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/button"));
		Actions action=new Actions(driver);
		action.moveToElement(confirmButton).click().perform();

		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		System.out.println("Cancelled");
		Thread.sleep(4000);
		WebElement promptalret = driver.findElement(By.xpath("//*[@id=\'promtButton\']"));
		promptalret.click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Duckies");
		prompt.accept();
		System.out.println("Values passed");
		driver.close();
	}
}
