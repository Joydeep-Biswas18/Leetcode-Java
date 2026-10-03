class Solution {
    public int longestValidParentheses(String s) {
        int final_len = 0;
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } 
            else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } 
                else {
                    int length = i - st.peek();
                    final_len = Math.max(final_len, length);
                }
            }

        }
        return final_len;
    }
}