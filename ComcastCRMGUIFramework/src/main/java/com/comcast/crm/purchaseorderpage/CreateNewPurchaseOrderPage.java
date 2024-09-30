package com.comcast.crm.purchaseorderpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewPurchaseOrderPage {

	@FindBy(xpath = "//input[@name='subject']")
	private WebElement subjectTf;
	
	@FindBy(xpath = "//input[@name='vendor_name']/following-sibling::img")
	private WebElement venderImg;
	
	@FindBy(xpath = "//input[@name='contact_name']/following-sibling::img")
	private WebElement contactImg;
	
	@FindBy(id = "searchIcon1")
	private WebElement productImg;
	
	public WebElement getSubjectTf() {
		return subjectTf;
	}

	public WebElement getVenderImg() {
		return venderImg;
	}

	public WebElement getContactImg() {
		return contactImg;
	}

	public WebElement getProductImg() {
		return productImg;
	}

	public WebElement getProductQtyTf() {
		return productQtyTf;
	}

	public WebElement getSavePurchaseOrderBtn() {
		return savePurchaseOrderBtn;
	}

	public WebElement getShippingAddressTf() {
		return shippingAddressTf;
	}

	public WebElement getBillingAddressTf() {
		return billingAddressTf;
	}

	@FindBy(id="qty1")
	private WebElement productQtyTf;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savePurchaseOrderBtn;
	
	@FindBy(xpath = "//textarea[@name='ship_street']")
	private WebElement shippingAddressTf;
	
	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement billingAddressTf;
	
	public CreateNewPurchaseOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
