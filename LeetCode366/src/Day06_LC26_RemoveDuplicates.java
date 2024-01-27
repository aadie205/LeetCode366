/*
 * 26. Remove Duplicates from Sorted Array
Solved
Easy
Topics
Companies
Hint
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */
public class Day06_LC26_RemoveDuplicates {

	public static void main(String[] args) {
		
		System.out.println(new Day06_LC26_RemoveDuplicates().new Solution().removeDuplicates(new int[]{1,1,2}));;
		System.out.println(new Day06_LC26_RemoveDuplicates().new Solution().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));;
	}
	class Solution {
	    public int removeDuplicates(int[] nums) {
	        if(nums.length <2)
	            return nums.length;
	        
	        int i=0, j=1;
	        
	        while(j<nums.length){
	            if(nums[i]!=nums[j]){
	                i++;
	                nums[i]=nums[j];
	            }
	            j++;
	        }
	        return i+1;
	    }
	}
}
