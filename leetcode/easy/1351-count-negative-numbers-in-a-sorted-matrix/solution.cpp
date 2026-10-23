class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int count = 0;
        int m = grid.size();
        int n = grid[0].size();
        for (int row = 0; row < m; row++) {
            int firstNeg = n;
            int low = 0;
            int high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (grid[row][mid] < 0) {
                    firstNeg = mid;
                    high = mid - 1;

                } else {
                    low = mid + 1;
                }
            }
            count += n - firstNeg;
        }
        return count;
    }
};