class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int left = 0;
        int right = matrix.length*matrix[0].length -1;
        
     while(left <= right)
                {
                int midpoint = left + (right-left)/2;
         
                   int r = midpoint/matrix[0].length;
         int c = midpoint%matrix[0].length;
                if (matrix[r][c]==target)
                    return true;
                else if (target > matrix[r][c])
                        left = midpoint+1;
                    
                    else if ( target < matrix[r][c])
                        right = midpoint-1;
                }
                    
  
        return false;
    }
}
