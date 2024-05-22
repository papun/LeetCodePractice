package com.practice.leetcode;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		removeDuplicates(new int[] { 1, 1, 2 });
	}

	public static int removeDuplicates(int[] nums) {
		Set<Integer> set = new LinkedHashSet<>();
		for (int element : nums) {
			set.add(element);
		}
		int i = 0;
		for (int num : set) {
			nums[i++] = num;
		}
		return set.size();

	}

}
