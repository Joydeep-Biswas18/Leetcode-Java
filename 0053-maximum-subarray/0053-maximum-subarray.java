class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;

        int r = 0;
        int sum =0;
        
        while (r < nums.length) {
            sum += nums[r];

            max_sum = Math.max(sum, max_sum);

            if (sum < 0) {
                sum = 0;
            }
                r++;

        }
        return max_sum;

    }
}