class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int missing =0;
        int n = grid.length;
        int Repeated =0;
        
        for(int i=1; i<=n*n;i++){
            int count =0;
            for(int row=0;row<n;row++){
                for(int col =0; col<n; col++){

                if(grid[row][col]==i){
                    count ++;
                }
                }

            }
            if(count ==2){
                Repeated= i;
            }
            else if(count ==0){
                missing =i;
            }
        }

        return new int []{Repeated,missing};
        
    }
}