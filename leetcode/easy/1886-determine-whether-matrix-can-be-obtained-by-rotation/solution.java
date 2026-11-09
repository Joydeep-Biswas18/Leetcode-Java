class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int rotation = 0; rotation < 4; rotation++) {
            Boolean same = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] != target[i][j]) {
                        same = false;
                        break;
                    }
                }
                if (!same) {
                    break;
                }
            }
            if(same){
                return true;
            }
            else{
                Rotate_matrix(mat);
            }
        }
        return false;
    }

    public static void Rotate_matrix(int[][] nums){
        int n = nums.length;
        //Transposing
        for(int i =0; i<n; i++){
            for(int j =i+1; j<n ;j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
            for(int col =0;col<n/2 ;col++){
                for(int row =0; row< n ;row++){
                    int temp = nums[row][col] ;
                    nums[row][col] = nums[row][n-1-col];
                    nums[row][n-1-col] = temp;
                }
            }
    }
}