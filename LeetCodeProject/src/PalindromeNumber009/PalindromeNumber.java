package PalindromeNumber009;

public class PalindromeNumber {
	
	public static void main(String[] args){
		
		boolean ans =isPalindrome(10);
		System.out.println(ans);
	}

   public static boolean isPalindrome(int x) {
	   
	   String palindrome = Integer.toString(x);
	   String palindromeReverse = "";
	   for(int i=0; i<palindrome.length(); i++){
		   palindromeReverse += palindrome.charAt(palindrome.length()-1-i);
	   }
	   if(palindrome.equals(palindromeReverse))
		   return true;
	   else
		   return false;

    }
}
