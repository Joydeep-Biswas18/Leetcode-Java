class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        //Initialize tataol Sum as 0
        int total_sum = 0;
        for(int i =0; i<n;i++){
            //Calculate total sum of all Elements in array 
            total_sum +=cardPoints[i];
        }
        int Sum_min_subarray = Min_sum(cardPoints, k);

        //Now substrack Sum of (n-k) size of subarray from total sum 
        return total_sum - Sum_min_subarray;

    }
    //Find out the minimum Sum Subarray with N-k length
    public static int Min_sum (int []nums , int k){
        int n = nums.length;
        int Min_sum = Integer.MAX_VALUE;
        int sum =0;
        int l =0;
        int r =0;
        while(r<nums.length){
            sum+=nums[r];
            if((r-l+1)> (n-k)){
                sum -=nums[l];
                l++;
        
            }
            // Check only windows of exactly n-k elements
            if ((r - l + 1) == (n-k)) {
                Min_sum = Math.min(Min_sum, sum);
            }
            r++;
        }

        
        return Min_sum;
    }

}