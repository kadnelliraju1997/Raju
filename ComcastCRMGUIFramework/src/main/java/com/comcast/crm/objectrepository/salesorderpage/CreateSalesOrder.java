package com.comcast.crm.objectrepository.salesorderpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateSalesOrder {
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createSalesOrderImg;
	
	public CreateSalesOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateSalesOrderImg() {
		return createSalesOrderImg;
	}
	

}
