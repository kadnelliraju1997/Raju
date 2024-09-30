package com.comcast.crm.campaigns;

import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepository.campaingpage.CampaignsInformationPage;
import com.comcast.crm.objectrepository.campaingpage.CreateNewCapaignsPage;
import com.comcast.crm.objectrepository.homepage.HomePage;

public class CreateCampaign extends BaseClass {
	@Test(retryAnalyzer = com.comcast.crm.listenerutility.RetryListenerImplementation.class)
	public void createCapaigns() throws Throwable {
		String campaignName = elib.getDataFromExcel("oppo", 11, 2) + jlib.getRandomNumber();
		String companyName="tek";
		HomePage hp = new HomePage(driver);
		CreateNewCapaignsPage cc = new CreateNewCapaignsPage(driver);
		CampaignsInformationPage cip = new CampaignsInformationPage(driver);

		
		cc.createCapaign(hp, cc, campaignName);
		cip.verifyCampaignName(companyName);

	}
	
	

}
