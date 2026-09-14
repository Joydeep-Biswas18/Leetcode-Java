class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n = nums.size();
        int element = 0;
        int count_voting = 0;

        for (int i = 0; i < n; i++) {
            if (count_voting == 0) {
                element = nums[i];
                count_voting++;
            } else if (element == nums[i]) {
                count_voting++;
            } else {
                count_voting--;
            }
        }
        int count_major_element = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == element) {
                count_major_element++;
            }
        }
        // cheach whether this element is reallt applicable or not
        if (count_major_element > n / 2) {
            return element;
        }
        return -1;
    }
};