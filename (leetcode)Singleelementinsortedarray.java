class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res=0;
      HashMap<Integer, Integer> hm
            = new HashMap<>();
        
         
        for(int i =0 ; i <nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        
          for(int i =0 ; i <nums.length;i++)
          {
        
        if(hm.get(nums[i])==1)
        {
            res= nums[i];
        
           
        }
          }
            
            
    
         
   // hm.forEach((key, value) -> { System.out.println(key + " " + value); });
        
        return res;
}
}
