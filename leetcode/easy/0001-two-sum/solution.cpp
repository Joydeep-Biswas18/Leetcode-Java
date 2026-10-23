class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n = nums.size();
        unordered_map<int, int> map;
        for (int i = 0; i < n; i++) {
            int comple = target - nums[i];
            if (map.find(comple) != map.end()) {
                return { map[comple], i };
            }
           map[nums[i]] = i;
        }
        return {-1, -1};
    }
};