package com.comcast.crm.objectrepository.venderpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendersPage {

	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement verdersSearchEdt;

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchNowBtn;

	public VendersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getVerdersSearchEdt() {
		return verdersSearchEdt;
	}

	public WebElement getSearchNowBtn() {
		return searchNowBtn;
	}

}
