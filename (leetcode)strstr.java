class Solution {
    public int strStr(String haystack, String needle) {
        char [] ch = haystack.toCharArray();
        char [] ch1 = needle.toCharArray();
         
       
    
       if (needle.length() == 0  )
            return 0;
        if( haystack.length() < needle.length())
            return -1;
            
       
        
         int threshold = haystack.length() - needle.length();
        
        for(int i =0 ; i <= threshold;i++)
        {
            if(haystack.substring(i,i+needle.length()).equals(needle))
                return i;
        }
        
       return -1;
    }
}
