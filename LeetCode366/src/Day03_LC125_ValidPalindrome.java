import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day03_LC125_ValidPalindrome {

	public static void main(String[] args) {
		
//		String str = "A man, a plan, a canal: Panama";
//		String str="race a car";
		String str = " ";
		
		System.out.println(new Day03_LC125_ValidPalindrome().new Solution().isPalindrome(str));;
		System.out.println(new Day03_LC125_ValidPalindrome().new Solution2().isPalindrome(str));;

	}
	
	class Solution2{
		public boolean isPalindrome(String s) {
			String str= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
			
			if(str.length()==0) return true;
			
			return IntStream.rangeClosed(0, str.length()/2).allMatch(i -> str.charAt(i)==str.charAt(str.length()-1-i));

		}
	}
	
	class Solution{
		public boolean isPalindrome(String s) {
		       // if(s.length()==1)
		       //     return true;
		        
		        s=s.toLowerCase();
		        s=s.replaceAll("[^a-z0-9]","");
		        
		        // if(s.length()==1 && s.charAt(0)!=' ')
		        //     return false;
		        
		        int i=0;
		        int j=s.length()-1;
		        
		        while(i<j){
		            if(s.charAt(i)!=s.charAt(j))
		                return false;
		            i++;
		            j--;
		        }
		        return true;
		    }
	}
}
