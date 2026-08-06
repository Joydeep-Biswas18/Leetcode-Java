class Solution {
    public int smallestNumber(int n, int t) {
        
        // if (n % 10 == 0) {
        //     return n;
        // }
        while(n>0){
            if(product(n)%t==0){
                return n;
                // break;
            }
            n++;
            
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