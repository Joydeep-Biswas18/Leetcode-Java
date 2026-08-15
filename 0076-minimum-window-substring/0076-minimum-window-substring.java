class Solution {
    public String minWindow(String s, String t) {
        int l = 0;
        int r = 0;
        int min_length = Integer.MAX_VALUE;
        int count = 0;
        int s_index =-1;
        int end_index =-1;

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        while (r < s.length()) {
            char ch = s.charAt(r);
            if (map.containsKey(ch)) {
                if (map.get(ch) > 0) {
                    count++;
                }
                map.put(ch, map.get(ch) - 1);
            }
            while (count == t.length()){
                if (r - l + 1 < min_length) {
                    min_length = r - l + 1;
                    s_index = l;
                }

                char leftchar = s.charAt(l);
                if(map.containsKey(leftchar)){
                    map.put(leftchar , map.get(leftchar)+1);

                    if(map.get(leftchar)>0){
                        count--;
                }
            }
            l++;
            

            }
                r++;

        }
        if (s_index == -1) {
            return "";
        }

        return s.substring(s_index, s_index + min_length);

    }
}