class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int count =0;
        int min_ele = nums[0];
        for ( int i =0; i<n ; i++){
            min_ele = Math.min(min_ele , nums[i]);
        }
        for(int num : nums){
            if(num>min_ele)
            count += (num - min_ele);
        } 
        // that is the main idea present behind this problem 
        // Here say that increase n-1 elemenets by 1 i can tell that dcrease 1 elemenet by 1 yjese are equivalent
        return count;
        
    }
    
}