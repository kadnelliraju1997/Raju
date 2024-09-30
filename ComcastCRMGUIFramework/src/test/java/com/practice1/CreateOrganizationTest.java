package com.practice1;

import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepository.homepage.HomePage;
import com.comcast.crm.objectrepository.orgpage.CreateNewOrganizationPage;
import com.comcast.crm.objectrepository.orgpage.OraganizationInfoPage;
import com.comcast.crm.objectrepository.orgpage.OrganizationPage;

public class CreateOrganizationTest extends BaseClass {
	@Test(invocationCount = 2, threadPoolSize = 2, priority = 1)

	public void createOrganization() throws Throwable {

		String orgName = elib.getDataFromExcel("org", 1, 2) + jlib.getRandomNumber();

		// create an Organization

		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		OrganizationPage op = new OrganizationPage(driver);
		op.getCreateNewOrgBtn().click();

		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.createOrg(hp, op, orgName);

		// verify header msg expected result
		OraganizationInfoPage oip = new OraganizationInfoPage(driver);
		oip.verifyOrgName(orgName);

	}

}
