class Solution {
    public boolean containsDuplicate(int[] nums) {

        boolean isDuplicate = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) == 2) {
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;

    }
}
