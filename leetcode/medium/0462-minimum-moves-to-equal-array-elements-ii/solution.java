class Solution {
    public int minMoves2(int[] nums) {
        int n= nums.length;
        int count =0;
        Arrays.sort(nums);
        int mid = nums[n/2];
        for(int i =0; i<nums.length ; i++){
            count += Math.abs(mid - nums[i]);
        }
        return count;
    }
}