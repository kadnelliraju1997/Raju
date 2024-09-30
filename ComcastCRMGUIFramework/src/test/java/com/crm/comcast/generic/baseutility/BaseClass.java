package com.crm.comcast.generic.baseutility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {
	
	@Test
	public void createContactTest()
	{
		System.out.println("create organization");
	}
	@BeforeSuite
	public void configbs1()
	{
		System.out.println("<==connect to DB, Report Config==>bs1");
	}
	@BeforeClass
	public void configbc1()
	{
		System.out.println("Launch The Browser bc1");
	}
	@BeforeMethod
	public void configbm1()
	{
		System.out.println("Login to App bm1");	
				}
	@AfterMethod
	public void configam1()
	{
		System.out.println("Logout the App am1");
	}
	
	@AfterClass
	public void configac1()
	{
		System.out.println("Close the Browser ac1");
	}
	@AfterSuite
	public void configas1()
	{
		System.out.println("<==close to DB, Report BackUp==> as1");
	}
	@BeforeSuite
	public void configBS2()
	{
		System.out.println("<==connect to DB, Report Config==>BS2");
	}
	@BeforeClass
	public void configBC2()
	{
		System.out.println("Launch The Browser BC2");
	}
	@BeforeMethod
	public void configBM2()
	{
		System.out.println("Login to App BM2");	
				}
	@AfterMethod
	public void configAM2()
	{
		System.out.println("Logout the App AM2");
	}
	
	@AfterClass
	public void configAC2()
	{
		System.out.println("Close the Browser Ac2");
	}
	@AfterSuite
	public void configAS2()
	{
		System.out.println("<==close to DB, Report BackUp==>AS2");
	}

}
