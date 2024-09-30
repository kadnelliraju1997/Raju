package com.practice1;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.basetest.BaseClass1;
import com.comcast.crm.objectrepository.homepage.HomePage;
import com.comcast.crm.objectrepository.productpage.CreateNewProductPage;
import com.comcast.crm.objectrepository.productpage.CreateProductPage;
import com.comcast.crm.objectrepository.productpage.ProductInfoPage;

public class CreateNewProductTest extends BaseClass {

	@Test
	public void createProductTest() throws Throwable {
		Assert.fail();
		String productName = elib.getDataFromExcel("Prod", 1, 1);
		String productInQty = elib.getDataFromExcel("Prod", 2, 2);
		String productQty = elib.getDataFromExcel("Prod", 2, 3);
		HomePage hp = new HomePage(driver);
		CreateNewProductPage cnp = new CreateNewProductPage(driver);
		CreateProductPage cpp = new CreateProductPage(driver);
		ProductInfoPage pip = new ProductInfoPage(driver);

		// navigate to Products
		cnp.createProduct(hp, cnp, productName, productInQty);
		pip.verifyProductName(productName);
		System.out.println("create Product");

	}

}
