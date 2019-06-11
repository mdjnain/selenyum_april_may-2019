package com.qa.Automationpractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com");
		driver.findElementByXPath("//a[@title='Women']").click();
		
		
		
		
		
		
		
	}

}
