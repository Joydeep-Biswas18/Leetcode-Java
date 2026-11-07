class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = 0;
        for (int num : nums) {
            high = Math.max(high, num);
        }
        int sum_divisor = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(nums, mid, threshold)) {
                sum_divisor = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return sum_divisor;
    }

    public static boolean isPossible(int[] nums, int max_valid, int threshold) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (int) (Math.ceil((double) nums[i] / max_valid));

        }
        return sum <= threshold;
    }
}