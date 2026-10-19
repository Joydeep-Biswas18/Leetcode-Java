class Solution {
    public int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length - 1; i++) {
            int complement = target - numbers[i];
            int low = i + 1;
            int high = numbers.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (numbers[mid] == complement) {
                    return new int[] { i + 1, mid + 1 };
                } else if (numbers[mid] < complement) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        }
        return new int[] { -1, -1 };
    }
}