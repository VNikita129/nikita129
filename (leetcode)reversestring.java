class Solution {
    public boolean isPalindrome(String s) {
        String text =  s.replaceAll("[^a-zA-Z0-9]", "");
        
      
        String tex =  text.replaceAll("\\s", "");       
      
        String lower = tex.toLowerCase();
          System.out.println(lower);
                    
   String nstr ="";
                                    
        if(s=="")
       return true;
    for(int i =lower.length()-1; i>=0;i--)
    {
          nstr = nstr + lower.charAt(i);
                                        
    }
  System.out.println(nstr);
        if(lower.equals(nstr))
         return true;
        
          return false;
    }
    
    
                                  
