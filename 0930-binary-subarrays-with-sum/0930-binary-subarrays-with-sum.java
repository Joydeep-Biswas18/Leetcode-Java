class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int y = Calculate_Subarray(nums, goal);
        int x = Calculate_Subarray(nums, goal - 1);
        int result = y - x;

        return result;

    }

    static int Calculate_Subarray(int[] arr, int goal) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int count = 0;
        if (goal < 0) { //That line is very important beacuase it helps us from out of bound problem
            return 0;
        }

        while (r < arr.length) {
            sum += arr[r];
            while (sum > goal) {
                sum -= arr[l];
                l = l + 1;
            }
            count = count + (r - l + 1); // length is equivalent to number of subarray whoose sum is less than goal

            r++;
        }
        return count;

    }

}