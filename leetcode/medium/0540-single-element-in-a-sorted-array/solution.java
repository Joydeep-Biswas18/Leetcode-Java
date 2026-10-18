class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Make mid even so we can compare a pair
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                // Pair is correct; single element is on the right
                low = mid + 2;
            } else {
                // Pair is broken; single element is at mid or left
                high = mid;
            }
        }

        return nums[low];
    }

}