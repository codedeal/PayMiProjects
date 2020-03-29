package com.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases 
{
		
	@Test
	public void test1()
	{
		System.out.print("in test 1");
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void test2()
	{
		System.out.print("in test 2");
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void test3()
	{
		System.out.print("in test 3");
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void test4()
	{
		System.out.print("in test 4");
		Assert.assertEquals(true, true);
	}
}
