class Solution {
    public void moveZeroes(int[] nums) {

        int [] arr1 = new int[nums.length];
	          
	        int inspos = 0;
	        
	        for(int i = 0; i <nums.length;i++)
	        {	 
	        if(nums[i]!= 0)
	        {
	            nums[inspos++] = nums[i];
	            
	  
	        }
	        }
	        for(int i = inspos; i <nums.length;i++)
	        {	 
	           nums[i]=0;
	        }  
	    
	    }
