class Solution {
public:
    int shipWithinDays(vector<int>& weights, int days) {
        int low = 0;
        int high = 0;
        for (int num : weights) {
            low = max(low, num);
            high += num;
        }
        int answer = high;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isValid(weights, days, mid)) {
                answer = mid;
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return answer;
    }
    bool isValid(vector<int>& weights, int days, int max_valid) {
        int CurrSum = 0;
        int No_k = 1;
        for (int num : weights) {
            if (CurrSum + num > max_valid) {
                No_k++;
                CurrSum = num;

                // Boundary case if No of Days exceed
                if (No_k > days) {
                    return false;
                }
            } else {
                CurrSum += num;
            }
        }
        return No_k <= days;
    }
};