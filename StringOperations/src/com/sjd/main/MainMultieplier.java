package com.sjd.main;

public class MainMultieplier {

	public static void main(String[] args) {
		
		int a = 111;
		int b = 512;
		String s = null;
		String c = " ";
		
		String num = Integer.toString(b);
		char [] chars = num.toCharArray();
		char [] empty = num.toCharArray();
		for(int j = 0 ; j < empty.length; j ++ ) {
			empty[j] = c.charAt(0);
			s = new String(empty);
		}
		
		for(int i = chars.length -1 ;i >=0;i--) {	
			int num1 = Character.getNumericValue(chars[i]);
			int result = a * num1;
			String d = s.substring(0, i);
			System.out.println(" " + d + result);
			if(i>0) {
				System.out.println("+");
			}else System.out.println("------");
		}
		
		System.out.println(" " + a*b);

	}

}
