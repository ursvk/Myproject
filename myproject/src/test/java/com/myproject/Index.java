package com.myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Vinoth
 * {@code Helloworld}
 * {@docRoot /myproject/src/test/java/com/myproject/Index.java}
 * @version 1.0.1
 */
public class Index {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	//Thread.sleep(5000);	//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	
	}
	}
