class Solution {
    public int longestConsecutive(int[] nums) {
        int max_length = 0;

        HashSet<Integer> map = new HashSet<>();
        for (int num : nums) {
            map.add(num);
        }
        for (int num : map) {
            if (!map.contains(num - 1)) {
                int length = 1;
                while (map.contains(num + length)) {

                    length++;
                }
                max_length = Math.max(max_length, length);
            }
        }

        return max_length;
    }
}