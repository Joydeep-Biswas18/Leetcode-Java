class Solution {
public:
    int minDays(vector<int>& bloomDay, int m, int k) {
        int min_ele = bloomDay[0];
        int max_ele = bloomDay[0];
        // Base case: Not enough flowers to make m bouquets of size k
        // Cast to long to prevent integer overflow
        if ((long)m * k > bloomDay.size()) {
            return -1;
        }
        for (int bloom : bloomDay) {
            max_ele = max(max_ele, bloom);
            min_ele = min(min_ele, bloom);
        }
        int low = min_ele;
        int high = max_ele;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPosible(bloomDay, mid, m, k)) {
                // if it is posible so trim out the right half because we are
                // not interest with thr=e right half we need the minimum days
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    bool isPosible(vector<int>& nums, int val, int m, int k) {
        int count = 0;
        int no_of_bouquets = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] <= val) {
                count++;
                if (count == k) {
                    no_of_bouquets++;
                    count = 0;
                }
            } else {

                count = 0;
            }

            if (no_of_bouquets >= m) {
                return true;
            }
        }
        return false;
    }
};