class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
    int [][] arr = new int[r][c];
        
 
int rows = mat.length;
int columns = mat[0].length;
        if(rows*columns != r*c)
            return mat;
        

        int row_arr =0;
        int col_arr =0;
        
        for(int i = 0; i<rows; i++)
        {
            for(int j =0; j<columns;j++)
            {
                arr[row_arr][col_arr] = mat[i][j];
                col_arr++;
                if (col_arr == c)
                {
                    col_arr =0;
                    row_arr++;
                }
                
            }
        }
        
        return arr;
    }
}
        
