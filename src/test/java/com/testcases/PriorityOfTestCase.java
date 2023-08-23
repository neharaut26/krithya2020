package com.testcases;

import org.testng.annotations.Test;

public class PriorityOfTestCase {
@Test(priority=0)
public void priority() {
	System.out.println("priority");
}
@Test(priority=2)
public void amit() {
	System.out.println("amit");
}
@Test(priority=-4)
public void neha() {
	System.out.println("neha");
}
@Test(priority=7)
public void baby() {
	System.out.println("baby");
}


	
	
}
