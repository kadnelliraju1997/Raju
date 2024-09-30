package com.practice2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepository.homepage.HomePage;
import com.comcast.crm.objectrepository.orgpage.CreateNewOrganizationPage;
import com.comcast.crm.objectrepository.orgpage.OraganizationInfoPage;
import com.comcast.crm.objectrepository.orgpage.OrganizationPage;

public class HandlingDynamicElementWithRunTimeXpath extends BaseClass{
	@Test
	public void createOrganization() throws Throwable {
		

		

		String orgName = elib.getDataFromExcel("org", 1, 2) + jlib.getRandomNumber();
		String text = elib.getDataFromExcel("org", 1, 3);

		
		// create an Organization

		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		OrganizationPage op = new OrganizationPage(driver);
		op.getCreateNewOrgBtn().click();

		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.createOrg(hp, op, orgName);
		
		OraganizationInfoPage oip=new OraganizationInfoPage(driver);
	String headerMsg=	oip.getHeaderMsg().getText();
		
		if(headerMsg.contains(orgName))
		{
			System.out.println("This is actual orgName "+orgName);
		}
		else {
			System.out.println("This is not actual orgName "+orgName);
		}
		

		hp.getOrgLink().click();

		op.searchOrganization(orgName, text);

		
		
		driver.findElement(By.xpath("//a[text()='"+orgName+"']/../../td[8]/a[text()='del']")).click();
		
		
		
	}
}
