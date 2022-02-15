import java.util.HashMap;

public class TwoSumSolution {
	
	public static void main(String[] args) 
	{
		int[] numbers = {2,7,11,15};
		int[] ans = twoSum(numbers, 9);
		for(int tmp: ans)
		{
			System.out.println(tmp);
		}
		
	}

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
