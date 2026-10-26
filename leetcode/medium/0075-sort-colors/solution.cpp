class Solution {
public:
    void sortColors(vector<int>& nums) {
       int n = nums.size();
        int low =0;
        int high = n-1;
        int mid =0;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low , mid);
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums ,mid ,high);
                high--;
            }
        }
        
    }
    void swap(vector<int>& nums ,int low ,int high){

        while(low<high){

        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;

        low++;
        high--;

        }
    }
};