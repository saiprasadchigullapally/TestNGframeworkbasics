package com.testpackage;

import org.testng.annotations.Test;

public class ExpectedExceptions 
{
    @Test(expectedExceptions=NumberFormatException.class)
    public void exceptionHandler()
    {
	String s="1hanuman";
	
	Integer.parseInt(s);
    }
	
}
