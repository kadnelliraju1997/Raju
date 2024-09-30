package com.comcast.crm.objectrepository.campaingpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CampaignsInformationPage {
	
	@FindBy(xpath = "//span[@id='dtlview_Campaign Name']")
	private WebElement actCampaignName;
	
	

	public CampaignsInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getActCampaignName() {
		return actCampaignName;
	}
	public void verifyCampaignName(String campaignName){
		String actCampaign = actCampaignName.getText().trim();
	Assert.assertEquals(actCampaign, campaignName);

	}

}
