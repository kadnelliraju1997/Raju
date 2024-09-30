package com.comcast.crm.vendertest;

import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepository.homepage.HomePage;
import com.comcast.crm.objectrepository.productpage.CreateNewProductPage;
import com.comcast.crm.objectrepository.productpage.ProductInfoPage;
import com.comcast.crm.objectrepository.venderpage.CreateNewVender;
import com.comcast.crm.objectrepository.venderpage.VendersPage;
import com.comcast.crm.objectrepository.venderpage.VendorInformationPage;

public class CreateVender extends BaseClass {

	@Test
	public void createVender() throws Throwable {

		String venderName = elib.getDataFromExcel("vender", 1, 2) + jlib.getRandomNumber();
		String productName = elib.getDataFromExcel("Prod", 1, 1) + jlib.getRandomNumber();
		String productQty = elib.getDataFromExcel("Prod", 1, 3);

		

		HomePage hp = new HomePage(driver);
		CreateNewVender cv = new CreateNewVender(driver);
		CreateNewProductPage cnp = new CreateNewProductPage(driver);
		VendorInformationPage vip=new VendorInformationPage(driver);
		VendersPage vp = new VendersPage(driver);
		ProductInfoPage pip=new ProductInfoPage(driver);

		// create new vender
		cv.createVender(hp, cv, venderName);

		// navigate to Products
		cnp.createProductWtithVender(hp, productName, wlib, driver, venderName, productQty);
		
		//verification
		vip.verifyVenderName(venderName);
		pip.verifyProductName(productName);

		

	}
}
