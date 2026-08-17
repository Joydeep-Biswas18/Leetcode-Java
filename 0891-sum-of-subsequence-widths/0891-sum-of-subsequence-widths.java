import java.util.Arrays;

class Solution {

    static final long MOD = 1_000_000_007L;

    public int sumSubseqWidths(int[] nums) {

        // Number of elements
        int n = nums.length;

        // Sort the array
        Arrays.sort(nums);

        // Store powers of 2
        long[] powerOfTwo = new long[n];

        powerOfTwo[0] = 1; // 2^0 = 1

        // Calculate 2^i % MOD
        for (int i = 1; i < n; i++) {
            powerOfTwo[i] = (powerOfTwo[i - 1] * 2) % MOD;
        }

        // Store answer
        long result = 0;

        // Calculate contribution of every element
        for (int i = 0; i < n; i++) {

            result = (result
                    + (powerOfTwo[i]
                            - powerOfTwo[n - 1 - i]) * nums[i])
                    % MOD;
        }

        return (int) result;
    }
}