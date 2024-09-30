package com.practice1;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.genric.webdriverutility.UtilityClassObject;
import com.comcast.crm.listenerutility.ListenerImplementationClass;
import com.comcast.crm.objectrepository.contactpage.ContactInfoPage;
import com.comcast.crm.objectrepository.contactpage.CreateContactPage;
import com.comcast.crm.objectrepository.contactpage.CreateNewContactPage;
import com.comcast.crm.objectrepository.homepage.HomePage;
import com.comcast.crm.objectrepository.orgpage.CreateNewOrganizationPage;
import com.comcast.crm.objectrepository.orgpage.OraganizationInfoPage;
import com.comcast.crm.objectrepository.orgpage.OrganizationPage;

public class CreateContactWithMadatoryFields extends BaseClass {
	@Test(groups = "smoke")
	public void createOrganizationWithMandatory() throws Throwable {
		UtilityClassObject.getTest().log(Status.INFO, "read data from excel");

		String orgName = elib.getDataFromExcel("org", 1, 2) + jlib.getRandomNumber();
		String lastName = elib.getDataFromExcel("contact", 1, 2) + jlib.getRandomNumber();
		UtilityClassObject.getTest().log(Status.INFO, "read data from excel");

		HomePage hp = new HomePage(driver);
		OrganizationPage op = new OrganizationPage(driver);
		OraganizationInfoPage oip = new OraganizationInfoPage(driver);
		CreateContactPage cc = new CreateContactPage(driver);
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		ContactInfoPage ci = new ContactInfoPage(driver);
		CreateNewContactPage cnc = new CreateNewContactPage(driver);
		// create org
		UtilityClassObject.getTest().log(Status.INFO, "create Organization");
		cnop.createOrg(hp, op, orgName);
		
		UtilityClassObject.getTest().log(Status.INFO, "verify Organization");
		oip.verifyOrgName(orgName);

		// create contact
		UtilityClassObject.getTest().log(Status.INFO, "create contact");
		cnc.createContact(hp, cc, lastName);
		
		ContactInfoPage cip = new ContactInfoPage(driver);
		UtilityClassObject.getTest().log(Status.INFO, "verify contact Name");
		cip.verifyLastName(lastName);
		Assert.fail();

	}

	@Test(groups = "regression")
	public void createOrganizationVerifyPhoneNo() throws Throwable {
		UtilityClassObject.getTest().log(Status.INFO, "read data from Excel");
		String orgName = elib.getDataFromExcel("contact", 8, 2) + jlib.getRandomNumber();
		String lastName = elib.getDataFromExcel("contact", 8, 3) + jlib.getRandomNumber();
		String phoneNumber = elib.getDataFromExcel("contact", 8, 5) + jlib.getRandomNumber();

		HomePage hp = new HomePage(driver);
		OrganizationPage op = new OrganizationPage(driver);
		OraganizationInfoPage oip = new OraganizationInfoPage(driver);
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		CreateContactPage cc = new CreateContactPage(driver);
		CreateNewContactPage cnc = new CreateNewContactPage(driver);
		ContactInfoPage ci = new ContactInfoPage(driver);
		;
		// create org
		UtilityClassObject.getTest().log(Status.INFO, "create organization with phone no");
		cnop.createOrgWithPhoneNo(hp, op, orgName, phoneNumber);
		
		UtilityClassObject.getTest().log(Status.INFO, "verify OrgName");
		oip.verifyOrgName(orgName);
		UtilityClassObject.getTest().log(Status.INFO, "verify phone no Name");
		oip.verifyOrgPhoneNo(phoneNumber);

		// create contact
		UtilityClassObject.getTest().log(Status.INFO, "create contact with OrgName");
		cnc.createContactOrg(hp, cc, driver, lastName, wlib, orgName);
		UtilityClassObject.getTest().log(Status.INFO, "verify LastName");
		ci.verifyLastName(lastName);

	}

	@Test(groups = "regression")
	public void createContactWithOrganization() throws Throwable {
		UtilityClassObject.getTest().log(Status.INFO, "read Data from Excel");
		String orgName = elib.getDataFromExcel("contact", 8, 2) + jlib.getRandomNumber();
		String lastName = elib.getDataFromExcel("contact", 8, 3) + jlib.getRandomNumber();
		String phoneNumber = elib.getDataFromExcel("contact", 8, 5) + jlib.getRandomNumber();
		System.out.println(lastName);

		HomePage hp = new HomePage(driver);
		OrganizationPage op = new OrganizationPage(driver);
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		OraganizationInfoPage oip = new OraganizationInfoPage(driver);
		CreateContactPage cc = new CreateContactPage(driver);
		CreateNewContactPage cnc = new CreateNewContactPage(driver);
		ContactInfoPage ci = new ContactInfoPage(driver);

		// create org		
		UtilityClassObject.getTest().log(Status.INFO, "create Organization");
		cnop.createOrg(hp, op, orgName);
		UtilityClassObject.getTest().log(Status.INFO, "verify OrgName");
		oip.verifyOrgName(orgName);

		// create contact
		UtilityClassObject.getTest().log(Status.INFO, "create Contact");
		cnc.createContactSupportDate(hp, cc, lastName, jlib);
		UtilityClassObject.getTest().log(Status.INFO, "verify LastName");
		ci.verifyLastName(lastName);
		Assert.fail();

	}
}
