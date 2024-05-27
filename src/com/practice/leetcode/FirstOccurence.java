package com.practice.leetcode;

public class FirstOccurence {

	public static void main(String[] args) {
		String haystack = "mississippi";
		String needle = "issipi";
		System.out.println(strStr(haystack, needle));

	}
	
public static int strStr(String haystack, String needle) {
	if(needle.length()>haystack.length())
		return -1;
	
	char f = needle.charAt(0);
	
	
	for (int i = 0; i < haystack.length(); i++) {
		if(haystack.charAt(i)==f) {
			if(i+needle.length()>haystack.length())
				return -1;
			String substr = haystack.substring(i, i+needle.length());
			if(substr.equals(needle))
				return i;
		}
	}
	
	
	return -1;
        
    }

}
