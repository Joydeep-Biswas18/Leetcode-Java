class Solution {
    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;

        int[] previousNext = pse(arr);
        int[] next_smaller_equal = nse(arr);

        long sum = 0;

        for (int i = 0; i < n; i++) {

            long left = i - previousNext[i];
            long right = next_smaller_equal[i] - i;

            sum = (sum + left * right * arr[i]) % 1000000007;
        }

        return (int) sum;
    }

    public static int[] pse(int[] nums) {

        int n = nums.length;
        int[] find_pse = new int[n];

        Arrays.fill(find_pse, -1);

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                find_pse[i] = st.peek();
            }

            st.push(i);
        }

        return find_pse;
    }

    public static int[] nse(int[] arr) {

        int n = arr.length;
        int[] find_nse = new int[n];

        Arrays.fill(find_nse, n);

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                find_nse[i] = st.peek();
            }

            st.push(i);
        }

        return find_nse;
    }
}