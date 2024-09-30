package com.comcast.crm.contacttest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.genric.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepository.contactpage.ContactInfoPage;
import com.comcast.crm.objectrepository.contactpage.CreateContactPage;
import com.comcast.crm.objectrepository.contactpage.CreateNewContactPage;
import com.comcast.crm.objectrepository.homepage.HomePage;
import com.comcast.crm.objectrepository.orgpage.CreateNewOrganizationPage;
import com.comcast.crm.objectrepository.orgpage.OraganizationInfoPage;
import com.comcast.crm.objectrepository.orgpage.OrganizationPage;

/**
 * @author Raju
 */
@Listeners(com.comcast.crm.listenerutility.ListenerImplementationClass.class)
public class CreateContactWithMadatoryFields extends BaseClass {
	@Test
	public void createOrganizationWithMandatory() throws Throwable {
		UtilityClassObject.getTest().log(Status.INFO, "read data from Excel");
		String orgName = elib.getDataFromExcel("org", 1, 2) + jlib.getRandomNumber();
		String lastName = elib.getDataFromExcel("contact", 1, 2) + jlib.getRandomNumber();

		HomePage hp = new HomePage(driver);
		OrganizationPage op = new OrganizationPage(driver);
		OraganizationInfoPage oip = new OraganizationInfoPage(driver);
		CreateContactPage cc = new CreateContactPage(driver);
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		ContactInfoPage ci = new ContactInfoPage(driver);
		CreateNewContactPage cnc = new CreateNewContactPage(driver);
		// create org
		cnop.createOrg(hp, op, orgName);
		oip.verifyOrgName(orgName);

		// create contact
		cnc.createContact(hp, cc, lastName);
		ContactInfoPage cip = new ContactInfoPage(driver);
		cip.verifyLastName(lastName);

	}

	@Test
	public void createOrganizationVerifyPhoneNo() throws Throwable {
		String orgName = elib.getDataFromExcel("contact", 8, 2) + jlib.getRandomNumber();
		String lastName = elib.getDataFromExcel("contact", 8, 3) + jlib.getRandomNumber();
		String phoneNumber = elib.getDataFromExcel("contact", 8, 5);

		HomePage hp = new HomePage(driver);
		OrganizationPage op = new OrganizationPage(driver);
		OraganizationInfoPage oip = new OraganizationInfoPage(driver);
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		CreateContactPage cc = new CreateContactPage(driver);
		CreateNewContactPage cnc = new CreateNewContactPage(driver);
		ContactInfoPage ci = new ContactInfoPage(driver);
		;
		// create org
		cnop.createOrgWithPhoneNo(hp, op, orgName, phoneNumber);
		;

		oip.verifyOrgName(orgName);
		oip.verifyOrgPhoneNo(phoneNumber);

		// create contact
		cnc.createContact(hp, cc, lastName);

		ci.verifyLastName(lastName);

	}

	@Test
	public void createOrganization() throws Throwable {

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
		cnop.createOrg(hp, op, orgName);
		oip.verifyOrgName(orgName);

		// create contact
		cnc.createContactSupportDate(hp, cc, lastName, jlib);
		ci.verifyLastName(lastName);

	}
}
