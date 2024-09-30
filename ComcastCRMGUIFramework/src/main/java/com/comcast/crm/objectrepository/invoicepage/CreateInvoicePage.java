package com.comcast.crm.objectrepository.invoicepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateInvoicePage {
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createInvoiceImg;
	

	public CreateInvoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getCreateInvoiceImg() {
		return createInvoiceImg;
	}


}
