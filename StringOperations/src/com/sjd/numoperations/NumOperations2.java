package com.sjd.numoperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumOperations2 {
	List <Integer> list = new ArrayList<>();
	int maxPalindrome = 0;
	int minPalindrome = 0;
	
	public void getPalindromToList() {
		    for (int i = 1000; i < 10000; i++) {
				for (int j = 1000; j < 10000; j++) {
					int productResult = i*j;
					int palindromCheck = 0;
					String productResultToString = Integer.toString(productResult);
					char [] chars = productResultToString.toCharArray();
					String productResultToStringReverse = Character.toString(chars[chars.length-1]);
					for (int k = chars.length -2; k >= 0; k--) {
						String getArrayValue = Character.toString(chars[k]);
						productResultToStringReverse = productResultToStringReverse + getArrayValue;
					}
					int productResultReverse = Integer.parseInt(productResultToStringReverse);
					if(productResult == productResultReverse) {
						palindromCheck = productResult;
					    list.add(palindromCheck);
					}
				   
		   }
		 }
	   }
      public int getMaxPalindrome() {
    	  int maxPalindrome = Collections.max(list);
    	  return maxPalindrome;
      }
	  public int getMinPalindrome() {
		  int minPalindrome = Collections.min(list);
		  return minPalindrome;
	  }	  		
}


