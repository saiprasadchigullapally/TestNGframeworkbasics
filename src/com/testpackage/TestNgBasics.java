package com.testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics 

{
	
	/**
	 * setup system property from chrome
       Launch Chrome Browser
       Login into App
       Enter URL
       Google Title Test
       logout from App
       Close Browser
       delete all cookies
PASSED:googleTitleTest

	 * 
	 */
	
	// Pre conditions or Pre Requisites
	 
	
	//Pre-Conditions annotations ---Starts with @Before
	
	@BeforeSuite  //1
	public void setUP()  
	{
		System.out.println("@BeforeSuite --setup system property from chrome");
	}
	
	
	@BeforeTest  //2
	public void launchBrowser()
	{
		System.out.println(" @BeforeTest --Launch Chrome Browser");
	} 
	
	@BeforeClass //3
	public void loginMethod()
	{
		System.out.println("@BeforeClass-- Login into App");
	}
	
	
	
	/*
	 * @BeforeMethod
	 * @Test 1
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test 2
	 * @AfterMethod
	 * 
	 * 
	 * @BeforeMethod
	 * @Test 3
	 * @AfterMethod
	 * ....
	 * ...
	 * 
	 * 
	 */
	
	
	
	
	
	@BeforeMethod //4
	public void enterURL()
	{
		System.out.println(" @BeforeMethod---Enter URL");
	}
	
	
	//test case---Starting  with @Test
	
	
	@Test  //5
	public void googleTitleTest()
	{
		System.out.println("@Test---Google Title Test");
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("@Test---Search Test");
	}
	
	
	@Test
	public void googleLogoTest()
	{
		System.out.println("@Test---Google Logo Test");
	}
	
	//Post conditions annotations or @After
	@AfterMethod  //6
	public void logOUt()
	{
		System.out.println("@AfterMethod---logout from App");
	}

	
	
	@AfterClass //7
	public void closeBrowser()
	{
		System.out.println("@AfterClass---Close Browser");
	} 
	
	@AfterTest //8
	public void deleteAllCoolies()
	{
		System.out.println("@AfterTest---delete all cookies");
	}
	
	/*@AfterSuite
	public void generateTestReport()
	{
		System.out.println("generate Test Report");
	}
	*/
}
