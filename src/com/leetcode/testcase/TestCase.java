package com.leetcode.testcase;

import com.leetcode.findkthlargest.*;

public class TestCase {
	public static void main(String[] args) {

		// Reverse Words 
		Solution s = new Solution();
//		System.out.println(s.reverseWords(" 1"));
		
		// Find Kth Largest Element
		int[] nums = {3, 3, 3, 3, 3, 3, 3, 3, 3};
		int k = 8;
		
		//int[] nums = {2, 1};
		//int k = 2;
		System.out.println(s.findKthLargest(nums, k));
	}
}
