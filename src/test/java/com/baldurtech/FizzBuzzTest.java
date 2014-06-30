package com.baldurtech;

public class FizzBuzzTest
{
	static boolean testResult = true;
	public static void main(String[] args)
	{		
		new FizzBuzzTest().test_1_should_be_1();
		new FizzBuzzTest().test_2_should_be_2();
		new FizzBuzzTest().test_3_should_be_Fizz();		
		outputTestReport();
		
	}
	
	FizzBuzz fizzBuzz = new FizzBuzz();
	public void test_1_should_be_1()
	{
		assertEquals("1",fizzBuzz.say(1));
	}
	public void test_2_should_be_2()
	{
		assertEquals("2",fizzBuzz.say(2));
	}
	public void test_3_should_be_Fizz()
	{
		assertEquals("Fizz",fizzBuzz.say(3));
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