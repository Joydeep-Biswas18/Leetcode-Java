class Solution:
    def maxArea(self, height: list[int]) -> int:
        left =0
        right = len(height) -1
        max_water =0
        area =0
        while(left <= right):
            if(height[left]<= height[right]):
                area = height[left] * (right-left)
                left +=1
            else:
                area = height[right] * (right - left)
                right-=1
            max_water = max(max_water , area)

        return max_water