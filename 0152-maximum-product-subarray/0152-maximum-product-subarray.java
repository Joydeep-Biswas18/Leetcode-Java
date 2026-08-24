class Solution {
    public int maxProduct(int[] nums) {
        //Brute Force 
        int max_prod = Integer.MIN_VALUE;
        int start_index  =0;
        int endIndex =0;
        for(int i =0; i<nums.length;i++){
            int product=1;
            for(int j =i; j<nums.length;j++){
                product =product * nums[j];
                max_prod = Integer.max(max_prod, product);
                // start_index =i;
                // endIndex = j-i+1;


            }
        }
        return max_prod;


    }
    
}