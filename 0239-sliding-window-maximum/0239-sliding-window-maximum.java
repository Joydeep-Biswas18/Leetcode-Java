class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int l = 0;
        int r = 0;

        int[] ans = new int[n - k + 1];
        int index = 0;

        Deque<Integer> dq = new ArrayDeque<>();

        while (r < n) {

            // Remove smaller elements from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[r]) {
                dq.removeLast();
            }

            // Add current index
            dq.addLast(r);

            // Remove elements outside the window
            if (dq.peekFirst() < l) {
                dq.removeFirst();
            }

            // Window size is k
            if (r - l + 1 == k) {

                // Front contains index of maximum
                ans[index++] = nums[dq.peekFirst()];

                l++;
            }

            r++;
        }

        return ans;
    }
}