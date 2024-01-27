public class Day01_LC07_ReverseInteger {

	public static void main(String[] args) {

//		int x= 321;
//		int x = -321;
//		int x= 120;
//		int x= 109000;
		int x = 1534236469;
//		int x=2147483647;

		System.out.println(new Day01_LC07_ReverseInteger().new Solution().reverse(x));
	}

	class Solution {
		public int reverse(int x) {
			int n = x;
			long result = 0;

			while (n != 0) {
				int r = n % 10;
				long newResult = result * 10 + r;

				// Check for overflow before updating result
				if ((newResult - r) / 10 != result) {
					return 0;
				}

				result = newResult;
				n /= 10;
			}

			// Check for overflow after the loop
			if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
				return 0;
			}
			return (int) result;
		}
	}

}
