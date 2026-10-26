class Solution {
    public int removeElement(int[] nums, int val) {
        int i =0;
        int n = nums.length;
        int r =0;
        while(r<n){
            if(val != nums[r]){
                nums[i] = nums[r];
                i++;
            }
            r++;
        }
        return i;
    }
}