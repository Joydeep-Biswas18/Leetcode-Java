class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
    bool isduplicate = false;
    int n = nums.size();

    unordered_map<int, int> map;

    for (int num : nums) {
        map[num] = map[num] + 1;

        if (map[num] == 2) {
            isduplicate = true;
        }
    }

    return isduplicate;
}
};