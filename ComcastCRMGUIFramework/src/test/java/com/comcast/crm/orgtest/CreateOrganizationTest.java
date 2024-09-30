package com.comcast.crm.orgtest;

import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepository.homepage.HomePage;
import com.comcast.crm.objectrepository.orgpage.CreateNewOrganizationPage;
import com.comcast.crm.objectrepository.orgpage.OraganizationInfoPage;
import com.comcast.crm.objectrepository.orgpage.OrganizationPage;

public class CreateOrganizationTest extends BaseClass {
	@Test
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
	@Test
	public void createOrganizationVerifyPhoneNo() throws Throwable {

		String orgName = elib.getDataFromExcel("org", 1, 2) + jlib.getRandomNumber();
		String phoneNumber = elib.getDataFromExcel("org", 1, 5) + jlib.getRandomNumber();

		// create an Organization

		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		OrganizationPage op = new OrganizationPage(driver);
		op.getCreateNewOrgBtn().click();

		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.createOrgWithPhoneNo(hp, op, orgName, phoneNumber);

		OraganizationInfoPage oip=new OraganizationInfoPage(driver);
		oip.verifyOrgName(orgName);
		oip.verifyOrgPhoneNo(phoneNumber);

	}
	@Test
	public void createOrganizationIndustry() throws Throwable {

		String orgName = elib.getDataFromExcel("org", 1, 2) + jlib.getRandomNumber();
		String phoneNumber = elib.getDataFromExcel("org", 4, 5);;
		String Industry = elib.getDataFromExcel("org", 4, 3);
		String Type = elib.getDataFromExcel("org", 4, 4);
		// create an Organization

		HomePage hp = new HomePage(driver);
		OrganizationPage op = new OrganizationPage(driver);
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		OraganizationInfoPage oip=new OraganizationInfoPage(driver);
		hp.getOrgLink().click();
		op.getCreateNewOrgBtn().click();
		
		cnop.getOrgNameEdt().sendKeys(orgName);
		cnop.getPhoneNoEdt().sendKeys(phoneNumber);

		cnop.selectIndusryDd(Industry);
		cnop.selectTypeDd(Type);
		cnop.getSaveBtn().click();
		oip.verifyIndustryDd(Industry);
		oip.verifyTypeDd(Type);
		
		
		
		

		

	}
	

}
