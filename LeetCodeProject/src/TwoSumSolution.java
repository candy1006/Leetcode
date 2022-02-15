import java.util.HashMap;

//001
public class TwoSumSolution {
	
	public static void main(String[] args) 
	{
		int[] numbers = {3,2,4};
		int[] ans = twoSum(numbers, 5);
		for(int tmp: ans)
		{
			System.out.println(tmp);
		}
		
	}

	//此方法為O(n) 將差值存在HashMap中 因此只要sort一遍就可以得到答案
	
	 public static int[] twoSum(int[] numbers, int target) {
	        
	        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
	        for(int i = 0; i < numbers.length; i++){

	            Integer diff = (Integer)(target - numbers[i]);
	            
//	            System.out.println("numbers: " + numbers[i]);
//	            System.out.println("diff: " + diff);
//	            System.out.println("i: " +  i);
	            
	            if(hash.containsKey(diff)){
	               // int toReturn[] = {hash.get(diff)+1, i+1};
	            	int toReturn[] = {hash.get(diff), i};
	                //System.out.println(" hash.get(diff): " + hash.get(diff));
	                return toReturn;
	            }

	            hash.put(numbers[i], i);

	        }
	        
	        return null;
	        
	    }
	
}
