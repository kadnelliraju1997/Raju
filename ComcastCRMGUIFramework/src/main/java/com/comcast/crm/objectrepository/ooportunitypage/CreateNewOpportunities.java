package com.comcast.crm.objectrepository.ooportunitypage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.comcast.crm.genric.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepository.homepage.HomePage;

public class CreateNewOpportunities {
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOpportunityImg;
	
	@FindBy(xpath = "//input[@name='potentialname']")
	private WebElement opportunityNameEdt;
	
	@FindBy(xpath = "//select[@id='related_to_type']")
	private WebElement opportunityOrgConDd;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement selectOggContImg;
	
	@FindBy(id="search_txt")
	private WebElement searchOppTextFiled;
	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchOppBtn;
	
	@FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[2]")
	private WebElement capaignImgBtn;
	
	public WebElement getCapaignImgBtn() {
		return capaignImgBtn;
	}


	public WebElement getSearchCampTextFiled() {
		return searchCampTextFiled;
	}


	public WebElement getSearchCampBtn() {
		return searchCampBtn;
	}

	@FindBy(id="search_txt")
	private WebElement searchCampTextFiled;
	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchCampBtn;
	
	public WebElement getCreateOpportunityImg() {
		return createOpportunityImg;
	}


	public WebElement getSearchOppTextFiled() {
		return searchOppTextFiled;
	}


	public WebElement getSearchOppBtn() {
		return searchOppBtn;
	}

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement opportunitySaveBtn;
	
	@FindBy(xpath = "//tbody/tr[4]/td[2]/img[1]")
	private WebElement selectCapaignImg;
	
	
	public CreateNewOpportunities(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getCreateOpportunityLink() {
		return createOpportunityImg;
	}
	public WebElement getOpportunityNameEdt() {
		return opportunityNameEdt;
	}
	public WebElement getOpportunityOrgConDd() {
		return opportunityOrgConDd;
	}
	public WebElement getSelectOggContImg() {
		return selectOggContImg;
	}
	public WebElement getOpportunitySaveBtn() {
		return opportunitySaveBtn;
	}
	public WebElement getSelectCapaignImg() {
		return selectCapaignImg;
	}
	
	public void selectOrgDd(String text)
	{
		Select sel=new Select(opportunityOrgConDd);
		sel.selectByVisibleText(text);
	}
	public void createOpportunity(HomePage hp,CreateNewOpportunities cp,String oppoName,String text1,WebDriverUtility wlib,WebDriver driver,String orgName,String campaignName) {
		hp.getOpportunitiesLink().click();
		cp.getCreateOpportunityLink().click();
		cp.getOpportunityNameEdt().sendKeys(oppoName);
		cp.selectOrgDd(text1);
		cp.getSelectOggContImg().click();
		wlib.switchToTabURL(driver, "module=Accounts&action");
		cp.getSearchOppTextFiled().sendKeys(orgName);
		cp.getSearchOppBtn().click();
		driver.findElement(By.xpath("//a[text()='" + orgName + "']")).click();
		wlib.switchToTabURL(driver, "module=Potentials&action");
		cp.getCapaignImgBtn().click();
		wlib.switchToTabURL(driver, "module=Campaigns&action");
		cp.getSearchCampTextFiled().sendKeys(campaignName);
		cp.getSearchCampBtn().click();
		wlib.switchToTabURL(driver, "module=Potentials&action");
		cp.getOpportunitySaveBtn();
	}
	
	

}
