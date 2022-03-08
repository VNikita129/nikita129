import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.Map;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static String isValid(String s) {
   
    Map <Character,Integer> mp = new HashMap<Character, Integer>();
    
    for(int i =0; i < s.length(); i++)
    {
         mp.put(s.charAt(i),(mp.getOrDefault(s.charAt(i),0))+1);
    }
int [] arr= new int[mp.size()];
int idx=0;
for (Map.Entry<Character, Integer> characterIntegerEntry : mp.entrySet()) {
      arr[idx++] = characterIntegerEntry.getValue();
    }

Arrays.sort(arr);

int first = arr[0];
int second = arr[1];
int last= arr[arr.length-1];
int lastsecond = arr[arr.length-2];

if(first == last)
return "Yes";

if (first == 1 && second == last) return "YES";

    // If all are same and last character has just 1 extra count
    if (first == second && second == lastsecond && lastsecond == (last - 1)) return "YES";

    // Else invalid string
    return "NO";

}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
