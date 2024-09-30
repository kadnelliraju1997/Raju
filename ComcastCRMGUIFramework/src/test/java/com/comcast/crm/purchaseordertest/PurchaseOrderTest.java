package com.comcast.crm.purchaseordertest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepository.contactpage.ContactInfoPage;
import com.comcast.crm.objectrepository.contactpage.CreateContactPage;
import com.comcast.crm.objectrepository.contactpage.CreateNewContactPage;
import com.comcast.crm.objectrepository.homepage.HomePage;
import com.comcast.crm.objectrepository.productpage.CreateNewProductPage;
import com.comcast.crm.objectrepository.productpage.ProductInfoPage;
import com.comcast.crm.objectrepository.salesorderpage.CreateNewSalesOrder;
import com.comcast.crm.objectrepository.venderpage.CreateNewVender;
import com.comcast.crm.objectrepository.venderpage.VendersPage;
import com.comcast.crm.objectrepository.venderpage.VendorInformationPage;
import com.comcast.crm.purchaseorderpage.CreateNewPurchaseOrderPage;
import com.comcast.crm.purchaseorderpage.CreatePurchaseOrderPage;
import com.comcast.crm.purchaseorderpage.PurchaseInformationPage;

public class PurchaseOrderTest extends BaseClass {

	@Test
	public void createPurchaseOrderTest() throws Throwable {

		String lastName = elib.getDataFromExcel("contact", 1, 2) + jlib.getRandomNumber();
		String venderName = elib.getDataFromExcel("vender", 1, 2) + jlib.getRandomNumber();

		String productName = elib.getDataFromExcel("Prod", 1, 1);
		String productInQty = elib.getDataFromExcel("Prod", 2, 2);
		String productQty = elib.getDataFromExcel("Prod", 2, 3);

		HomePage hp = new HomePage(driver);
		CreatePurchaseOrderPage cpo = new CreatePurchaseOrderPage(driver);
		CreateNewPurchaseOrderPage cnpo = new CreateNewPurchaseOrderPage(driver);
		CreateContactPage cc = new CreateContactPage(driver);
		CreateNewContactPage cnc = new CreateNewContactPage(driver);
		CreateNewVender cv = new CreateNewVender(driver);
		CreateNewSalesOrder cno = new CreateNewSalesOrder(driver);
		VendersPage vp = new VendersPage(driver);
		PurchaseInformationPage pip = new PurchaseInformationPage(driver);
		VendorInformationPage vip = new VendorInformationPage(driver);
		ProductInfoPage pipp = new ProductInfoPage(driver);
		ContactInfoPage cip = new ContactInfoPage(driver);

		// create contact
		hp.getContactLink().click();

		cc.getCreateContactImg().click();

		cnc.getLastNameEdt().sendKeys(lastName);
		cnc.getSaveBtn().click();

		// navigate to vender

		hp.getMoreLink().click();
		hp.getVenderLink().click();
		cv.getCreateVenderImg().click();
		cv.getVenderEdt().sendKeys(venderName);
		cv.getSaveBtn().click();
		Thread.sleep(2000);

		// navigate to Products
		hp.getProductLink().click();
		CreateNewProductPage cnp = new CreateNewProductPage(driver);
		cnp.getCreateProductImg().click();
		Thread.sleep(2000);
		cnp.getProductNameEdit().sendKeys(productName);

		cnp.getInstockQtyTf().sendKeys(productInQty);

		cnp.getSaveBtn().click();

		hp.getMoreLink().click();
		hp.getPurchaseOrderLink().click();
		cpo.getPurchaseOrderImg().click();
		cnpo.getSubjectTf().sendKeys(lastName);
		cnpo.getVenderImg().click();
		wlib.switchToTabURL(driver, "module=Vendors&action");
		vp.getVerdersSearchEdt().sendKeys(venderName);
		vp.getSearchNowBtn().click();
		driver.findElement(By.xpath("//a[text()='" + venderName + "']")).click();
		wlib.switchToTabURL(driver, "module=PurchaseOrder&action");

		cnpo.getContactImg().click();
		wlib.switchToTabURL(driver, "module=Contacts&action");
		vp.getVerdersSearchEdt().sendKeys(lastName);
		vp.getSearchNowBtn().click();

		driver.findElement(By.xpath("//a[text()=' " + lastName + "']")).click();
		wlib.switchToAlerAcceptt(driver);

		wlib.switchToTabURL(driver, "module=PurchaseOrder&action");

		cnpo.getBillingAddressTf().sendKeys(lastName);
		cnpo.getShippingAddressTf().sendKeys(lastName);

		cnpo.getProductImg().click();
		wlib.switchToTabURL(driver, "module=Products&action");
		cno.getSearchProTf().sendKeys(productName);
		cno.getSearchProBtn().click();
		driver.findElement(By.xpath("//a[text()='" + productName + "']")).click();
		wlib.switchToTabURL(driver, "module=PurchaseOrder&action");

		cnpo.getProductQtyTf().sendKeys(productQty);
		cnpo.getSavePurchaseOrderBtn().click();

		// verifiction
		pip.verifySubject(lastName);
		pip.verifyBillingAddress(lastName);
		pip.verifyShippingAddress(lastName);
		vip.verifyVenderName(venderName);

	}

}
