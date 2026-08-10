class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverseArray(nums ,0,n-1);
        reverseArray(nums,0 ,k-1);
        reverseArray(nums ,k , n-1);
        
    }
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverseArray(int [] arr,int ie, int fe){
        // int n = arr.length;
        while(ie<fe){
            swap(arr , ie ,fe);
            ie++;
            fe--;

        }
    }

    // public void rotate(int []nums, int k){
    //     int n = nums.length;
    //     k = k%n;
    //     List<Integer> temp = new ArrayList<>();
    //     for(int i=n-k; i<n; i++){
    //         temp.add(nums[i]);
    //     }
    //     // for last
    //     for(int i=n-k-1; i>=0; i--){
    //         nums[i+k] = nums[i];
    //     }
    //     //For Put in first
        
    //     for(int i= 0;i<k; i++){
    //         nums[i] = temp.get(i);
            

    //     }
    // }
}