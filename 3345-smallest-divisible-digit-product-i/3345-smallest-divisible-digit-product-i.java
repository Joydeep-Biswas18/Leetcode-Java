class Solution {
    public int smallestNumber(int n, int t) {
        
        if (n % 10 == 0) {
            return n;
        }
        for (int i=n; i<=100; i++){
            if(product(i)%t==0){
                return i;
                // break;
            }
            
        }
        return n;
    }

    public static int product(int n) {
        int product = 1;
        while(n>0){

        int digit = (n % 10);
        product = product * digit;
        n = n / 10;

        }
        return product;
    }
}