package com.practice2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateContactTest  {
	
	WebDriver driver;
	@Test(invocationCount = 3, threadPoolSize = 2 )
	public void createContactTest()
	{
		driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		System.out.println("create contct");
	}
	
	
}
