class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count =0;
        int ptr1 = 0;
        int ptr2 =0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(ptr1<g.length && ptr2 <s.length){
            if(g[ptr1]<= s[ptr2]){
                count++;
                ptr1++;
                ptr2++;
            }
            else{
                ptr2++;
            }
        }
        return count;

    }
}