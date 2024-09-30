package com.comcast.crm.createsaleorder;

import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepository.campaingpage.CreateNewCapaignsPage;
import com.comcast.crm.objectrepository.contactpage.ContactInfoPage;
import com.comcast.crm.objectrepository.contactpage.CreateContactPage;
import com.comcast.crm.objectrepository.contactpage.CreateNewContactPage;
import com.comcast.crm.objectrepository.homepage.HomePage;
import com.comcast.crm.objectrepository.loginpage.LoginPage;
import com.comcast.crm.objectrepository.ooportunitypage.CreateNewOpportunities;
import com.comcast.crm.objectrepository.orgpage.CreateNewOrganizationPage;
import com.comcast.crm.objectrepository.orgpage.OraganizationInfoPage;
import com.comcast.crm.objectrepository.orgpage.OrganizationPage;
import com.comcast.crm.objectrepository.productpage.CreateNewProductPage;
import com.comcast.crm.objectrepository.productpage.ProductInfoPage;
import com.comcast.crm.objectrepository.salesorderpage.CreateNewSalesOrder;
import com.comcast.crm.objectrepository.salesorderpage.CreateSalesOrder;
import com.comcast.crm.objectrepository.salesorderpage.SalesOrderInfoPage;

public class CreatenewSalesOrders extends BaseClass {
	@Test
	public void createSalesOder() throws Throwable {

		String orgName = elib.getDataFromExcel("oppo", 4, 2) + jlib.getRandomNumber();
		String lastName = elib.getDataFromExcel("oppo", 8, 3) + jlib.getRandomNumber();
		String campaignName = elib.getDataFromExcel("oppo", 11, 2) + jlib.getRandomNumber();
		String subject = elib.getDataFromExcel("oppo", 11, 2) + jlib.getRandomNumber();

		String venderName = elib.getDataFromExcel("vender", 1, 2) + jlib.getRandomNumber();
		String productName = elib.getDataFromExcel("Prod", 1, 1);
		String productInQty = elib.getDataFromExcel("Prod", 2, 2);
		String productQty = elib.getDataFromExcel("Prod", 2, 3);

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
		CreateSalesOrder cso = new CreateSalesOrder(driver);
		CreateNewSalesOrder cnco = new CreateNewSalesOrder(driver);
		SalesOrderInfoPage soip = new SalesOrderInfoPage(driver);
		CreateNewProductPage cnp = new CreateNewProductPage(driver);
		hp.getMoreLink().click();
//		//create Org
		
		cop.createOrg(hp, op, orgName);
		
		oip.verifyOrgName(orgName);
		// create contact
		
		cnc.createContactOrg(hp, ccp, driver, lastName, lp, orgName);
		
		cip.verifyLastName(lastName);

		// navigate to Products
		
		cnp.createProduct(hp, cnp, productName, productInQty);
		
		ProductInfoPage pip = new ProductInfoPage(driver);
		pip.verifyProductName(productName);
		
		// create salesOrder
		cnco.createSales(hp, cso, driver, subject, lp, orgName, lastName, productName, productQty);
		soip.verifySubject(subject);

	}

}
