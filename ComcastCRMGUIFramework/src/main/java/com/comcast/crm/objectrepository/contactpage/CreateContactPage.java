package com.comcast.crm.objectrepository.contactpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createContactImg;
	public CreateContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreateContactImg() {
		return createContactImg;
	}
	

}
