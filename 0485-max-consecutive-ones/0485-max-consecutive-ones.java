class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_one =0;
        int count =0;

        //outer loop
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max_one = Math.max(count, max_one);

            }
            else{
                count =0;
            }

        }
        return max_one;
    }
    }
