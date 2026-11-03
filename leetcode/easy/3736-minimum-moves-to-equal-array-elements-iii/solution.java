class Solution {
    public int minMoves(int[] nums) {
        //i only do increase the elements nums[i] by only 1 not decrease so i need to find the highest eleement at first
        int max = nums[0];
        for(int num : nums){
            max = Math.max(max , num);
        }
        int count =0;
        for(int i =0; i<nums.length ; i++){
            count +=(max- nums[i]);
        }
        return count;
    }
}