class Solution {
    public int reverseDegree(String s) {
      int sum =0;
        int index_value =0;
        for(int i =0; i<s.length();i++){
            int value = 'z'- s.charAt(i) +1;
            index_value = value * (i+1);
            sum += index_value;

        }
        return sum;
    }
}