class Solution{
    public static boolean recursiveIsPrime(int n){
        if (n == 1){
            return false;
        } else {
            return recursiveIsPrimeHelper(n, 2);
        }
    }

    public static boolean recursiveIsPrimeHelper(int n , int k){
        if(k > Math.floor(n / 2)){
            return true;
        }

        if(n % k == 0){
            return false;
        } else {
            return recursiveIsPrimeHelper(n, k + 1);
        }

    }
}
