class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];

        Permutation_print_2nd(nums, ans, ds, freq);

        return ans;

    }

    public static void Permutation_print_2nd(int[] nums, List<List<Integer>> ans, List<Integer> ds, boolean[] freq) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        Set<Integer> used = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (!freq[i] && !used.contains(nums[i])) {

                used.add(nums[i]);

                freq[i] = true;
                ds.add(nums[i]);

                Permutation_print_2nd(nums, ans, ds, freq);

                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }

    }

}
