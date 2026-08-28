class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;

        while (right < n) {

            if (left < 2 || nums[right] != nums[left - 2]) {
                nums[left] = nums[right];
                left++;
            }

            right++;
        }

        return left;
    }
}