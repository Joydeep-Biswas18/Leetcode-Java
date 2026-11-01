class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        int count = 0;
        int ptr1 = 0;
        int ptr2 = 0;
        sort(g.begin(), g.end());
        sort(s.begin(), s.end());
        while (ptr2 < s.size() && ptr1 < g.size()) {
            if (s[ptr2] >= g[ptr1]) {
                count++;
                ptr1++;
                ptr2++;
            } else {
                ptr2++;
            }
        }
        return count;
    }
};