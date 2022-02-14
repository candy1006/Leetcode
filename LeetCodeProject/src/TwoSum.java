import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSum 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> nums = new ArrayList<Integer>();
		String numStr = null, target = null;
        Scanner sc = new Scanner(System.in);
        String input;
        boolean flag = false;
        boolean flag1 = false;
        while (sc.hasNext())
        {
        	input = sc.next();
        	if(flag&&!flag1){
        		numStr = input;
        		flag = false;
        		flag1 = true;
        	}
        	if(flag&&flag1){
        		target = input;
        		flag = false;
        		flag1 = false;
        	}
        	if(input.equals("="))
        		flag = true;
        	
        	if(input.equals("break"))
        		break;
        	System.out.println("input: " + input);
		}
        System.out.println("numStr: " + numStr);
        System.out.println("target: " + target);
       
	}

}
