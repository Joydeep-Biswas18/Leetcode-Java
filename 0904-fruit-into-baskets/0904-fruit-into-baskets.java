class Solution {
    public int totalFruit(int[] fruits) {
      int max_fruit = Integer.MIN_VALUE;
        int n = fruits.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        while (r < n) {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            while (map.size() > 2) {

                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);

                }
                l++;

            }
            int length = r - l + 1;
            max_fruit = Math.max(length, max_fruit);

            r++;

        }
        return max_fruit;

    }
}
