class Solution {
    public List<Integer> majorityElement(int[] nums) {
    //Boyer-Moore Voting Algorithm
        int n = nums.length;
        int count1 = 0;
        int count2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (count1 == 0 && ele2 != nums[i]) {
                count1 = 1;
                ele1 = nums[i];
            } else if (count2 == 0 && ele1 != nums[i]) {
                count2 = 1;
                ele2 = nums[i];
            } else if (ele1 ==nums[i]){
                count1++;
            }
            else if(ele2 == nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }

        }
        int major_element1 =0;
        int major_element2 =0;

        for(int i=0;i<n;i++){
            if(nums[i] == ele1){
                major_element1++;
            }
            if(nums[i] == ele2){
                major_element2++;
            }
        }
        List<Integer> result = new ArrayList<>();
        if(major_element1>n/3){
            result.add(ele1);
        }
        if(major_element2>n/3){
            result.add(ele2);
        }

        //Returning Return Statement
        System.gc();
        return result;
    }
}