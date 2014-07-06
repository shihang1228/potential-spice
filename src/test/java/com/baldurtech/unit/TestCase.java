package com.baldurtech.unit;

import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.util.Set;
import org.reflections.Reflections;
public class TestCase
{	
	static boolean testResult = true;
	public static void main(String[] args)throws Exception
	{		
		if(args.length > 0)
		{
			String testPackage = args[0];
			Reflections reflections = new Reflections(testPackage);
			Set<Class<? extends TestCase>> allTestCases = 
			reflections.getSubTypesOf(TestCase.class);
		
			for(Class clazz:allTestCases)
			{
				System.out.println("Testing:" + clazz.getName());
				runAllTests(clazz);
			}
		}
		
		outputTestReport();
	}
	
	private static List<Method> getAllTestMethods(Class clazz)
	{
		List<Method> testMethods = new ArrayList<Method>();
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method: methods)
		{
			if(method.getName().startsWith("test"))
			{
				testMethods.add(method);
			}
		}
		return testMethods;
	}
	public static void runAllTests(Class clazz) throws Exception
	{
		for(Method method: getAllTestMethods(clazz))
		{
			System.out.println("	testing:" + method.getName());
			try
			{
				Object obj = clazz.newInstance();
				method.invoke(obj,new Object[]{});
			}
			catch(Exception e)
			{
				testResult = false;
                System.out.println("Unexpected exception!");
                e.printStackTrace();
			}
		}
	}
	
	public static void assertEquals(String expectedResult,String actualResult)
	{
		boolean testFail = false == expectedResult.equals(actualResult);
		assertEquals(expectedResult,actualResult,testFail);
	}
	public static void assertEquals(int expectedResult,int actualResult)
	{
		boolean testFail = expectedResult != actualResult;
		assertEquals(expectedResult,actualResult,testFail);
	}
	private static void assertEquals(Object expectedResult, Object actualResult, boolean testFail)
	{
		if(testFail)
		{
			testResult = false;
			System.out.println("Expected '" + expectedResult + "' ,but '" + actualResult + "'");
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