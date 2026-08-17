class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<Integer> result = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        Sum_combinational(
                candidates,
                0,
                target,
                result,
                ans);

        return ans;
    }

    public static void Sum_combinational(
            int[] candidates,
            int index,
            int target,
            List<Integer> result,
            List<List<Integer>> ans) {

        // Base case
        if (index == candidates.length) {

            if (target == 0) {
                ans.add(new ArrayList<>(result));
            }

            return;
        }

        // Pick
        if (candidates[index] <= target) {

            result.add(candidates[index]);

            // Stay at same index because we can reuse the element
            Sum_combinational(
                    candidates,
                    index,
                    target - candidates[index],
                    result,
                    ans);

            // Backtrack
            result.remove(result.size() - 1);
        }

        // Don't pick
        Sum_combinational(
                candidates,
                index + 1,
                target,
                result,
                ans);
    }
}
