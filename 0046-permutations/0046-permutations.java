class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean [] freq = new boolean[nums.length];
        permute(nums,result,ds,freq);
        return result;
        
    }
    public static void permute(int[]nums, List<List<Integer>> result , List<Integer> ds , boolean[] freq){
        if(ds.size()==nums.length){
            result.add(new ArrayList<>(ds));
            return;

        }
        for(int i=0; i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                permute(nums,result,ds,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
}