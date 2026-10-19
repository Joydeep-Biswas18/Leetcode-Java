class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        for (int i = 0; i < numbers.size(); i++) {
            int comp = target - numbers[i];
            int low = i + 1;
            int high = numbers.size() - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (numbers[mid] == comp) {
                    return {i + 1, mid + 1};
                } else if (numbers[mid] < comp) {
                    low = mid + 1;

                } else {
                    high = mid - 1;
                }
            }
        }
        return {-1, -1};
    }
};