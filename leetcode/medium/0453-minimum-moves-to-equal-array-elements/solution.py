class Solution:
    def minMoves(self, nums: list[int]) -> int:
        min_ele = nums[0]
        move = 0
        for i in range(len(nums)):
            min_ele = min(min_ele, nums[i])
        for i in range(len(nums)):
            if nums[i] > min_ele:
                move += (nums[i] - min_ele)
        return move
