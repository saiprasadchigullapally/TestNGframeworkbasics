package com.testpackage;

import org.testng.annotations.Test;

public class TestNgFeatures 
{

	
	@Test
	
	public void loginTest()
	{
		System.out.println("Login Test");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	
	public void HomePageTest()
	{
		System.out.println("Login Test");
	}
	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest()
	{
		System.out.println("Search Page Test");
	}
	@Test(dependsOnMethods="loginTest")
	public void RegPageTest()
	{
		System.out.println("RegPageTest");
	}
	
//	@Test
//	public void SearchPageTest()
//	{
//		System.out.println("Login Test");
//	}
//	
	
	
	
}
