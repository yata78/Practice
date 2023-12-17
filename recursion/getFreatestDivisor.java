class Main{

    public static int getGreatestDivisor(int n){

        return getGreatestDivisorHelper(n , n-1);
    }

    public static int getGreatestDivisorHelper(int n , int k){

        if(n % k == 0){
            return k;
        }

        return getGreatestDivisorHelper(n, k-1);
    }
}
