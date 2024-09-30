package com.practice2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepository.homepage.HomePage;
import com.comcast.crm.objectrepository.orgpage.OrganizationPage;

public class DeletingTheOrg extends BaseClass{
	
	@Test
	public void deleteOrg() throws Throwable
	{

		String orgName = elib.getDataFromExcel("org", 1, 2) ;
		String text = elib.getDataFromExcel("org", 1, 3);

		
		// create an Organization

		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		OrganizationPage op = new OrganizationPage(driver);

		op.searchOrganization(orgName, text);

		
		
		driver.findElement(By.xpath("//a[text()='"+orgName+"']/../../td[8]/a[text()='del']")).click();
		
		
	}
	

}
