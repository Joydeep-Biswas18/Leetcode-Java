class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        dfs(n - 1, n, "(", result);

        return result;
    }

    public static void dfs(int O, int C, String s, List<String> res) {

        if (O == 0 && C == 0) {
            res.add(s);
            return;
        }

        // Add '('
        if (O > 0) {
            dfs(O - 1, C, s + "(", res);
        }

        // Add ')'
        if (C > O) {
            dfs(O, C - 1, s + ")", res);
        }
    }
}