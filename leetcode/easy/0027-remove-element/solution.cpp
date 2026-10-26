class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int i =0;
        int n = nums.size();
        for(int r =0;r<n;r++){
            if(val != nums[r]){
                nums[i] = nums[r];
                i++;
            }
            
        }
        return i;
    }
};