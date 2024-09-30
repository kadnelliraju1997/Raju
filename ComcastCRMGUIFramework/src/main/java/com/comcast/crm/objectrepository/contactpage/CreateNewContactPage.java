package com.comcast.crm.objectrepository.contactpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.genric.webdriverutility.JavaUtility;
import com.comcast.crm.genric.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepository.homepage.HomePage;

public class CreateNewContactPage {
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createNewOrgBtn;

	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement searchOrgEdt;

	@FindBy(xpath = "//select[@name='search_field']")
	private WebElement orgInDd;

	// lookUp
	@FindBy(xpath = "//input[@id='search_txt']")
	private WebElement searchOrg_txtLookUp;

	@FindBy(name = "search")
	private WebElement searchInLookUpBtn;

	public WebElement getSearchOrg_txtLookUp() {
		return searchOrg_txtLookUp;
	}

	public WebElement getSearchInLookUpBtn() {
		return searchInLookUpBtn;
	}

	public WebElement getSearchNowOrgBtn() {
		return searchNowOrgBtn;
	}

	@FindBy(xpath = "//input[@name='submit']")
	private WebElement searchNowOrgBtn;

	public WebElement getSearchNowOrg() {
		return searchNowOrgBtn;
	}

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastNameEdt;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	@FindBy(xpath = "//input[@name='account_name']/following-sibling::img")
	private WebElement selectOrgNameImg;

	@FindBy(xpath = "//input[@name='support_start_date']")
	private WebElement supportStartDate;

	public WebElement getSupportStartDate(String startDate) {
		return supportStartDate;
	}

	public WebElement getSupportEndDate(String endDate) {
		return supportEndDate;
	}

	@FindBy(xpath = "//input[@name='support_end_date']")
	private WebElement supportEndDate;

	public CreateNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLastNameEdt() {
		return lastNameEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getSelectOrgNameImg() {
		return selectOrgNameImg;
	}

	public WebElement getCreateContactImg() {
		return lastNameEdt;
	}

	public void createContact(HomePage hp,CreateContactPage cc,String lastName) {
		hp.getContactLink().click();
		cc.getCreateContactImg().click();
		lastNameEdt.sendKeys(lastName);
		saveBtn.click();
	}

	public void createContactOrg(HomePage hp,CreateContactPage cc,WebDriver driver, String lastName, WebDriverUtility wlib, String orgName) {

		hp.getContactLink().click();
		cc.getCreateContactImg().click();
		getLastNameEdt().sendKeys(lastName);
		getSelectOrgNameImg().click();
		wlib.switchToTabURL(driver, "module=Accounts&action");
		getSearchOrg_txtLookUp().sendKeys(orgName);
		getSearchInLookUpBtn().click();
		driver.findElement(By.xpath("//a[text()='" + orgName + "']")).click();
		wlib.switchToTabURL(driver, "module=Contacts&action");
		getSaveBtn().click();
	}

	public void createContactSupportDate(HomePage hp,CreateContactPage cc,String lastName, JavaUtility jlib) {

		hp.getContactLink().click();
		cc.getCreateContactImg().click();
		lastNameEdt.sendKeys(lastName);
		String startDate = jlib.getSystemDateYYYYMMDD();
		String endDate = jlib.getRequiredDateYYYYMMDD(30);
		getSupportStartDate(startDate);
		getSupportEndDate(endDate);
		saveBtn.click();
	}

}
