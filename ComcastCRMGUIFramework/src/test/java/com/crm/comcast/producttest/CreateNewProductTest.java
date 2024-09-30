package com.crm.comcast.producttest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepository.homepage.HomePage;
import com.comcast.crm.objectrepository.productpage.CreateNewProductPage;
import com.comcast.crm.objectrepository.productpage.CreateProductPage;
import com.comcast.crm.objectrepository.productpage.ProductInfoPage;

public class CreateNewProductTest extends BaseClass{
	
	@Test
	public void createProductTest() throws Throwable
	{
		String productName = elib.getDataFromExcel("Prod", 1, 1);
		String productInQty = elib.getDataFromExcel("Prod", 2, 2);
		String productQty = elib.getDataFromExcel("Prod", 2, 3);
		HomePage hp = new HomePage(driver);
		CreateNewProductPage cnp = new CreateNewProductPage(driver);
		CreateProductPage cpp=new CreateProductPage(driver);
		ProductInfoPage pip=new ProductInfoPage(driver);
		
		// navigate to Products
				hp.getProductLink().click();
				
				cnp.getCreateProductImg().click();
				Thread.sleep(2000);
				cnp.getProductNameEdit().sendKeys(productName);

				cnp.getInstockQtyTf().sendKeys(productInQty);

				cnp.getSaveBtn().click();
				pip.verifyProductName(productName);
		System.out.println("create Product");
	}
	@Test
	public void createProductTests() throws Throwable
	{
		String productName = elib.getDataFromExcel("Prod", 1, 1);
		String productInQty = elib.getDataFromExcel("Prod", 2, 2);
		String productQty = elib.getDataFromExcel("Prod", 2, 3);
		HomePage hp = new HomePage(driver);
		CreateNewProductPage cnp = new CreateNewProductPage(driver);
		CreateProductPage cpp=new CreateProductPage(driver);
		ProductInfoPage pip=new ProductInfoPage(driver);
		
		// navigate to Products
				hp.getProductLink().click();
				
				cnp.getCreateProductImg().click();
				Thread.sleep(2000);
				cnp.getProductNameEdit().sendKeys(productName);

				cnp.getInstockQtyTf().sendKeys(productInQty);

				cnp.getSaveBtn().click();
				pip.verifyProductName(productName);
		System.out.println("create Product");
		Assert.fail();
	}


}
