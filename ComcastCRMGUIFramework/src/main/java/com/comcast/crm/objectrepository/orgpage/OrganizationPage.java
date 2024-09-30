package com.comcast.crm.objectrepository.orgpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrganizationPage {
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createNewOrgBtn;
	
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchOrgEdt;
	
	@FindBy(xpath="//select[@name='search_field']")
	private WebElement orgInDd;
	
	//lookUp
	@FindBy(xpath="//input[@id='search_txt']")
	private WebElement searchOrg_txtLookUp;
	
	@FindBy(name = "search")
	private WebElement searchInLookUpBtn;
	
	public WebElement getSearchOrg_txtLookUp() {
		return searchOrg_txtLookUp;
	}

	public WebElement getSearchInLookUpBtn() {
		return searchInLookUpBtn;
	}

	public WebElement getSearchNowOrgBtn() {
		return searchNowOrgBtn;
	}

	@FindBy(xpath="//input[@name='submit']")
	private WebElement searchNowOrgBtn;
	
	public WebElement getSearchNowOrg() {
		return searchNowOrgBtn;
	}

	public WebElement getSearchOrgEdt() {
		return searchOrgEdt;
	}

	public WebElement getOrgInDd() {
		return orgInDd;
	}

	public OrganizationPage(WebDriver driver)//input[@name='submit']
	{

		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchOrgedt() {
		return searchOrgEdt;
	}

	public WebElement getCreateNewOrgBtn() {
		return createNewOrgBtn;
	}
	
	public void searchOrganization(String orgName, String text)
	{
		searchOrgEdt.sendKeys(orgName);
		Select sel=new Select(orgInDd);
		sel.selectByVisibleText(text);
		searchNowOrgBtn.click();
	}
	

}
