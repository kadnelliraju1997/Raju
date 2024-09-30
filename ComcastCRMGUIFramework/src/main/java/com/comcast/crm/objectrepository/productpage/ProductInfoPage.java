package com.comcast.crm.objectrepository.productpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductInfoPage {
	
	@FindBy(xpath = "//td[@align='left']/span[@id='dtlview_Product Name']")
	private WebElement actProductName;
	
	@FindBy(xpath = "//span[@id='dtlview_Vendor Name']")
	private WebElement actVenderName;
	
	public ProductInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getActProductName() {
		return actProductName;
	}

	public WebElement getActVenderName() {
		return actVenderName;
	}
	
	
	public void verifyProductName(String productName){
		
		String actProductName = getActProductName().getText().trim();
	Assert.assertEquals(actProductName, productName);
	}
	

}
