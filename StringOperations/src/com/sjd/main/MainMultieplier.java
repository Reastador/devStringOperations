package com.sjd.main;

import com.sjd.multiplicationintocolumn.MultiColumn2;
import com.sjd.multiplicationintocolumn.MultiColumn;

public class MainMultieplier {

	public static void main(String[] args) {
		
		MultiColumn operation = new MultiColumn();		
		MultiColumn2 operation2 = new MultiColumn2();
		
		operation.multiplicationIntoColumn(513,415);
		System.out.println(" ");
		
		String result = operation2.multiplicationIntoColumn(51312, 41533);
		System.out.println(result);
	}

}
