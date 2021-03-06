package majority;
import java.util.HashMap;
public class MajorityElement{
	public static 
	int sum = 0;

	
	    public static int countCharacters(String[] words, String chars) {
	        HashMap<Character, Integer> map=new HashMap<Character, Integer>();
	        for(int i=0;i<chars.length();i++) 
	        {
	            if(map.containsKey(chars.charAt(i)))
	            {
	                map.put(chars.charAt(i), map.get(chars.charAt(i))+1); // add +1 to duplicate elements of chars
	            }
	            else
	            {
	                map.put(chars.charAt(i), 1); // assign 1 as value to new elements of chars
	            }
	        }
	        
	        for(int i=0;i<words.length;i++)
	        {
	        	
	            int len=0;
	            HashMap<Character, Integer> hashmap=new HashMap<Character, Integer>();
	            hashmap.putAll(map); // copy map into hashmap
	            for(int j=0;j<words[i].length();j++) // iterate through string array and reduce -1 to each value in chars
	            {
	                if(hashmap.containsKey(words[i].charAt(j))&&hashmap.get(words[i].charAt(j))>0)
	                {
	                    hashmap.put(words[i].charAt(j), hashmap.get(words[i].charAt(j))-1);
	                    len++;
	                }
	            }
	            if(len==words[i].length()) 
	            {
	                sum+=len;
	            }
	        }
	        return sum;
	    }
	
	

public static void main(String[] args)
{
	MajorityElement m = new MajorityElement();
	String[] words = { "cat","bt","hat","tree"};
   	String chars = "atach";
    countCharacters( words,  chars) ;
	@SuppressWarnings("static-access")
	int count = m.sum;
	System.out.println(count);


	}
}

