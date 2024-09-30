package com.comcast.crm.objectrepository.productpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.genric.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepository.homepage.HomePage;

public class CreateNewProductPage {

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

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement verdersSearchEdt;
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchNowBtn;

	public WebElement getVerdersSearchEdt() {
		return verdersSearchEdt;
	}

	public WebElement getSearchNowBtn() {
		return searchNowBtn;
	}

	public WebElement getSelectVender() {
		return selectVender;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getProductNameEdit() {
		return productNameEdit;
	}

	public CreateNewProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateProductImg() {
		return createProductImg;
	}

	public void createProduct(HomePage hp,CreateNewProductPage cnp,String productName, String productInQty) {

		hp.getProductLink().click();
		cnp.getCreateProductImg().click();
		getCreateProductImg().click();
		getProductNameEdit().sendKeys(productName);
		getInstockQtyTf().sendKeys(productInQty);
		getSaveBtn().click();
	}

	public void createProductWtithVender(HomePage hp,String productName, WebDriverUtility wlib, WebDriver driver, String venderName,
			String productQty) {
		hp.getProductLink().click();
		getCreateProductImg().click();
		getProductNameEdit().sendKeys(productName);
		getSelectVender().click();

		wlib.switchToTabURL(driver, "module=Vendors&action");
		getVerdersSearchEdt().sendKeys(venderName);
		getSearchNowBtn().click();
		driver.findElement(By.xpath("//a[text()='" + venderName + "']")).click();

		wlib.switchToTabURL(driver, "module=Products&action");

		getInstockQtyTf().sendKeys(productQty);

		getSaveBtn().click();

	}

}
