class Solution {
    public int longestOnes(int[] nums, int k) {

        int l = 0;
        int r = 0;
        int zero = 0;
        int max_length = 0;

        while (r < nums.length) {
            if (nums[r] == 0) {
                zero++;
            }
            if (zero > k) {
                if (nums[l] == 0) {
                    zero--;
                }
                l++;

            }
            if (zero <= k) {
                int length = r - l + 1;
                max_length = Math.max(length , max_length);
            }
            r++;
        }
        return max_length;
    }
}