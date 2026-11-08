class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        int l =0;
        int n = s1.length();
        List<List<String>> ds = new ArrayList<>();
        while(l<n){
            if(s1.charAt(l) == s2.charAt(l)){
                l++;
                continue;
            }
            int start = l;
            while(l<n&& s1.charAt(l) != s2.charAt(l)){
                l++;
            }
            String sub1 = s1.substring(start , l);
            String sub2 = s2.substring(start , l);
            // Store the answer
            ds.add(Arrays.asList(sub1 , sub2));
            
        }
        return ds;
    }
}