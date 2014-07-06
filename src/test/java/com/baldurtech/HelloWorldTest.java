package com.baldurtech;

import com.baldurtech.unit.TestCase;

public class HelloWorldTest extends TestCase
{
	public void test_1_should_equals_1()
	{
		assertEquals("1",String.valueOf(1));
	}
	public void test_2_should_equals_2()
	{
		assertEquals(2,Integer.parseInt("2"));
	}
	public void test_3_should_equals_3()
	{
		assertEquals(new Integer(3),new Integer("3"));
	}
	public void test_null()
	{
		assertNull(new Long("0"));
	}
	public void test_null_2()
	{
		assertNull(null);
	}
	
}