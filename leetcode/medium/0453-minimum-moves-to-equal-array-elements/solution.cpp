class Solution {
public:
    int minMoves(vector<int>& nums) {
        int count =0;
        int min_ele = nums[0];
        for(int num : nums){
            min_ele = min(min_ele , num);
        }
        for(int num : nums){
            if(num > min_ele){
                count +=(num -min_ele);
            }
            
        }
        return count;
    }
};