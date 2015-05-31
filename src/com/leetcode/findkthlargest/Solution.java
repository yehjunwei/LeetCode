package com.leetcode.findkthlargest;

public class Solution {
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }
    
    public int partition(int[] nums, int p, int r) {
        if(p == r)
            return p;
            
        // initial state:
        int pivot = nums[p];
        int i = p+1;
        int j = r;
        
        while(true) {
            while(i <= r && nums[i] < pivot)
                i++;
            while(j > p+1 && nums[j] >= pivot)
                j--;
            if(i >= j)
                break;
            swap(nums, i, j);
        }
        if(p != i-1)
            swap(nums, p, i-1);
        
        return i-1;
    }
    
    public int findKthLargest(int[] nums, int p, int r, int k) {
        int i = partition(nums, p, r);
        if(i == nums.length - k) {
        	// k is i
            return nums[i];
        } else if(i > nums.length - k) {
        	// k is in left side
            return findKthLargest(nums, p, i-1, k);
        } else {
        	// k is in right side
            return findKthLargest(nums, i+1, r, k);
        }
    }
    
    public int findKthLargest(int[] nums, int k) {
        return findKthLargest(nums, 0, nums.length-1, k);
    }
    
}