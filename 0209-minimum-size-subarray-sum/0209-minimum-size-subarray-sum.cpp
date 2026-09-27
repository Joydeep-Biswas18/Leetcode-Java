class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int n = nums.size();
        int l =0;
        int r =0;
        int min_len = INT_MAX;
        int sum =0;
        while(r<n){
            sum+=nums[r];
            while(sum>= target){
                min_len = min(r-l+1 , min_len);
                sum -= nums[l];
                l++;
            }
            r++;
        }
        return min_len == INT_MAX ? 0:min_len;
    }
};