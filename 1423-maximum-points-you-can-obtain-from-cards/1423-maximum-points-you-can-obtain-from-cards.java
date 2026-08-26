class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        int left_sum = 0;

        // Take all k cards from the left
        for (int i = 0; i < k; i++) {
            left_sum += cardPoints[i];
        }

        int max_sum = left_sum;

        // Replace left cards one by one with right cards
        for (int j = 0; j < k; j++) {

            left_sum -= cardPoints[k - 1 - j];
            left_sum += cardPoints[n - 1 - j];

            max_sum = Math.max(max_sum, left_sum);
        }

        return max_sum;
    }
}