package com.comcast.crm.objectrepository.campaingpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.objectrepository.homepage.HomePage;

public class CreateNewCapaignsPage {
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createCampaignsImg;
	
	
	@FindBy(xpath = "//input[@name='campaignname']")
	private WebElement campaignNameEdt;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveCampainBtn;
	
	public CreateNewCapaignsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateCampaignsImg() {
		return createCampaignsImg;
	}

	public WebElement getCampaignNameEdt() {
		return campaignNameEdt;
	}

	public WebElement getSaveCampainBtn() {
		return saveCampainBtn;
	}
	
	public void createCapaign(HomePage hp,CreateNewCapaignsPage cc,String campaignName) {
		hp.getMoreLink().click();
		hp.navigateToCampaingn();
		cc.getCreateCampaignsImg().click();
		getCampaignNameEdt().sendKeys(campaignName);
		getSaveCampainBtn().click();
	}

	
	
	

}
