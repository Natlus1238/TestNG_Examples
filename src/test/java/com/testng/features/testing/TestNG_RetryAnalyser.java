package com.testng.features.testing;


import org.testng.annotations.Test;

public class TestNG_RetryAnalyser extends RetryAnalyser_Condition {
	
	
	@Test(retryAnalyzer = com.testng.features.testing.RetryAnalyser_Condition.class)
	private void retry1() {
		int i = 1/0;
		System.out.println("thi is a failed test case1|" + i );

	}

	@Test
	private void retry2() {
		String s = null;
		System.out.println("The Null String is|" + s);
		
	}
	
	@Test
	private void retry3() {

		System.out.println("This is a normal test");
		
	}
	
}
