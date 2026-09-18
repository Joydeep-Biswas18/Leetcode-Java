class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result= new int[n];
        Arrays.fill(result, -1);
        for(int i =0; i<n;i++){
            for(int j =i+1;j<i+n; j++){
                int ind = j%n;
                if(nums[ind]>nums[i]){
                    result[i] = nums[ind];
                    break;
                }
            }
        }
        return result;
    }
}