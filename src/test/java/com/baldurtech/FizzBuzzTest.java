package com.baldurtech;

import com.baldurtech.unit.TestCase;

public class FizzBuzzTest extends TestCase
{
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
	public void test_4_should_be_4()
	{
		assertEquals("4",fizzBuzz.say(4));
	}
	public void test_5_should_be_Buzz()
	{
		assertEquals("Buzz",fizzBuzz.say(5));
	}
	
	
}