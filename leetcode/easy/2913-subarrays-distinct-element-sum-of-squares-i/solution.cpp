class Solution {
public:
    int sumCounts(vector<int>& nums) {
        int sum = 0;

        // Inner Loop
        for (int i = 0; i < nums.size(); i++) {
            unordered_set<int> hs;

            for (int j = i; j < nums.size(); j++) {
                hs.insert(nums[j]);
                sum += hs.size() * hs.size();
            }
        }

        return sum;
    }
};