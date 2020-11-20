package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class two {
	WebDriver driver;
	@Test(priority=1)
	public void BrowserLauch()
	{	//System.getProperty("user.dir") + "\\src\\main\\java\\Driver\\chromedriver.exe"
		System.setProperty("webdriver.chrome.driver", "./src/main/java/Driver/chromedriver");
		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://awspf.com/");
		
	}
	
	@Test(priority=2)
	public void login()
	{ 
		driver.findElement(By.cssSelector("span.loginButton")).click();
		driver.findElement(By.id("email")).sendKeys("sunitakim123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("thankyou");
		driver.findElement(By.cssSelector("input.accountActionButton")).click();
	}
}
