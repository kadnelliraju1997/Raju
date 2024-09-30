package com.comcast.crm.objectrepository.contactpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactInfoPage {
	
	@FindBy(xpath = "//span[@id='dtlview_Last Name']")
	private WebElement lastNameHeader;
	
	@FindBy(xpath = "//td[@class='dvtCellInfo' and @id='mouseArea_Organization Name']")
	private WebElement actOrgName;
	
	@FindBy(id="mouseArea_Support Start Date")
	private WebElement actStartDate;
	
	@FindBy(id="mouseArea_Support End Date")
	private WebElement actEndDate;
	
	

	public WebElement getActStartDate() {
		return actStartDate;
	}

	public WebElement getActEndDate() {
		return actEndDate;
	}

	public ContactInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getActOrgName() {
		return actOrgName;
	}

	public WebElement getLastNameHeader() {
		return lastNameHeader;
	}
	
	public void verifyLastName(String lastName){
		String actLastName = lastNameHeader.getText().trim();
	boolean staus = actLastName.contains(lastName);
	Assert.assertEquals(staus, true);
		

	}

}
