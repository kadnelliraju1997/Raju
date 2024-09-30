package com.comcast.crm.objectrepository.venderpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.objectrepository.homepage.HomePage;

public class CreateNewVender {
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createVenderImg;

	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement verdersSearchEdt;

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchNowBtn;

	@FindBy(xpath = "//input[@name='vendorname']")
	private WebElement venderEdt;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	public CreateNewVender(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateVenderImg() {
		return createVenderImg;
	}

	public WebElement getVerdersSearchEdt() {
		return verdersSearchEdt;
	}

	public WebElement getSearchNowBtn() {
		return searchNowBtn;
	}

	public WebElement getVenderEdt() {
		return venderEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void createVender(HomePage hp,CreateNewVender cv ,String venderName){
		hp.navigateToVender();
		cv.getCreateVenderImg().click();
		getVenderEdt().sendKeys(venderName);
		getSaveBtn().click();
	}

}
