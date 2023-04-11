package org.seleniumbasics;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingRadioButton {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BCP\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");

		color();
		site();
		
	}
	public static void color() {
		driver=new ChromeDriver();
		driver.get("http://practice.cybertekschool.com/radio_buttons");
		WebElement blue = driver.findElement(By.id("blue"));
		blue.click();
		System.out.println("Blue clicked");

		WebElement green = driver.findElement(By.id("green"));
		boolean enabled = green.isEnabled();
		System.out.println(enabled);

		WebElement sport = driver.findElement(By.xpath("//*[contains(text(),'Polo')]"));
		sport.click();
		System.out.println("sport selected");
		driver.close();

	}

	public static void site() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		WebElement impressive = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/label"));
		impressive.click();
		System.out.println("Impressive clicked");
		Thread.sleep(3000);
		WebElement selected = driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[2]/div[2]/p/span"));


		System.out.println(selected.getText());}

}
