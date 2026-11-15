class Solution {
    public int countConsistent(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int minValue = nums[i];
            int AndValue = nums[i];
            for (int j = i; j < nums.length; j++) {
                AndValue &= nums[j];
                minValue = Math.min(minValue, nums[j]);

                if (minValue == AndValue) {
                    count++;
                }
            }

        }
        return count;
    }
}