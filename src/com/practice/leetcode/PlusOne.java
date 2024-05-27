package com.practice.leetcode;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = {1,2,9};
		System.out.println(Arrays.toString(digits));
		System.out.println(Arrays.toString(plusOne(digits)));

	}
	public static int[] plusOne(int[] digits) {
		
		for (int i = digits.length-1; i >=0 ; i--) {
			digits[i]++;
			
			if(digits[i]<10) {
				return digits;
			}
			
			digits[i]=0;
		}
		int[] newDigits = new int[digits.length+1];
		newDigits[0]=1;
		return newDigits;
    }

}
