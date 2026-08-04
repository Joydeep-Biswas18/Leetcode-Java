class Solution {
    public int longestOnes(int[] nums, int k) {
        int l =0; 
        int r =0;
        int max_length =0;
        int zeroes =0;

        while(r<nums.length){
            if(nums[r]==0){
                zeroes++;
            }
            if(zeroes>k){
                if(nums[l]==0){
                    zeroes--;
                }
                l=l+1;
            }
            if(zeroes <=k){
                int length = (r-l+1);
                max_length = Math.max(length , max_length);
            }

            r++;
        }
        return max_length;
    }
}