class Solution {
    public long subArrayRanges(int[] nums) {
        return Max_value_subarray_no(nums) - Min_value_subarray_no(nums);
    }

    public static long Max_value_subarray_no(int[] nums) {
        int n = nums.length;
        long value_max_subarray = 0;

        int[] prev_greater_ele = prev_greater_ele(nums);
        int[] next_greater_equal_ele = next_greater_equal_ele(nums);

        for (int i = 0; i < n; i++) {
            long left = i - prev_greater_ele[i];
            long right = next_greater_equal_ele[i] - i;

            value_max_subarray += (long) nums[i] * left * right;
        }

        return value_max_subarray;
    }

    public static long Min_value_subarray_no(int[] nums) {
        int n = nums.length;
        long value_min_subarray = 0;

        int[] prev_smaller_ele = prev_smaller_ele(nums);
        int[] next_smaller_equal_ele = next_smaller_equal_ele(nums);

        for (int i = 0; i < n; i++) {
            long left = i - prev_smaller_ele[i];
            long right = next_smaller_equal_ele[i] - i;

            value_min_subarray += (long) nums[i] * left * right;
        }

        return value_min_subarray;
    }

    public static int[] prev_smaller_ele(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();

        int[] prev_smaller_ele = new int[n];
        Arrays.fill(prev_smaller_ele, -1);

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                prev_smaller_ele[i] = st.peek();
            }

            st.push(i);
        }

        return prev_smaller_ele;
    }

    public static int[] next_smaller_equal_ele(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();

        int[] next_smaller_equal_ele = new int[n];
        Arrays.fill(next_smaller_equal_ele, n);

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                next_smaller_equal_ele[i] = st.peek();
            }

            st.push(i);
        }

        return next_smaller_equal_ele;
    }

    public static int[] prev_greater_ele(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();

        int[] prev_greater_ele = new int[n];
        Arrays.fill(prev_greater_ele, -1);

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                prev_greater_ele[i] = st.peek();
            }

            st.push(i);
        }

        return prev_greater_ele;
    }

    public static int[] next_greater_equal_ele(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();

        int[] next_greater_equal_ele = new int[n];
        Arrays.fill(next_greater_equal_ele, n);

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                next_greater_equal_ele[i] = st.peek();
            }

            st.push(i);
        }

        return next_greater_equal_ele;
    }
}