class Solution {
    public int majorityElement(int[] nums) {
        int voting =0;
        int element =0;
        for(int i =0;i<nums.length ;i++){
            if(voting==0){
                element = nums[i];
                voting++;
            }
            else if(element == nums[i]){
                voting ++;
            }
            else{
                voting --;
            }
        }
        int count_element=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element){
                count_element++;

            }
        }
        if(count_element>(nums.length)/2){
            return element;
        }

        return 1;

    }
}

      