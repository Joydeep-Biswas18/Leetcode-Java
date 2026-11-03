class Solution {
public:
    int minMoves(vector<int>& nums) {
        int max_ele = nums[0];
        for(int num : nums){
            max_ele = max(max_ele , num);
        }
        int count =0;
        for(int num : nums){
            count += (max_ele - num);
        }
        return count;
    }
};