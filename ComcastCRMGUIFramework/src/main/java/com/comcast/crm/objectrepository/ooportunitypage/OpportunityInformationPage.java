package com.comcast.crm.objectrepository.ooportunitypage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class OpportunityInformationPage {
	
	@FindBy(xpath = "//span[@id='dtlview_Opportunity Name']")
	private WebElement opportunityNameTf;
	
	@FindBy(xpath = "//a[@title='Organizations']")
	private WebElement relatedNmaeTf;
	
	
	public OpportunityInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getOpportunityNameTf() {
		return opportunityNameTf;
	}


	public WebElement getRelatedNmaeTf() {
		return relatedNmaeTf;
	}
	
	public void verifyOppoRelated(String oppoName){
		String actOppoName = relatedNmaeTf.getText().trim();
	Assert.assertEquals(actOppoName, oppoName);
	}

}
