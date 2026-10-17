class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for (int num : weights) {
            low = Math.max(low, num);
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

    public static boolean isValid(int[] weights, int days, int max_valid) {
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
}