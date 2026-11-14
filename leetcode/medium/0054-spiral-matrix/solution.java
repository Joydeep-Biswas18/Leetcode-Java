
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        List<Integer> ds = new ArrayList<>();
        int n = matrix[0].length;

        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;

        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                ds.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ds.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ds.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ds.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ds;
    }
}
