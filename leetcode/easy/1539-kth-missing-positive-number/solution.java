class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] - mid - 1 < k) {
                //that counts how many numbers are present before that number
                low = mid + 1;
            } else {
                high = mid -1 ;
            }
        }
        return high + k +1;

    }
}
// int low = 0;
//         int high = arr.length;
//          here the array is said to 1 index based
//         while (low < high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] - mid - 1 < k) {
//                 //that counts how many numbers are present before that number
//                 low = mid + 1;
//             } else {
//                 high = mid  ;
//                  i use this because of while(low <high)
//             }
//         }
//         return high + k;

//     }