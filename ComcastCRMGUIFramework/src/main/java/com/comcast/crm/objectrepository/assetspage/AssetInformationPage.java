package com.comcast.crm.objectrepository.assetspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AssetInformationPage {
	
	@FindBy(xpath ="//span[@id='dtlview_Serial Number']")
	private WebElement serialNumberVerify;
	
	@FindBy(xpath = "//span[@id='dtlview_Asset Name']")
	private WebElement assetNameVerify;

	public AssetInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSerialNumberVerify() {
		return serialNumberVerify;
	}

	public WebElement getAssetNameVerify() {
		return assetNameVerify;
	}
	
	public void verifyAssetName(String assetName){
		String actAssetName = assetNameVerify.getText().trim();
		Assert.assertEquals(actAssetName, assetName);
	

	}
	
	public void verifySerialNumber(String serialNumber){
		String actSerialNumber = assetNameVerify.getText().trim();
		Assert.assertEquals(actSerialNumber, serialNumber);
	}

}
