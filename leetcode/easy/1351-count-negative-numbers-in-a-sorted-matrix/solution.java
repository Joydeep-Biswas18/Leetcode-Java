class Solution {
    public int countNegatives(int[][] grid) {
        int count =0;
        int m = grid.length;
        int n = grid[0].length;
        int row =0;
        int col = n-1;

        while(row < m && col>=0){
            if(grid[row][col]<0){
                count += m - row;
                col--;
            }
            else{
                row++;
            }
        }
        return count;
       
    }

}
// class Solution {
//     public int countNegatives(int[][] grid) {
//         int count =0;
//         for(int i =0;i<grid.length -1; i++){
//             int low =0;
//             int high = grid[0].length-1;
//             while(low<= high){
//                 int mid =  low +(high -low)/2;
//                 if(grid[i][low]>grid[i][mid] && grid[i][mid]<0){
//                     if(grid[i][mid]<0){
                        
//                     }

//                 }
//                 else if (grid[i][mid]>grid[i][high] && grid[i][high] <0){
//                     if()
//                 }
//             }
//         }
        
//     }
// }