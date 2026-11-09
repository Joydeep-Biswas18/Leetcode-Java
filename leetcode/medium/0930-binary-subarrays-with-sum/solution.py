class Solution:
    def numSubarraysWithSum(self, nums: list[int], goal: int) -> int:
        return (self.no_of_subArray_less_than_equal_than_goal(nums,goal) - 
        self.no_of_subArray_less_than_equal_than_goal(nums , goal -1))
    def no_of_subArray_less_than_equal_than_goal(self , nums:list[int] , k:int) -> int:
        low =0
        high =0
        sum =0
        count =0
        if(k<0):
            return 0
        while(high < len(nums)):
            sum +=nums[high]
            while(sum>k):
                sum -= nums[low]
                low+=1
            count +=(high -low +1)
            high +=1
        return count