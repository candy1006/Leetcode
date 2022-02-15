package RomanToInteger013;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerSolution {
	
	/**
     * Roman numbers are not dependent on the position of the attribute it simply add the value to the result.
     * Only for the case where current value is < next value it subtract the value.
     * 
     * Like to denote 30 : XXX meaning there are three tens
     * and in case of IV - If we convert it to numeric it will be 1 4 (position wise) now as we can see for position 0 (value is 1)
     * the value is less than position 1 (value is 5). So, we need to subtract the value.
     * So, it will be -1 + 5 = 4
     */
    public int romanToInt(String s) {
        // Mapping the values for the roman symbol
        Map<Character, Integer> symbolMapping = new HashMap<>();
        symbolMapping.put('I', 1);
        symbolMapping.put('V', 5);
        symbolMapping.put('X', 10);
        symbolMapping.put('L', 50);
        symbolMapping.put('C', 100);
        symbolMapping.put('D', 500);
        symbolMapping.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            /**
             * Checking whether the current psotion value is less than the next position value or not.
             */
            if ((i < s.length() - 1) && (symbolMapping.get(s.charAt(i)) < symbolMapping.get(s.charAt(i + 1)))) {
                result -= symbolMapping.get(s.charAt(i));
            } else {
                result += symbolMapping.get(s.charAt(i));
            }
        }
        return result;
    }

}
