class Solution {
    public int maxArea(int[] height) {
      int n = height.length;
        int left =0;
        int right = n-1;
        int Area =0;
        int water_area=0;

        while(left<n){
            if(height[left]<=height[right]){
                water_area = height[left]*(right-left);
                Area = Math.max(water_area, Area);
                left++;

            }
            else if(height[left]>height[right]){
                
                water_area = height[right]*(right-left);
                right--;
                Area = Math.max(water_area, Area);
            }
            else{
                water_area = height[left]*(right-left);
                Area = Math.max(water_area, Area);
                left++;
                right--;

            }

        }
        return Area;
    }
}
