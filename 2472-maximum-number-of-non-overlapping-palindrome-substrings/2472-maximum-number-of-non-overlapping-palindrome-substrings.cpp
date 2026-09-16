class Solution {
public:
    int maxPalindromes(string s, int k) {
        int ans = 0;
        int start = 0;
        int n = s.length();

        for (int r = k - 1; r < n; r++) {

            // Check palindrome of length k
            int l = r - k + 1;

            if (l >= start && isPalindrome(s, l, r)) {
                ans++;
                start = r + 1;
                continue;
            }

            // Check palindrome of length k + 1
            l = r - k ;

            if (l >= start && isPalindrome(s, l, r)) {
                ans++;
                start = r + 1;
            }
        }

        return ans;
    }

    bool isPalindrome(string s, int l, int r) {
        while (l < r) {
            if (s[l] != s[r]) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
};