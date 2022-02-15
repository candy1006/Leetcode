package RomanToInteger013;

import java.util.HashMap;

public class RomanToInteger {
	
	
	public static void main(String[] args){
		
		int ans =romanToInt("MCMXCIV");
		System.out.println(ans);
	}
	
	public static int romanToInt(String s) {
        
		HashMap<Character,Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int ans =0;
		for(int i=0; i<s.length(); i++) {
			
			//System.out.println(i);	
			if(i != s.length()-1) {
				
				if((s.charAt(i+1) == 'V')&&(s.charAt(i) == 'I')) {
					ans += 4;
					i++;
				}	
				else if((s.charAt(i+1) == 'X')&&(s.charAt(i) == 'I')) {
					ans += 9;
					i++;
				}
				else if((s.charAt(i+1) == 'L')&&(s.charAt(i) == 'X')) {
					ans += 40;
					i++;
				}
				else if((s.charAt(i+1) == 'C')&&(s.charAt(i) == 'X')) {
					ans += 90;
					i++;
				}
				else if((s.charAt(i+1) == 'D')&&(s.charAt(i) == 'C')) {
					ans += 400;
					i++;
				}
				else if((s.charAt(i+1) == 'M')&&(s.charAt(i) == 'C')) {
					ans += 900;
					i++;
				}
				else
					ans += map.get(s.charAt(i));		
				
			}
			else {
				ans += map.get(s.charAt(i));
			}
			
			//System.out.println(i);	
				
			
		}
		
		return ans;
    }

}
