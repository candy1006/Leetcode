import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSum 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
        {
			ArrayList<Integer> nums = new ArrayList<Integer>();
			Integer target = null;
			String numStr = null, targetStr = null;
	        
	        String input;
	        boolean flag = false;
	        boolean flag1 = false;
	        input = sc.nextLine();
	        String[] tokens = input.split(" ");
	        for(String token:tokens)
	        {
	      
	        	if(flag&&!flag1){
	        		numStr = token;
	        		flag = false;
	        		flag1 = true;
	        	}
	        	if(flag&&flag1){
	        		targetStr = token;
	        		flag = false;
	        		flag1 = false;
	        	}
	        	if(token.equals("="))
	        		flag = true;
	        	//System.out.println("input: " + input);
			}
	        numStr = numStr.replaceAll("\\[", "");
	        numStr = numStr.replaceAll("\\]", "");
	        String[] tokens1 = numStr.split(",");
	        for (String token:tokens1) {
	        	nums.add(Integer.parseInt(token));
	           //System.out.println(token);
	        }
	        target = Integer.parseInt(targetStr);
	        
	        Integer indexFirst = null , indexSecond=null;
	        for(int i=0 ; i<nums.size() ; i++)
	        {
	        	for(int j=i+1 ; j<nums.size() ; j++)
	            {
	            	if((nums.get(i)+nums.get(j)==target))
	            	{
	            		indexFirst = i;
	            		indexSecond = j;
	            	}
	            }
	        }
	        
//	        System.out.println("numStr: " + numStr);
//	        System.out.println("targetStr: " + targetStr);
//	        System.out.println("nums: " + nums.toString());
//	        System.out.println("target: " + target);
//	        System.out.println("indexFirst: " + indexFirst);
//	        System.out.println("indexSecond: " + indexSecond);
	        System.out.println("[" + indexFirst + "," + indexSecond +"]");
        }
	}

}
