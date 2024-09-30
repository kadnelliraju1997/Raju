package com.comcast.crm.purchaseorderpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePurchaseOrderPage {

	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement purchaseOrderImg;
	

	public WebElement getPurchaseOrderImg() {
		return purchaseOrderImg;
	}

	public CreatePurchaseOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
