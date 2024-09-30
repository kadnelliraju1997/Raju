package com.practice1;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HomePageTest {

	@Test
	public void homePageTest(Method mtd)
	{
		Reporter.log(mtd.getName()+"Test Start",true);
		Reporter.log("step-1",true);
		Reporter.log("step-2",true);
		Reporter.log("step-3",true);
		Reporter.log("step-4",true);
		Reporter.log(mtd.getName()+"Test End",true);
	}
	@Test
	public void verifyLogoOfHomePageTest(Method mtd)
	{
		Reporter.log(mtd.getName()+"Test Start",true);
		Reporter.log("step-1",true);
		Reporter.log("step-2",true);
		Reporter.log("step-3",true);
		Reporter.log("step-4",true);
		Reporter.log(mtd.getName()+"Test End",true );
	}
}
