class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        int max_len = 0;
        unordered_map<char, int> map;
        while(right<n){
            //that is use for puting value
            map[s[right]]++;
            //map[key] that also use for getting value
            while(map[s[right]]>1){
                char value = s[left];
                map[value]--;

                if(map[value]==0){
                    //that erase function use for also removing value
                    map.erase(value);
                }
                left++;
            } 
            int length = right-left +1;
            max_len = max(length, max_len);
            right++;
        }
        return max_len;
    }
};