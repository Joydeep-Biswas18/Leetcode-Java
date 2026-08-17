import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> ds = new ArrayList<>();
        return Combination_sum(candidates, 0, target, ds);
    }

    public List<List<Integer>> Combination_sum(int[] candidates, int index, int target, List<Integer> ds) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);

        //Base case if
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return ans;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i - 1] == candidates[i]) {
                continue;
            }
            if (candidates[i] > target) {
                break;
            }

            //take 
            ds.add(candidates[i]);

            List<List<Integer>> temp = Combination_sum(candidates, i + 1, target - candidates[i], ds);

            // ✅ Collect returned answers
            ans.addAll(temp);

            //BackTruck
            ds.remove(ds.size() - 1);

        }
        return ans;

    }
}
