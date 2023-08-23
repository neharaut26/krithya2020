package com.testcases;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class AnnotationsInTestNg {
	
	@BeforeSuite
	public void first()
	{
		System.out.println("beforeSuite");
	}
	@BeforeTest
	public void second() {
		System.out.println("beforetest");
	}
	@BeforeClass
	public void classfirst() {
		System.out.println("beforeclass");
	}
	
	@BeforeMethod
	public void third()
	{
		System.out.println("beforemethod");
	}
	@BeforeClass
	public void classsecond() {
		System.out.println("beforeclass2tbbet");
	}
	@Test
	public void testcase1() {
		System.out.println("testcase1");
	}
	@Test
	public void testcase2() {
		System.out.println(1234);
	}
	@AfterMethod
	public void fourth() {
		System.out.println("aftermethod");
	}
	
	@AfterClass
	public void classfirst1() {
		System.out.println("afterclass");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}

	@AfterSuite
	public void after()
	{
		System.out.println("afterSuite");
	}

}
