package com.sjd.multiplicationintocolumn;

public class MultiColumn2 {

	public String multiplicationIntoColumn(int multiplier1,int multiplier2) {
		int multiResult = multiplier1*multiplier2;
		String operationResult = Integer.toString(multiResult);
		String emptyValuecontainer = null;
		String eruptionValueContainer = null;
		String emptyValue = " ";
        String eruption = "_";
        String checkLength = "    ";
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
		String header =" " + emptyValuecontainer + String.format("%3d",multiplier1) + "\n" +
		"x " + "\n" +
		" " + emptyValuecontainer + String.format("%3d",multiplier2) + "\n" +
		" " + eruptionValueContainer;
		
		String mathProcess = "";
		
		for(int i = chars.length -1 ;i >=0;i--) {	
			int reverseValue = Character.getNumericValue(chars[i]);
			int result = multiplier1 * reverseValue;
			String resultToString = Integer.toString(result);
			String emptyConteinerSubstring = emptyValuecontainer.substring(0, i);
			
			if(resultToString.length() >= checkLength.length()) {
			mathProcess +=" " + emptyConteinerSubstring + resultToString + "\n";
			
			}else mathProcess +="  " + emptyConteinerSubstring + resultToString + "\n";
			
			checkLength = resultToString;
			
			if(i>0) {
			mathProcess +=	"+" + "\n";
			}else mathProcess +=" " + eruptionValueContainer;
			
		}

		String footer = " " + multiResult;		
		return header + "\n" + mathProcess + "\n" + footer;
	}
	
}
