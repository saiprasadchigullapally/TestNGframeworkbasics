package com.testpackage;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	
	@Test(timeOut=20)
	public void infintloopTest()
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}

}
