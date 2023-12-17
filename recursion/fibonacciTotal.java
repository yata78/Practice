class Solution{
    public static int fibonacciTotal(int n){
        return fibonacciNumberTailHelper(n, 0, 1, 0);
    }

    public static int fibonacciNumberTailHelper(int n,int fn1 ,int fn2,int total){
        if(n < 1){
            return total + fn1;
        }

        return fibonacciNumberTailHelper(n - 1, fn2, fn1 + fn2, total + fn1);
    }
}

