package com.comcast.crm.objectrepository.invoicepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InvoiceInformationPage {
	@FindBy(xpath = "//span[@id='dtlview_Subject']")
	private WebElement Subject;
	
	public InvoiceInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getSubject() {
		return Subject;
	}
	public void verifySubject(String subject){
		String actSubject = Subject.getText().trim();
	Assert.assertEquals(actSubject, subject);

	} 

}
