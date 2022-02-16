package LongestCommonPrefix014;



public class LongestCommonPrefixSolution {

	public static void main(String[] args) {
		
		String[] strs = {"flower","flow","flowht"};
		System.out.println("flower".indexOf("flow"));
		
		String ans = longestCommonPrefix1(strs);
		System.out.println(ans);
	}	
	
	/*
	 * 1.Horizontal scanning 
	 * Time complexity : O(S) , where S is the sum of all characters in all strings.
	 * Space complexity : O(1). We only used constant extra space.
	*/
	 public static String longestCommonPrefix1(String[] strs) {
		    if (strs.length == 0) return "";
		    String prefix = strs[0];
		    for (int i = 1; i < strs.length; i++) {
		        while (strs[i].indexOf(prefix) != 0) {
		            prefix = prefix.substring(0, prefix.length() - 1);
		            if (prefix.isEmpty()) return "";
		        }       
	 		}
		    return prefix;
		}
	 
	 /*
	  * 2.Vertical scanning
	 * Time complexity : O(S) , where S is the sum of all characters in all strings.
	 * Space complexity : O(1). We only used constant extra space.
	  */
	 public String longestCommonPrefix2(String[] strs) {
		    if (strs == null || strs.length == 0) return "";
		    for (int i = 0; i < strs[0].length() ; i++){
		        char c = strs[0].charAt(i);
		        for (int j = 1; j < strs.length; j ++) {
		            if (i == strs[j].length() || strs[j].charAt(i) != c)
		                return strs[0].substring(0, i);             
		        }
		    }
		    return strs[0];
		}
	 
	 
	
}
