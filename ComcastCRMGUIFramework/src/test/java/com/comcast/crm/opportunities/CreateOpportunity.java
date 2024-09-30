package com.comcast.crm.opportunities;

import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepository.campaingpage.CampaignsInformationPage;
import com.comcast.crm.objectrepository.campaingpage.CreateNewCapaignsPage;
import com.comcast.crm.objectrepository.contactpage.ContactInfoPage;
import com.comcast.crm.objectrepository.contactpage.CreateContactPage;
import com.comcast.crm.objectrepository.contactpage.CreateNewContactPage;
import com.comcast.crm.objectrepository.homepage.HomePage;
import com.comcast.crm.objectrepository.loginpage.LoginPage;
import com.comcast.crm.objectrepository.ooportunitypage.CreateNewOpportunities;
import com.comcast.crm.objectrepository.ooportunitypage.OpportunityInformationPage;
import com.comcast.crm.objectrepository.orgpage.CreateNewOrganizationPage;
import com.comcast.crm.objectrepository.orgpage.OraganizationInfoPage;
import com.comcast.crm.objectrepository.orgpage.OrganizationPage;

public class CreateOpportunity extends BaseClass {
	@Test
	public void createCapaigns() throws Throwable {

		String oppoName = elib.getDataFromExcel("oppo", 1, 2) + jlib.getRandomNumber();
		String text1 = elib.getDataFromExcel("oppo", 1, 3);
		String text2 = elib.getDataFromExcel("oppo", 1, 4);
		String industry = elib.getDataFromExcel("oppo", 1, 3);
		String type = elib.getDataFromExcel("oppo", 1, 4);
		String orgName = elib.getDataFromExcel("oppo", 4, 2) + jlib.getRandomNumber();
		String lastName = elib.getDataFromExcel("oppo", 8, 3) + jlib.getRandomNumber();
		String campaignName = elib.getDataFromExcel("oppo", 11, 2) + jlib.getRandomNumber();

		wlib.waitForPageToLoad(driver);

		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		CreateNewCapaignsPage cc = new CreateNewCapaignsPage(driver);
		OrganizationPage op = new OrganizationPage(driver);
		CreateContactPage ccp = new CreateContactPage(driver);
		CreateNewOrganizationPage cop = new CreateNewOrganizationPage(driver);
		OraganizationInfoPage oip = new OraganizationInfoPage(driver);
		ContactInfoPage cip = new ContactInfoPage(driver);
		CreateNewContactPage cnc = new CreateNewContactPage(driver);
		CreateNewOpportunities cp = new CreateNewOpportunities(driver);
		OpportunityInformationPage oipp = new OpportunityInformationPage(driver);
		CampaignsInformationPage cipp=new CampaignsInformationPage(driver);
		
		

		//create campa
		cc.createCapaign(hp, cc, campaignName);
		cipp.verifyCampaignName(campaignName);
		

     	//create Org
		cop.createOrg(hp, op, orgName);
		oip.verifyOrgName(orgName);
		

		// create contact
		cnc.createContactOrg(hp, ccp, driver, lastName, lp, orgName);
		cip.verifyLastName(lastName);
		
		// create opportunity
		cp.createOpportunity(hp, cp, oppoName, text1, lp, driver, orgName, campaignName);
		oipp.verifyOppoRelated(oppoName);
		
		

	}

}
