class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Combination_sum_three(1, ds, ans, n, k);

        return ans;
    }

    public static void Combination_sum_three(int index, List<Integer> ds, List<List<Integer>> ans, int sum, int k) {
        //Base condition
        if (ds.size() == k) {
            if (sum == 0) {
                ans.add(new ArrayList<>(ds));
                return;

            }
        } else {
            for (int digit = index; digit <= 9; digit++) {

                //Take
                ds.add(digit);

                //Recursive Function call
                Combination_sum_three(digit + 1, ds, ans, sum - digit, k);

                //backtrack
                ds.remove(ds.size() - 1);

            }
        }

    }
}
