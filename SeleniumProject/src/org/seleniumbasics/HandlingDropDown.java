package org.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://practice.cybertekschool.com/dropdown");

		WebElement simple = driver.findElement(By.id("dropdown"));
		Select select=new Select(simple);
		select.selectByValue("1");

		WebElement year = driver.findElement(By.id("year"));
		Select Birthyear=new Select(year);
		Birthyear.selectByVisibleText("1996");
		WebElement month = driver.findElement(By.id("month"));
		Select Birthmonth=new Select(month);
		Birthmonth.selectByValue("4");
		WebElement day=driver.findElement(By.id("day"));
		Select Birthday=new Select(day);
		Birthday.selectByIndex(16);

		WebElement state=driver.findElement(By.id("state"));
		Select sateselect=new Select(state);
		sateselect.selectByVisibleText("Iowa");
		List<WebElement>listofOptions=sateselect.getOptions();
		int size = listofOptions.size();
		System.out.println(size);
		
		
		state.sendKeys("South Dakota");
		
		WebElement languages = driver.findElement(By.name("Languages"));
		Select multiselect=new Select(languages);
		multiselect.selectByIndex(0);
		multiselect.selectByIndex(2);
		multiselect.selectByVisibleText("Python");
		List<WebElement>selectedlist=	multiselect.getAllSelectedOptions();
		for (WebElement webElement : selectedlist) {
			System.out.println(webElement.getText());
		}
		
		
		Thread.sleep(5000);
		
		

		driver.close();
	}
}
