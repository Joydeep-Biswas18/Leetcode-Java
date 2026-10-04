class Solution {
public:
    int splitArray(vector<int>& nums, int k) {
        int low = 0;
        int high = 0;
        for (int num : nums) {
            low = max(low, num);
            high += num;
        }
        int answer = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (valid_split(nums, k, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return answer;
    }
    bool valid_split(vector<int>& nums, int k, int max_valid) {
        int curr_sum = 0;
        int No_subarray = 1;
        for (int num : nums) {
            if (curr_sum + num > max_valid) {
                No_subarray++;
                curr_sum = num;
                if (No_subarray > k) {
                    return false;
                }

            } else {
                curr_sum += num;
            }
        }
        return No_subarray <= k;
    }
};