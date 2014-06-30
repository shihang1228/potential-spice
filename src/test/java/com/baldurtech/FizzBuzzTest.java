package com.baldurtech;

public class FizzBuzzTest
{
	static boolean testResult = true;
	public static void main(String[] args)
	{		
		test_1();
		test_2();
		test_3();		
		outputTestReport();
		
	}
	public static void test_1()
	{
		FizzBuzz fizzBuzz1 = new FizzBuzz();
		assertEquals("1",fizzBuzz1.say(1));
	}
	public static void test_2()
	{
		FizzBuzz fizzBuzz2 = new FizzBuzz();
		assertEquals("2",fizzBuzz2.say(2));
	}
	public static void test_3()
	{
		FizzBuzz fizzBuzz3 = new FizzBuzz();
		assertEquals("Fizz",fizzBuzz3.say(3));
	}
	
	public static void assertEquals(String expectedResult,String actualResult)
	{
		if(false == expectedResult.equals(actualResult))
		{
			testResult = false;
			System.out.println("Expected '" + expectedResult + "',but '" + actualResult + "'");
		}
	}
	public static void outputTestReport()
	{
		if(testResult)
		{
			System.out.println("TEST SUCCESS");
		}
		else
		{
			System.out.println("TEST FAILED");
		}

	}
	
}