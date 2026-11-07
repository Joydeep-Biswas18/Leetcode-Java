class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k = k %n
        self.reverse_array(nums, 0 , n-k-1)
        self.reverse_array(nums , n-k , n-1)
        self.reverse_array(nums , 0 , n-1)

    def reverse_array(self , nums:list[int], low : int , high : int)->None:
        while(low<=high):
            temp = nums[low]
            nums[low] = nums[high]
            nums[high] = temp
            low +=1
            high -=1
        