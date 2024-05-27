package com.practice.leetcode;

public class LastWordLength {

	public static void main(String[] args) {
		String s = "Hello World lol";
		System.out.println(lengthOfLastWord(s));

	}
	public static int lengthOfLastWord(String s) {
//		String[] subStrs = s.split(" ");
//		return subStrs[subStrs.length-1].length();
		return s.substring(s.lastIndexOf(" "), s.length()-1).length();
		
        
    }

}
