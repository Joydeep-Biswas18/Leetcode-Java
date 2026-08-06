class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        // int y = subarray(nums ,k);
        // int x = subarray(nums ,k-1);

        return subarray(nums,k) - subarray(nums ,k-1);
    }
    public static int subarray(int[]nums,int k){
        // nums = convert(nums);
        int l=0; 
        int r=0;
        int count_subarray =0;
        int count_ones =0;
        //sliding Window and two pointer
        if(k<0){
            return 0;
        }
        while(r<nums.length){
            count_ones += nums[r] & 1;
            while(count_ones > k){
                count_ones -= nums[l] & 1;
                l++;
            }
            count_subarray = count_subarray+(r-l+1);
            r++;
        }
        return count_subarray;
        
    }

    

    // static int[] convert(int [] nums){
    //     for( int i =0; i<nums.length; i++){
    //         if(nums[i]%2==0){
    //             nums[i]=0;
    //         }
    //         else{
    //             nums[i]=1;
    //         }
    //     }

    //     return nums;
    // }
}
