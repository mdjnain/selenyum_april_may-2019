package com.automationpractice.search;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SearchTest {
	
	
	public static void main(String[]args)throws InterruptedException {
		search_003_product_image_view();}
	
	public static void search_003_product_image_view() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php?id_product=7&controller=product");
		List<WebElement> all_image_tag=driver.findElementsByXPath("//img[contains(@id,'thumb_')]");
		System.out.println(all_image_tag.size());
		
		
		
	
	for (int i = 0; i < all_image_tag.size(); i++) {
		WebElement e=all_image_tag.get(i);
		e.click();
		driver.findElementByXPath("//a[@title='close']").click();
		Thread.sleep(2000);
	}
	
	
	}
	
	
	
	

}
