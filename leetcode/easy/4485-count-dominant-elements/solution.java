class Solution {
    public int countDominantElements(int[] nums) {
        int n = nums.length;
        int count = 0;
        if (n == 1) {
            return 1;
        }
        if (nums[0] >= nums[1]) {
            count++;
        }
        if (nums[n - 1] >= nums[n - 2]) {
            count++;
        }

        for (int i = 1; i < n - 1; i++) {
            if (2 * nums[i] >= (nums[i + 1] + nums[i - 1])) {
                count++;
            }
        }
        return count;
    }
}