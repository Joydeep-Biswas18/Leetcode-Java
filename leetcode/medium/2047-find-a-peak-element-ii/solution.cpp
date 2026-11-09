class Solution {
public:
    vector<int> findPeakGrid(vector<vector<int>>& mat) {
        int m = mat.size();
        int n = mat[0].size();
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = max_ele_index(mat, mid);
            int left = mid-1 >= 0 ? mat[row][mid - 1] : -1;
            int right = mid+1 < n ? mat[row][mid + 1] : -1;
            if (mat[row][mid] > left && mat[row][mid] > right) {
                return {row, mid};
            } else if (mat[row][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return {-1, -1};
    }
    public:
    int max_ele_index(vector<vector<int>>& nums, int col) {
        int max = nums[0][col];
        int max_index = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i][col] > max) {
                max = nums[i][col];
                max_index = i;
            }
        }
        return max_index;
    }
};