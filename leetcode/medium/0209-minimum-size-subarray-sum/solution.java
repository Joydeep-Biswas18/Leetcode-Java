class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int min_length = Integer.MAX_VALUE;
        while (right < nums.length) {
            // that calculate the sum of the existing array nums
            sum += nums[right];
            //sum is greater than target or equal to target
            while( sum >= target){
                int length = right -left +1;
                min_length = Math.min(min_length , length);
                sum -= nums[left];
                left++;
            }
            //update the right side also
            right++;
        }
        return min_length == Integer.MAX_VALUE ? 0: min_length;
    }
}