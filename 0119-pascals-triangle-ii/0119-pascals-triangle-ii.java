class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        int n = rowIndex;
        long element =1;
        for(int i =0; i<=n; i++){
            row.add((int)(element));
            element = element * (n-i)/(i+1);

        }
        return row;
        
    }
}