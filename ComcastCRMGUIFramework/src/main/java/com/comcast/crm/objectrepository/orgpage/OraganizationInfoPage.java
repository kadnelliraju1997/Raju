package com.comcast.crm.objectrepository.orgpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class OraganizationInfoPage {
	@FindBy(xpath = "//span[@id='dtlview_Organization Name']")
	private WebElement headerMsg;

	@FindBy(xpath = "//span[@id='dtlview_Phone']")
	private WebElement phoneNumberVerify;

	public WebElement getPhoneNumberVerify() {
		return phoneNumberVerify;
	}

	@FindBy(xpath = "//span[@id='dtlview_Industry']")
	private WebElement verifyIndustryDd;

	@FindBy(xpath = "//span[@id='dtlview_Type']")
	private WebElement verifyTypeDd;

	public OraganizationInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getHeaderMsg() {
		return headerMsg;
	}

	public WebElement getVerifyIndustryDd() {
		return verifyIndustryDd;
	}

	public WebElement getVerifyTypeDd() {
		return verifyTypeDd;
	}

	public void verifyOrgName(String orgName) {
		String actOrgaName = headerMsg.getText().trim();
		boolean status = actOrgaName.contains(orgName);
		Assert.assertEquals(status, true);
	}

	public void verifyOrgPhoneNo(String phoneNumber) {
		String actPhoneNumber = phoneNumberVerify.getText().trim();
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actPhoneNumber, phoneNumber) ;
	}

	public void verifyIndustryDd(String IndustryDd) {
		String actIndustryDd = verifyIndustryDd.getText().trim();
		 boolean status = actIndustryDd.equals(IndustryDd);
		 SoftAssert soft=new SoftAssert();
		 soft.assertEquals(status, true);
		 soft.assertAll();
	}

	public void verifyTypeDd(String TypeDd) {
		String actTypeDd = verifyTypeDd.getText().trim();
		SoftAssert soft=new SoftAssert();
		boolean status = actTypeDd.contains(TypeDd);
		soft.assertEquals(status, true);
		soft.assertAll();
		
	}

}
