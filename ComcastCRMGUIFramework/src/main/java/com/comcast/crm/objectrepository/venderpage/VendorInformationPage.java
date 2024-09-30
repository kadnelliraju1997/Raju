package com.comcast.crm.objectrepository.venderpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VendorInformationPage {
	
	@FindBy(className="lvtHeaderText")
	private WebElement headerMsg;

	public WebElement getHeaderMsg() {
		return headerMsg;
	}
	@FindBy(name="vendorname")
	private WebElement venderEdt;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	

	public VendorInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getVenderEdt() {
		return venderEdt;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void verifyVenderName(String venderName){
		String actVender = headerMsg.getText().trim();
	Assert.assertEquals(actVender, venderName);

	}
}
