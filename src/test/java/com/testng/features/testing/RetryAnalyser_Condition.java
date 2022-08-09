package com.testng.features.testing;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser_Condition implements IRetryAnalyzer {
	 
	  private int retryCount = 0;
	  private static final int maxRetryCount = 4;
	 
	  @Override
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }
	}
