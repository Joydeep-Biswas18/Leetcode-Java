class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean isDuplicate = false;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0;i < nums.length;i++){
            if(hs.contains(nums[i])){
                return isDuplicate = true;
            }
            hs.add(nums[i]);
        }
        return isDuplicate;
    }
}
