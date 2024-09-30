package com.comcast.crm.objectrepository.assetspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAssetsPage {
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createAssetsImg;
	
	public CreateAssetsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreateAssetsImg() {
		return createAssetsImg;
	}

}
