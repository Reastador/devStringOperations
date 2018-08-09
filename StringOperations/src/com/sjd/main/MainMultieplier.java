package com.sjd.main;

public class MainMultieplier {

	public static void main(String[] args) {
		
		int multieplier1 = 111;
		int multieplier2 = 512;
		String emptyValuecontainer = null;
		String emptyValue = " ";
		
		String num = Integer.toString(multieplier2);
		char [] chars = num.toCharArray();
		char [] empty = num.toCharArray();
		for(int j = 0 ; j < empty.length; j ++ ) {
			empty[j] = emptyValue.charAt(0);
			emptyValuecontainer = new String(empty);
		}
		
		for(int i = chars.length -1 ;i >=0;i--) {	
			int reverseValue = Character.getNumericValue(chars[i]);
			int result = multieplier1 * reverseValue;
			String d = emptyValuecontainer.substring(0, i);
			System.out.println(" " + d + result);
			if(i>0) {
				System.out.println("+");
			}else System.out.println("------");
		}
		
		System.out.println(" " + multieplier1*multieplier2);

	}

}
