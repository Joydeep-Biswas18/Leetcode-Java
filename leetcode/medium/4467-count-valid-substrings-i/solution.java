class Solution {
    public long countValidSubstrings(String s) {
        int left = 0;
        int r = 0;
        int n = s.length();
        long count =0;
        while(r<n){
            if(r>=2 && s.charAt(r-2)=='a' && s.charAt(r-1) =='b' && s.charAt(r) == 'c'){
                left = Math.max(left , r-1);
            }
            count +=(r -left +1);
            r++;
        }
        return count;

    }
}