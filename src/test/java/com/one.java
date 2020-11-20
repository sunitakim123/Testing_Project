package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class one {
	WebDriver driver;
	@Test(priority=1)
	public void BrowserLauch()
	{
		//System.setProperty("webdriver.chrome.driver", "./src/main/java/Driver/chromedriver");
				String chromeDriverPath = "./src/main/java/Driver/chromedriver" ;
				System.setProperty("webdriver.chrome.driver", chromeDriverPath);
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
				driver= new ChromeDriver(options);
			//	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.get("https://awspf.com/");
				
		
	 
		driver.findElement(By.cssSelector("span.loginButton")).click();
		driver.findElement(By.id("email")).sendKeys("sunitakim123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("thankyou");
		driver.findElement(By.cssSelector("input.accountActionButton")).click();
	}
}
