package com.sjd.multiplicationintocolumn;

public class MultiColumn {

	
    
	public void multiplicationIntoColumn(int multiplier1,int multiplier2) {
		int multiResult = multiplier1*multiplier2;
		String operationResult = Integer.toString(multiResult);
		String emptyValuecontainer = null;
		String eruptionValueContainer = null;
		String emptyValue = " ";
        String eruption = "_";
        String checkLength = " ";
		String num = Integer.toString(multiplier2);
		char [] chars = num.toCharArray();
		char [] empty = num.toCharArray();
		char [] amountOfEruption = operationResult.toCharArray();
		
		for(int j = 0 ; j < empty.length; j ++ ) {
			empty[j] = emptyValue.charAt(0);
			emptyValuecontainer = new String(empty);
		}
		
		for (int k = 0; k < operationResult.length(); k++) {
			amountOfEruption[k] = eruption.charAt(0);
			eruptionValueContainer = new String(amountOfEruption);
		}
		System.out.println(" " + emptyValuecontainer + multiplier1);
		System.out.println("x ");
		System.out.println(" " + emptyValuecontainer + multiplier2);
		System.out.println(" " + eruptionValueContainer);
		
		for(int i = chars.length -1 ;i >=0;i--) {	
			int reverseValue = Character.getNumericValue(chars[i]);
			int result = multiplier1 * reverseValue;
			String resultToString = Integer.toString(result);
			String emptyConteinerSubstring = emptyValuecontainer.substring(0, i);
			
			if(resultToString.length() >= checkLength.length()) {
			System.out.println(" " + emptyConteinerSubstring + resultToString);
			
			}else System.out.println("  " + emptyConteinerSubstring + resultToString);
			
			checkLength = resultToString;
			
			if(i>0) {
				System.out.println("+");
			}else System.out.println(" " + eruptionValueContainer);
		}

		System.out.println(" " + multiResult);		
	}

}
