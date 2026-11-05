class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count =0; 
        Arrays.sort(arr2);  
        for(int num : arr1){
            if(isValid(arr2,num,d)){
                count++;
            }
        }
        return count;
        
    }public static boolean isValid(int [] nums1 , int nums2,int d){
        int low =0;
        int high = nums1.length-1;
        while(low<= high){
            int mid = low + (high - low)/2;
            if(Math.abs(nums1[mid] - nums2)<=d){
                
                return false;
            }
            else if (nums1[mid] < nums2) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return true;
    }
}