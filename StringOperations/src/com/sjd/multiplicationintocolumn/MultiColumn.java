package com.sjd.multiplicationintocolumn;

public class MultiColumn {

	private int multieplier1 ;
	private int multieplier2 ;
	
	
	
	public int getMultieplier1() {
		return multieplier1;
	}



	public void setMultieplier1(int multieplier1) {
		this.multieplier1 = multieplier1;
	}



	public int getMultieplier2() {
		return multieplier2;
	}



	public void setMultieplier2(int multieplier2) {
		this.multieplier2 = multieplier2;
	}



	public void multiplicationIntoColumn() {
		int multiResult = multieplier1*multieplier2;
		String operationResult = Integer.toString(multiResult);
		String emptyValuecontainer = null;
		String eruptionValueContainer = null;
		String emptyValue = " ";
        String eruption = "_";
		
		String num = Integer.toString(multieplier2);
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
		System.out.println(emptyValuecontainer + multieplier1);
		System.out.println("x ");
		System.out.println(emptyValuecontainer + multieplier2);
		System.out.println(" " + eruptionValueContainer);
		for(int i = chars.length -1 ;i >=0;i--) {	
			int reverseValue = Character.getNumericValue(chars[i]);
			int result = multieplier1 * reverseValue;
			String d = emptyValuecontainer.substring(0, i);
			System.out.println(" " + d + result);
			if(i>0) {
				System.out.println("+");
			}else System.out.println(" " + eruptionValueContainer);
		}
		
		System.out.println(" " + multieplier1*multieplier2);

	}

}
