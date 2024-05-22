package com.practice.leetcode;

public class GCDOfStrings {

	public static void main(String[] args) {
		System.out.println(gcdOfStrings("ABABAB","ABAB"));

	}
	
	public static String gcdOfStrings(String str1, String str2) {
        if((str1+str2).equals(str2+str1)){
            int index=gcd(str1.length(),str2.length());
            return str1.substring(0,index);
        }
        return "";
    }

	private static int gcd(int n, int m) {
		while(m!=0) {
			int temp = m;
			m = n%m;
			n= temp;
		}
		
		return n;
	}

}
