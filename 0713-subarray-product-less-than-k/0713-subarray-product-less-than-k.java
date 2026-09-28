class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int count = 0;
        int product = 1;
        if(k<=1) return 0;
        while (r < n) {
            product = product * nums[r];
            while (product >= k) {
                product = product / nums[l];
                l++;
            }
            count += (r - l + 1);
            r++;
        }
        return count;
    }
}