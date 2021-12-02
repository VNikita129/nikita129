class Solution {
   public int lengthOfLastWord(String s) {
        s = s.trim();
        char[] array = s.toCharArray();
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == ' ')
                break;
            else count++;
        }
        return count;
    
    }
}
