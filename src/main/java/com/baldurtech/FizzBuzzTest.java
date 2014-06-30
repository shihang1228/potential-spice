package com.baldurtech;

public class FizzBuzzTest
{
	static boolean testResult = true;
	public static void main(String[] args)
	{		
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		assertEquals("1",fizzBuzz.say(1));
		assertEquals("2",fizzBuzz.say(2));
		assertEquals("Fizz",fizzBuzz.say(3));
		
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