import java.util.Arrays;

/*
 * 
 * 75. Sort Colors
Solved
Medium
Topics
Companies
Hint
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 

Follow up: Could you come up with a one-pass algorithm using only constant extra space?
 */
public class Day15_LC75_SortColors {

	public static void main(String[] args) {

//		int[] arr = { 2, 0, 2, 1, 1, 0 };
		int[] arr = { 2, 0, 1,2,1,0,0,2, 1, 1, 0 };
//		int[] arr = { 2, 0, 2 };

		new Day15_LC75_SortColors().new Solution().sortColors(arr);
		System.out.println(Arrays.toString(arr));

	}

// Using three pointers	
	class Solution3 {
		public void sortColors(int[] nums) {
			int low = 0, mid = 0, high = nums.length - 1;

			while (mid < high) {
				if (nums[mid] == 0) {
					swap(nums, low, mid);
					low++;
					mid++;
				} else if (nums[mid] == 2) {
					swap(nums, mid, high);
					high--;
				} else {
					mid++;
				}
			}

		}

		public void swap(int[] nums, int l, int r) {
			int temp = nums[l];
			nums[l] = nums[r];
			nums[r] = temp;
		}

	}

// Using brute force approach
	class Solution2 {
		public void sortColors(int[] nums) {

			for (int i = 0; i < nums.length; i++) {

				for (int j = i + 1; j < nums.length; j++) {

					if (nums[i] > nums[j]) {
						int temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
					}
				}
			}
		}
	}

// Using Recursion	
	class Solution {
		public void sortColors(int[] nums) {
			sortHelper(nums, nums.length);

		}

		public void sortHelper(int[] nums, int n) {
			if (n == 1)
				return;

			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] > nums[i + 1]) {
					int tmp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = tmp;
				}
			}
			sortHelper(nums, n - 1);
		}
	}

}
