class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int Min_len = Integer.MAX_VALUE;
        int sum = 0;

        while (r < n) {
            sum += nums[r];
            while (sum >= target) {
                Min_len = Math.min(r - l + 1, Min_len);
                sum -= nums[l];
                l++;
            }
            r++;

        }
        return Min_len == Integer.MAX_VALUE ? 0 : Min_len;
    }
}