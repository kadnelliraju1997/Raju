package com.comcast.crm.objectrepository.invoicepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.comcast.crm.genric.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepository.homepage.HomePage;

public class CreateNewInvoicePage {

	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createInvoiceImg;

	@FindBy(name = "subject")
	private WebElement subjectTf;

	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement billingAddressTf;

	@FindBy(xpath = "//textarea[@name='ship_street']")
	private WebElement shippingAddressTf;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveInvoiceBtn;

	public WebElement getSubjectTf() {
		return subjectTf;
	}

	public WebElement getBillingAddressTf() {
		return billingAddressTf;
	}

	public WebElement getShippingAddressTf() {
		return shippingAddressTf;
	}

	public WebElement getSaveInvoiceBtn() {
		return saveInvoiceBtn;
	}

	public WebElement getCreateInvoiceImg() {
		return createInvoiceImg;
	}

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement orgNameEdt;

	@FindBy(xpath = "//select[@name='industry']")
	private WebElement selIndustryDD;

	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phoneNoEdt;

	@FindBy(xpath = "//select[@name='accounttype']")
	private WebElement selTypeDD;

	public WebElement getSelIndustryDD() {
		return selIndustryDD;
	}

	public WebElement getTypeDD() {
		return selTypeDD;
	}

	public void selectIndusryDd(String text) {
		Select sel = new Select(selIndustryDD);
		sel.selectByVisibleText(text);
	}

	public void selectTypeDd(String text) {
		Select sel = new Select(selTypeDD);
		sel.selectByVisibleText(text);
	}

	public WebElement getPhoneNoEdt() {
		return phoneNoEdt;
	}

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;

	@FindBy(name = "industry")
	private WebElement industryDd;

	@FindBy(id = "dtlview_Phone")
	private WebElement PhoneNoVerify;

	public WebElement getPhoneNoVerify() {
		return PhoneNoVerify;
	}

	public WebElement getIndustryDd() {
		return industryDd;
	}

	public WebElement getOrgNameEdt() {
		return orgNameEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	@FindBy(xpath = "//input[@name='vendor_name']/following-sibling::img")
	private WebElement venderImg;

	@FindBy(xpath = "//input[@name='contact_name']/following-sibling::img")
	private WebElement contactImg;

	@FindBy(id = "searchIcon1")
	private WebElement productImg;

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

	@FindBy(id = "qty1")
	private WebElement productQtyTf;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savePurchaseOrderBtn;

	public CreateNewInvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createProductImg;

	@FindBy(xpath = "//input[@name='productname']")
	private WebElement productNameEdit;

	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement selectVender;

	@FindBy(xpath = "//input[@id='qtyinstock']")
	private WebElement instockQtyTf;

	public WebElement getInstockQtyTf() {
		return instockQtyTf;
	}

	public WebElement getSelectVender() {
		return selectVender;
	}

	public WebElement getProductNameEdit() {
		return productNameEdit;
	}

	public WebElement getCreateProductImg() {
		return createProductImg;
	}

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

	public WebElement getLastNameEdt() {
		return lastNameEdt;
	}

	public WebElement getSelectOrgNameImg() {
		return selectOrgNameImg;
	}

	public WebElement getCreateContactImg() {
		return lastNameEdt;
	}

	@FindBy(xpath = "//input[@name='subject']")
	private WebElement subjectTextField;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveSaleOrderBtn;

	@FindBy(id = "search_txt")
	private WebElement searchOrgTextFiled;

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchOrgBtn;

	@FindBy(id = "search_txt")
	private WebElement searchProTf;

	@FindBy(name = "search")
	private WebElement searchProBtn;

	public WebElement getSearchProTf() {
		return searchProTf;
	}

	public WebElement getSearchProBtn() {
		return searchProBtn;
	}

	public WebElement getQuantityTf() {
		return quantityTf;
	}

	@FindBy(xpath = "//input[@name='qty1']")
	private WebElement quantityTf;

	public WebElement getSubjectTextField() {
		return subjectTextField;
	}

	public WebElement getSaveSaleOrderBtn() {
		return saveSaleOrderBtn;
	}

	public WebElement getSearchOrgTextFiled() {
		return searchOrgTextFiled;
	}

	public WebElement getSearchOrgBtn() {
		return searchOrgBtn;
	}

	// lookUp

	public WebElement getSearchOrgEdt() {
		return searchOrgEdt;
	}

	public WebElement getOrgInDd() {
		return orgInDd;
	}

	public WebElement getSearchOrgedt() {
		return searchOrgEdt;
	}

	public WebElement getCreateNewOrgBtn() {
		return createNewOrgBtn;
	}

	public void createInvoice(HomePage hp ,CreateNewInvoicePage cinp,String campaignName, WebDriverUtility wlib, WebDriver driver, String orgName,
			String lastName, String productName, String productQty) {

		hp.getMoreLink().click();
		hp.getInvoiceLink().click();
		cinp.getCreateInvoiceImg().click();
		getSubjectTf().sendKeys(campaignName);
		getSelectOrgNameImg().click();
		wlib.switchToTabURL(driver, "module=Accounts&action");
		getSearchOrgEdt().sendKeys(orgName);
		getSearchInLookUpBtn().click();

		driver.findElement(By.xpath("//a[text()='" + orgName + "']")).click();
		wlib.switchToTabURL(driver, "module=Invoice&action");
		getBillingAddressTf().sendKeys(lastName);
		getShippingAddressTf().sendKeys(lastName);
		getProductImg().click();
		wlib.switchToTabURL(driver, "module=Products&action");
		getSearchProTf().sendKeys(productName);
		getSearchProBtn().click();
		driver.findElement(By.xpath("//a[text()='" + productName + "']")).click();
//		wlib.switchToAlerAcceptt(driver);
		wlib.switchToTabURL(driver, "module=SalesOrder&action");
		getProductQtyTf().sendKeys(productQty);
		getSaveBtn().click();
	}

}
