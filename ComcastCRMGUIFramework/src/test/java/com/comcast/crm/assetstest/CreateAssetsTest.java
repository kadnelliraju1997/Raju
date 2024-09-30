package com.comcast.crm.assetstest;

import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepository.assetspage.AssetInformationPage;
import com.comcast.crm.objectrepository.assetspage.CreateAssetsPage;
import com.comcast.crm.objectrepository.assetspage.CreateNewAssetsPage;
import com.comcast.crm.objectrepository.homepage.HomePage;
import com.comcast.crm.objectrepository.orgpage.CreateNewOrganizationPage;
import com.comcast.crm.objectrepository.orgpage.OraganizationInfoPage;
import com.comcast.crm.objectrepository.orgpage.OrganizationPage;
import com.comcast.crm.objectrepository.productpage.CreateNewProductPage;
import com.comcast.crm.objectrepository.productpage.CreateProductPage;
import com.comcast.crm.objectrepository.productpage.ProductInfoPage;
import com.comcast.crm.objectrepository.salesorderpage.CreateNewSalesOrder;

public class CreateAssetsTest extends BaseClass {

	@Test
	public void createAssetTest() throws Throwable {
		String assetName = elib.getDataFromExcel("vender", 1, 2) + jlib.getRandomNumber();
		String orgName = elib.getDataFromExcel("org", 1, 2) + jlib.getRandomNumber();
		String serialNumber = elib.getDataFromExcel("org", 1, 5);
		String productName = elib.getDataFromExcel("Prod", 1, 1);
		String productInQty = elib.getDataFromExcel("Prod", 2, 2);
		String productQty = elib.getDataFromExcel("Prod", 2, 3);

		HomePage hp = new HomePage(driver);
		CreateProductPage cpp = new CreateProductPage(driver);
		CreateNewProductPage cnp = new CreateNewProductPage(driver);
		ProductInfoPage pip = new ProductInfoPage(driver);
		OrganizationPage op = new OrganizationPage(driver);
		OraganizationInfoPage oip = new OraganizationInfoPage(driver);
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		CreateNewSalesOrder cnco = new CreateNewSalesOrder(driver);
		CreateAssetsPage cap = new CreateAssetsPage(driver);
		CreateNewAssetsPage cnap = new CreateNewAssetsPage(driver);
		AssetInformationPage aip = new AssetInformationPage(driver);

		
		// navigate to Products
		cnp.createProduct(hp, cnp, productName, productInQty);
		
		//verification
		pip.verifyProductName(productName);

		// create an Organization
		cnop.createOrg(hp, op, orgName);

		// create an asset
		cnap.createAsset(hp, cap, serialNumber, assetName, wlib, productName, orgName, driver);
		
		//verification
		aip.verifyAssetName(assetName);

	}

}
