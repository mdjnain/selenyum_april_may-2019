package com.automationpractice.registration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class practice {
	
public static void main(String[]args) {	
	registration_practice();}
public static void registration_practice() {
	
	System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	
	    //Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
	//Click Sign in button from top right corner of the page
		WebElement sign_in=driver.findElementByClassName("login");
		sign_in.click();
		//Enter email address 'abc@mailinator.com' in email address text field of left side
		WebElement enter_email=driver.findElementById("email_create");
		enter_email.sendKeys("abc@mailinator.com");
		
		//Click create an account button
		WebElement create_account_button=driver.findElementById("SubmitCreate");
		create_account_button.click();
		
		//Verify error message displayed 'An account using this email address has already been registered. Please enter a valid password or request a new one.'
		WebElement error_massage_display=driver.findElementById("create_account_error");
		error_massage_display.getText();
		
		
		//Enter a valid email address in email address text field. (You can use xxxxxxx@mailinator.com)
		WebElement valid_email=driver.findElementById("email_create");
		valid_email.clear();
		valid_email.sendKeys("xxxxxxx@mailinator.com");
		
		
		//Click create an account button
		WebElement create_account_button2=driver.findElementById("SubmitCreate");
		create_account_button2.click();
		
		//Click 'Register' button
		WebElement rigister=driver.findElementByClassName("icon-chevron-right right");
		rigister.click();
		
		//Verify error message displayed 'You must register at least one phone number.'
		//Verify error message displayed 'lastname is required.'
		//Verify error message displayed 'firstname is required.'
		//Verify error message displayed 'passwd is required.'
		//Verify error message displayed 'address1 is required.'
		//Verify error message displayed 'city is required.'
		//Verify error message displayed 'The Zip/Postal code you've entered is invalid. It must follow this format: 00000'
		//Verify error message displayed 'This country requires you to choose a State.'
		WebElement verify_error=driver.findElementByClassName("alert alert-danger");
		verify_error.getText();
		//Select 'Mr' radio button
		WebElement click_mr=driver.findElementByClassName("radio");
		click_mr.click();
		//Enter First name as 'John'
		WebElement enter_name=driver.findElementByName("customer_firstname");
		enter_name.sendKeys("John");
		//Enter Last name as 'Smith'
		WebElement enter_second_name=driver.findElementByName("customer_lastname");
		enter_second_name.sendKeys("Smith");
		
		//Verify Email text box has email address defined as used in step 6
		WebElement verify_email_textbox=driver.findElementByClassName("is_required validate form-control");
		verify_email_textbox.getText();
		
		
		
		//Enter password as 'MyStrong_Password'
		WebElement enter_pass=driver.findElementByClassName("is_required validate form-control");
		enter_pass.sendKeys("MyStrong_Password");
		
		//Select day 15 from day dropdown
		
		//Select year 1984 from year dropdown
		//Select month September from month dropdown
		//Verify First name text field below has first name defined as used in step 18
		//Verify First name text field below has last name defined as used in step 19
		//Enter Company as 'Time and Training' in Company text field
		//Enter address as '123 abc street' in address text field
		//Enter city New York in city text field
		//Select state New York from state drop down
		//Enter '10001' in Zip/Postal Code text field
		//Select country United States from country dropdown
		//Enter text 'Registering ac account with all fields' in Additional information text area
		//Enter '7031234567' in Home Phone text field
		//Enter Enter '7039876543214' in Mobile phone text field
		//Replace text 'My Address' to 'Home' in Assign an address alias for future reference text field
		//Click 'Register' button
		//Verify 'MY ACCOUNT' text displayed
		//Verify 'Welcome to your account. Here you can manage all of your personal information and orders.' text displayed
		//Verify 'My personal information' text displayed
		//Click 'Sign out' button from top right corner
}
}
