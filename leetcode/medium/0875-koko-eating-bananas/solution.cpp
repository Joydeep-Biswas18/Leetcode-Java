class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int low = 1;
        int high = 0;
        for (int num : piles) {
            high = max(high, num);
        }
        int answer = low;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isValid(piles, h, mid)) {
                answer = mid;
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return answer;
    }

    bool isValid(vector<int>& nums, int h, int speed) {
        int hour = 0;

        for (int num : nums) {
            hour += (num + speed - 1) / speed;

            if (hour > h) {
                return false;
            }
        }

        return true;
    }
};