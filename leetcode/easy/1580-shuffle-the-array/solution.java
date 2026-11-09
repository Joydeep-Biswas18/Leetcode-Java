class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []result = new int[2*n];
        int left =0;
        int right =n;
        for(int i =0; i<2*n;i++){
            if(i%2 ==0){
                result[i] = nums[left];
                left++;
            }
            else{
                result[i]=nums[right];
                right++;
            }
        }
        return result;
    }
}