public class fibonacciNumberTail {
    
    public static int fibonacciNumberTailHelper(int fn1, int fn2 , int n){
        if (n < 1){
            return fn1;
        }

        return fibonacciNumberTailHelper(fn2, fn2 + fn1, n - 1);
    }

    public static int fibonacciNumberTail(int n){
        return fibonacciNumberTailHelper(0, 1, n);
    }
}
