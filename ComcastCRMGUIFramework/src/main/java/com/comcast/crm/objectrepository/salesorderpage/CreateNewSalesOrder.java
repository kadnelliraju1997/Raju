package com.comcast.crm.objectrepository.salesorderpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.genric.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepository.homepage.HomePage;

public class CreateNewSalesOrder {

	@FindBy(xpath = "//input[@name='subject']")
	private WebElement subjectTextField;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveSaleOrderBtn;
	
	@FindBy(xpath = "//input[@name='account_name']/following-sibling::img")
	private WebElement selectOrgNameImg;
	
	@FindBy(id="search_txt")
	private WebElement searchOrgTextFiled;
	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchOrgBtn;
	
	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement billingAddressTf;
	
	@FindBy(id="search_txt")
	private WebElement searchProTf;
	
	@FindBy(id="qty1")
	private WebElement productQtyTf;
	
	public WebElement getProductQtyTf() {
		return productQtyTf;
	}

	@FindBy(name="search")
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

	public WebElement getProductImg() {
		return productImg;
	}

	@FindBy(xpath = "//textarea[@name='ship_street']")
	private WebElement shippingAddressTf;
	
	@FindBy(xpath = "//input[@name='qty1']")
	private WebElement quantityTf;
	
	@FindBy(id = "searchIcon1")
	private WebElement productImg;
	
	public WebElement getBillingAddressTf() {
		return billingAddressTf;
	}

	public WebElement getShippingAddressTf() {
		return shippingAddressTf;
	}

	public WebElement getSubjectTextField() {
		return subjectTextField;
	}

	public WebElement getSaveSaleOrderBtn() {
		return saveSaleOrderBtn;
	}

	public WebElement getSelectOrgNameImg() {
		return selectOrgNameImg;
	}

	public WebElement getSearchOrgTextFiled() {
		return searchOrgTextFiled;
	}

	public WebElement getSearchOrgBtn() {
		return searchOrgBtn;
	}

	public CreateNewSalesOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void createSales(HomePage hp,CreateSalesOrder cso,WebDriver driver,String subject,WebDriverUtility wlib,String orgName,String lastName,String productName,String productQty) {
		
		hp.getMoreLink().click();
		hp.getSalesOrderLink().click();
		cso.getCreateSalesOrderImg().click();
		getSubjectTextField().sendKeys(subject);
		getSelectOrgNameImg().click();
		wlib.switchToTabURL(driver, "module=Accounts&action");
		getSearchOrgTextFiled().sendKeys(orgName);
		getSearchOrgBtn().click();
		driver.findElement(By.xpath("//a[text()='" + orgName + "']")).click();
		wlib.switchToAlerAcceptt(driver);
		wlib.switchToTabURL(driver, "module=SalesOrder&action");
		getShippingAddressTf().sendKeys(orgName);
		getBillingAddressTf().sendKeys(lastName);
		getProductImg().click();
		wlib.switchToTabURL(driver, "module=Products&action");
		getSearchProTf().sendKeys(productName);
		getSearchProBtn().click();
		driver.findElement(By.xpath("//a[text()='" + productName + "']")).click();
		wlib.switchToTabURL(driver, "module=SalesOrder&action");
		getProductQtyTf().sendKeys(productQty);
		getSaveSaleOrderBtn().click();
	}
}
