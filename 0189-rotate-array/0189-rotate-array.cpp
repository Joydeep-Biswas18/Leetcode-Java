class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        k = k % n;

        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }
    void reverse(vector<int>& nums, int low, int high) {
        while (low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            // update the low and high pointer
            low++;
            high--;
        }
    }
};