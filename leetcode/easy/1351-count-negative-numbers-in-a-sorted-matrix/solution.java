
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        //length of rows
        int m = grid.length;
        //length of col
        int n = grid[0].length;

        for (int i = 0; i < grid.length ; i++) {
            // that loop runs for every row one by one with checking every row element according to binary search
            int low = 0;
            int high = grid[0].length - 1;
            int firstnegative = n;
            //that is the very important line because if i find where the nwgative number is starting  so i can asily calculate the total number of negatives numbers
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (grid[i][mid] < 0) {
                    // store the first negative number where as i find
                    firstnegative = mid;
                    // trim out the right half
                    high = mid - 1;

                } else {
                    // trim out left half
                    low = mid + 1;
                }
            }
            // if i find negative number is 3rd position that means after that all numbers are also nagative 
            // so the count = total length of row - 3rd position
            count += n - firstnegative;
        }
        return count;

    }
}