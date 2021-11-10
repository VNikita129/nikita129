class Solution {
 public  boolean containsDuplicate(int[] nums) {
     String k = null;
HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

    for( int i = 0; i< nums.length;i++)
	        {
	            hm.put(nums[i],(hm.getOrDefault(nums[i],0))+1);
	            
	            
	        
	        }
	        
	        System.out.println(hm);
	        
	        for(int i =0;i<nums.length;i++)
	        {
	        if(hm.get(nums[i])>1)
	           return true;
	    
	        }
	       
	      	return false;  
	       
	    }
}


    
