package org.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer{

	int min=0,max=5;
	
	public boolean retry(ITestResult result) {

		if (min<max) {
			
			min++;
			return true;
		}
		
		return false;
	}

	/*
	 * tc1---passed
	 * tc2---passed
	 * tc3------failed------0<3----retry---rerun---once tc3 getting passed the 
	 * control should be move next test case
	 * tc3------failed------1<3----retry---rerun
	 * tc3------failed------2<3----retry---rerun
	 * tc3------failed------3<3
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * /
	 */
}
