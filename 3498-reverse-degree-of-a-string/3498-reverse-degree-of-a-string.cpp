class Solution {
public:
    int reverseDegree(string s) {
        int sum = 0;
        int index_value = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = 'z' - s[i] + 1;
            index_value = value * (i + 1);
            sum += index_value;
        }
        return sum;
    }
};