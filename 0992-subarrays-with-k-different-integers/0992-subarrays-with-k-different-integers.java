class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return Optimal_solution(nums, k) - Optimal_solution(nums, k - 1);
    }

    public int Optimal_solution(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        if (k <= 0) {
            return 0;
        }

        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size() > k) {

                int value = nums[left];

                map.put(value, map.get(value) - 1);

                if (map.get(value) == 0) {
                    map.remove(value);
                }

                left++;
            }
            count += (right - left + 1);
            right++;
        }
        return count;
    }

}