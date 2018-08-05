package com.sjd.main;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.sjd.numoperations.NumOperations2;


public class MainNumSum2 {
	private static Logger logger = Logger.getLogger(MainNumSum2.class.getName());
	public static void main(String[] args) {
		NumOperations2 operations = new NumOperations2();
		operations.getPalindromToList();
		logger.log(Level.INFO," Max palindrome is " + operations.getMaxPalindrome());
		logger.log(Level.INFO," Min palindrome is " + operations.getMinPalindrome());
	    
	}

}
