package com.sjd.numoperations.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sjd.numoperations.NumOperations2;

class NumOperations2Test {

	@Test
	void test() {
		NumOperations2 test = new NumOperations2();
		test.getPalindromToList();
		int maxListValue = test.getMaxPalindrome();
		assertEquals(99000099,maxListValue);
	}

	@Test
	void test2() {
		NumOperations2 test = new NumOperations2();
		test.getPalindromToList();
		int minListValue = test.getMinPalindrome();
		assertEquals(1002001,minListValue);
	}
}
