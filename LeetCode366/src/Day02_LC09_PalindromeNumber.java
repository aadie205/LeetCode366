import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.IntStream;

/* 
9. Palindrome Number
Easy
11.8K
2.7K
Companies
Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?
 */
public class Day02_LC09_PalindromeNumber {

	public static void main(String[] args) {
		
//		int x=121;
//		int x=-121;
		int x=10;
		
		
//		System.out.println(new Day02_LC09_PalindromeNumber().new Solution().isPalindrome(x));
//		System.out.println(new Day02_LC09_PalindromeNumber().new Solution2().isPalindrome(x));
		System.out.println(new Day02_LC09_PalindromeNumber().new Solution2().isPalindrome(x));
	}
	

// Using Dequeue
	class Solution3{
		public boolean isPalindrome(int x) {
			String str = String.valueOf(x);
			Deque<Character> deque= new ArrayDeque<Character>();
			
			for(char c: str.toCharArray())
				deque.add(c);
			
			while(deque.size()>1) {
				if(deque.removeFirst() != deque.removeLast())
					return false;
			}
			return true;
		}
	}
	
	
// Iterative method without converting to string	
	class Solution2 {
	    public boolean isPalindrome(int x) {
	        
	    	if(x<0) return false;
	    	int n=x;
	    	int res=0;
	    	
	    	while(n>0) {
	    		res = (res* 10) + n%10;
	    		n /=10;
	    	}
	    	if(res==x) return true;
	    	return false;	        
	    }
	}
	
// Using Stream API	
	class Solution {
	    public boolean isPalindrome(int x) {
	        
	        String str= String.valueOf(x);
	        
	        return IntStream.rangeClosed(0,  str.length()/2)
	        		.allMatch(i -> str.charAt(i)==str.charAt(str.length()-1-i));
	    }
	}
}
