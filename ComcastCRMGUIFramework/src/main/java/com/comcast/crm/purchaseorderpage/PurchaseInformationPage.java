package com.comcast.crm.purchaseorderpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PurchaseInformationPage {

	@FindBy(xpath = "//span[@id='dtlview_Subject']")
	private WebElement Subject;

	@FindBy(xpath = "//span[@id='dtlview_Billing Address']")
	private WebElement VerifyBillingAddress;

	@FindBy(xpath = "//span[@id='dtlview_Shipping Address']")
	private WebElement VerifyShippingAddress;

	public PurchaseInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSubject() {
		return Subject;
	}

	public WebElement getVerifyBillingAddress() {
		return VerifyBillingAddress;
	}

	public WebElement getVerifyShippingAddress() {
		return VerifyShippingAddress;
	}

	public void verifySubject(String subject) {
		String actSubject = Subject.getText().trim();
		Assert.assertEquals(actSubject, subject);
	}

	public void verifyBillingAddress(String BillingAddress) {
		String actBillingAddress = VerifyBillingAddress.getText().trim();
		Assert.assertEquals(actBillingAddress, actBillingAddress);
	}

	public void verifyShippingAddress(String ShippingAddress) {
		String actShippingAddress = VerifyShippingAddress.getText().trim();
		Assert.assertEquals(actShippingAddress, ShippingAddress);
	}

}
