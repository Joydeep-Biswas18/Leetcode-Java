class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum =0;
        //Inner Loop
        for(int i =0;i<nums.size(); i++){
            HashSet<Integer> hs = new HashSet<>();
            //Outer Loop
            for(int j =i;j<nums.size(); j++){
                hs.add(nums.get(j));
                sum += hs.size() * hs.size();
            }
        }
        return sum;
    }
}