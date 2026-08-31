class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int TotalSum = 0;

        for (int num : nums) {
            TotalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = TotalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;

    }
}