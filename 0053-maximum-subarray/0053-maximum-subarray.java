class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        int i = 0;
        while (i < nums.length) {
            sum += nums[i];

            max_sum = Math.max(max_sum, sum);
            if (sum < 0) {
                sum = 0;
            }

            i++;
        }

        return max_sum;

    }
}