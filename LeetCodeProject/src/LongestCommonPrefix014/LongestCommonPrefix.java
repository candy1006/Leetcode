package LongestCommonPrefix014;

public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		
		String[] strs = {"flower","flow","flowht"};
		String ans = longestCommonPrefix(strs);
		System.out.println(ans);
	}

	public static String longestCommonPrefix(String[] strs) {
		
		//System.out.println(strs.length);
		String ans = "";
		
		for(int i=0; i<strs[0].length(); i++) {
			boolean flag = false;
			for(int j=1; j<strs.length; j++) {
				
				if(i>=strs[j].length()) {
					flag = true;
					break;
				}
				
				if(strs[0].charAt(i) != strs[j].charAt(i)) {
					if(i==0)
						return "";
					else
						flag = true;
				}
			}
			if(flag)
				break;
			else
				ans += strs[0].charAt(i);
				
		}
		
        return ans;
    }	
	
}
