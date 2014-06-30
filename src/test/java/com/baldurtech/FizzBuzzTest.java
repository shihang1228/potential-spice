package com.baldurtech;

public class FizzBuzzTest
{
	static boolean testResult = true;
	public static void main(String[] args)
	{		
		FizzBuzz fizzBuzz1 = new FizzBuzz();
		assertEquals("1",fizzBuzz1.say(1));
		FizzBuzz fizzBuzz2 = new FizzBuzz();
		assertEquals("2",fizzBuzz2.say(2));
		FizzBuzz fizzBuzz3 = new FizzBuzz();
		assertEquals("Fizz",fizzBuzz3.say(3));
		
		outputTestReport();
		
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