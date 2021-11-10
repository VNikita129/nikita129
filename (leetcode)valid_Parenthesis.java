class Solution 
{
    public boolean isValid(String s) 
    {
        int i ;
        char parentheses ;
        
        if(s.length()%2 != 0)
            return false;
        Stack<Character> st = new Stack<>() ;        
        for( i = 0 ; i < s.length() ; i++ )
        { 
            parentheses = s.charAt(i) ;
            if( parentheses == '(' || parentheses == '[' || parentheses == '{' )
            {
                st.push(parentheses) ;    
            }
            else if( st.empty() )
            {
                return false ;
            }
            else if( parentheses == ')' && st.pop() != '(' )
            {
                return false ;
            }
            else if( parentheses == ']' && st.pop() != '[' )
            {
                return false ;
            }
            else if( parentheses == '}' && st.pop() != '{' )
            {
                return false ;
            }
        }
        return  st.empty() ;
    }
}
