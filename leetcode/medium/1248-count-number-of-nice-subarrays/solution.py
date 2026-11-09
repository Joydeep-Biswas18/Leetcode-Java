class Solution:
    def numberOfSubarrays(self, nums: list[int], k: int) -> int:
        return (self.no_of_subArray_less_than_equal_odd_elements(nums , k) - self.no_of_subArray_less_than_equal_odd_elements(nums ,k-1))
    def no_of_subArray_less_than_equal_odd_elements(self , nums :list[int] , k:int)->int:
        low =0
        high =0
        count = 0
        odd_ele =0
        if(k<0):
            return 0
        while(high < (len(nums))):
            odd_ele +=nums[high] % 2
            while(odd_ele > k):
                odd_ele -= nums[low] % 2
                low+=1
            count += (high -low +1)
            high +=1
        return count
            
