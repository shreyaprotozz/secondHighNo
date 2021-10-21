package com.demo.secondHighNo.test;

import org.junit.Test;

import com.demo.secondHighNo.main.SecondHighNo;

import junit.framework.Assert;

public class secHighNoTest {
	

	@Test
	public void functionSwapReturnsSwapArrayTest() {
		char inputArrayToSwap[] = {'a', 'b', 'c'};
		char expectedOutputArray[] = {'c', 'b', 'a'};
		SecondHighNo secondHighNo = new SecondHighNo();
		
		char actualOutputArray[] = secondHighNo.swapChars(inputArrayToSwap, 0, 2);
		Assert.assertEquals(actualOutputArray, expectedOutputArray);
	}
	
	@Test
	public void findNextReturnsSecHighNumberTest() {
		String inputString = "12345";
		char[] expectedOutput = {'1','2','3','5','4'};
		SecondHighNo secondHighNo = new SecondHighNo();

		char actualOutput[] = secondHighNo.findHighNumber(inputString);
		Assert.assertEquals(actualOutput, expectedOutput);	}

	@Test
	public void findNextReturnsMinusOneTest() {
		String inputString = "5432";
		char[] expectedOutput = {'5','4','3','2'};
		SecondHighNo secondHighNo = new SecondHighNo();

		char actualOutput[] = secondHighNo.findHighNumber(inputString);
		Assert.assertEquals(actualOutput, expectedOutput);	}
}
