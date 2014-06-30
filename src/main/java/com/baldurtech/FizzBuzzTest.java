package com.baldurtech;

public class FizzBuzzTest
{
	static boolean testResult = true;
	public static void main(String[] args)
	{		
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actualResult = fizzBuzz.say(1);
		if(false == "1".equals(actualResult))
		{
			testResult = false;
			System.out.println("Expected '1',but '" + actualResult + "'");
		}
		actualResult = fizzBuzz.say(2);
		if(false =="2".equals(actualResult))
		{
			testResult = false;
			System.out.println("Expected '2' but '" + actualResult + "'");
		}
		
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