package com.qa.Automationpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {
        public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");
	
	ChromeDriver driver= new ChromeDriver();
	
	driver.get("http://automationpractice.com");
	WebElement login_us_in=driver.findElementByClassName("login");
	login_us_in.click();
	
	WebElement Email_type=driver. findElementById("email") ;
	Email_type.sendKeys("abc213@mailinator.com");
	WebElement type_pass=driver.findElementByName("passwd");
	type_pass.sendKeys("abc1234");
    WebElement submit_button=driver.findElementById("SubmitLogin");
    submit_button.click();
    
    WebElement show_account_info=driver.findElementByClassName("info-account");
    String msg=show_account_info.getText();
    
    
    System.out.println(msg);
    
	}

}
