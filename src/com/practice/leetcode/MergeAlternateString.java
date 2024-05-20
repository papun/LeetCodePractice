package com.practice.leetcode;

public class MergeAlternateString {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "pq";
		
		//Output : apbqcd
		
		
		System.out.println(mergeAlternate(str1, str2));

	}
	
	public static String mergeAlternate(String str1,String str2) {
		StringBuilder mergedStr = new StringBuilder();
		
		for(int i = 0;i<str1.length()||i<str2.length(); i++){
			if(i<str1.length())
				mergedStr = mergedStr.append(str1.charAt(i));
			if(i<str2.length())
				mergedStr = mergedStr.append(str2.charAt(i));
			
		}
		
		return mergedStr.toString();
		
	}

}
