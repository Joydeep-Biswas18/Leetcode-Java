class Solution {
    public int numberOfSubstrings(String s) {
        int l = 0;
        int r = 0;
        int count = 0;

        int[] target = new int[3];
        while (r < s.length()) {
            target[s.charAt(r) - 'a']++;

            while (target[0] > 0 && target[1] > 0 && target[2] > 0) {
                count += s.length()-r;
                target[s.charAt(l) - 'a']--;
                l++;
            }
            r++;
        }
        return count;
    }
        
    }
