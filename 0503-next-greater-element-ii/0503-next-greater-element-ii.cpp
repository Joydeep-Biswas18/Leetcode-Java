class Solution {
public:
    vector<int> nextGreaterElements(vector<int>& nums) {

        int n = nums.size();

        vector<int> result(n);
        stack<int> st;

        //that for loop create a hypothetical circulation
        for (int i = 2 * n - 1; i >= 0; i--) {

            while (!st.empty() && st.top() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                result[i] = st.empty() ? -1 : st.top();
            }

            // Push current element
            st.push(nums[i % n]);
        }

        return result;
    }
};