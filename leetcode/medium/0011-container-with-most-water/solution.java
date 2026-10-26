class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max_water = 0;
        int area = 0;

        while (left < right) {
            if (height[right] >= height[left]) {
                area = (right - left) * height[left];
                left++;
            } else {
                area = (right - left) * height[right];
                right--;

            }
            max_water = Math.max(area, max_water);
        }
        return max_water;
    }
}