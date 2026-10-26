
class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> merged = merge_array(nums1, nums2);
        int n = merged.size();

        if (n % 2 == 1) {
            return (double)merged[n / 2];
        } else {
            return ((double)merged[n / 2] + merged[n / 2 - 1]) / 2;
        }
    }

    vector<int> merge_array(vector<int>& nums1, vector<int>& nums2) {
        int m = nums1.size();
        int n = nums2.size();

        int i = 0, j = 0, k = 0;
        vector<int> merged(m + n);

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while (i < m) {
            merged[k++] = nums1[i++];
        }

        while (j < n) {
            merged[k++] = nums2[j++];
        }

        return merged;
    }
};
