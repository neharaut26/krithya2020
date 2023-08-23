package com.testcases;

import org.testng.annotations.Test;

public class GroupsInTestNg {
@Test(groups={"sanity"})
public void add()
{
	int a= 10;
	System.out.println(10+a);
}
@Test(groups= {"sanity","smoke"})
public void sub()
{
	int a= 10;
	System.out.println(20-a);
}
@Test(groups= {"smoke","regression"})
public void mul()
{
	int a= 10;
	System.out.println(10*a);
}
@Test(groups= {"system"})
public void div()
{
	int a= 10;
	System.out.println(10/a);
}
}
