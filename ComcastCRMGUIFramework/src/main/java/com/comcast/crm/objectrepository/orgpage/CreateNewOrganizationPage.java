package com.comcast.crm.objectrepository.orgpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.comcast.crm.objectrepository.homepage.HomePage;

public class CreateNewOrganizationPage {
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgNameEdt;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement selIndustryDD;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phoneNoEdt;
	
	@FindBy(xpath="//select[@name='accounttype']")
	private WebElement selTypeDD;
	
	
	
	public WebElement getSelIndustryDD() {
		return selIndustryDD;
	}

	public WebElement getTypeDD() {
		return selTypeDD;
	}
	public void selectIndusryDd(String text)
	{
		Select sel=new Select(selIndustryDD);
		sel.selectByVisibleText(text);
	}
	public void selectTypeDd(String text)
	{
		Select sel=new Select(selTypeDD);
		sel.selectByVisibleText(text);
	}

	public WebElement getPhoneNoEdt() {
		return phoneNoEdt;
	}

	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	@FindBy(name="industry")
	private WebElement industryDd;
	
	@FindBy(id ="dtlview_Phone")
	private WebElement PhoneNoVerify;
	

	public WebElement getPhoneNoVerify() {
		return PhoneNoVerify;
	}

	public WebElement getIndustryDd() {
		return industryDd;
	}

	public WebElement getOrgNameEdt() {
		return orgNameEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	 public CreateNewOrganizationPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }

	 public void createOrg(HomePage hp,OrganizationPage op,String orgName)
	 {
		 hp.getOrgLink().click();
			op.getCreateNewOrgBtn().click();
		 orgNameEdt.sendKeys(orgName);
		 saveBtn.click();
	 }
	 public void createOrgWithPhoneNo( HomePage hp,OrganizationPage op,String orgName,String phoneNumber)
	 {
		 hp.getOrgLink().click();
			op.getCreateNewOrgBtn().click();
		 orgNameEdt.sendKeys(orgName);
		 phoneNoEdt.sendKeys(phoneNumber);
		 saveBtn.click();
	 }
	 
	 public void createOrg(HomePage hp,OrganizationPage op,String orgName,String industry)    
	 {
		 hp.getOrgLink().click();
			op.getCreateNewOrgBtn().click();
		 orgNameEdt.sendKeys(orgName);
		 Select sel=new Select(industryDd);
		 sel.selectByVisibleText(industry);
		 
		 saveBtn.click();
	 }
	 }