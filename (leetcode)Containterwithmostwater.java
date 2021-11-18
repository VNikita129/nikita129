class Solution {
    public int maxArea(int[] height) {
        int max =0;
   int a_pointer = 0;
        int b_pointer =height.length-1;   
        while(a_pointer < b_pointer)
        {
            if(height[a_pointer] < height[ b_pointer])
            {
                max = Math.max(max, height[a_pointer] * (b_pointer-a_pointer));
                a_pointer +=1;
            }          
            else
            {
                max = Math.max(max, height[b_pointer] * (a_pointer-b_pointer));
                b_pointer -=1;
            }   
        }   
        return max;
    }
}
