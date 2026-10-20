class Solution {
    public int findMin(int[] nums) {
        int lowest = Integer.MAX_VALUE;
        for (int num : nums) {
            lowest = Math.min(num, lowest);

        }
        return lowest;
    }
}