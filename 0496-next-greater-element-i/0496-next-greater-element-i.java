class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;

        int[] result = new int[n];

        Stack<Integer> st = new Stack<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        // Process nums2 from right to left
        for (int j = nums2.length - 1; j >= 0; j--) {

            while (!st.isEmpty() && st.peek() <= nums2[j]) {
                st.pop();
            }

            if (st.isEmpty()) {
                map.put(nums2[j], -1);
            } else {
                map.put(nums2[j], st.peek());
            }

            st.push(nums2[j]);
        }

        // Find answers for nums1
        for (int i = 0; i < n; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}