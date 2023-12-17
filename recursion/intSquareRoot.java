class Solution{
    public static int intSquareRoot(int n){
        return intSquareRootHelper(n, 1);
    }

    public static int intSquareRootHelper(int n , int k){

        if( k * k > n){
            return k - 1;
        }

        return intSquareRootHelper(n, k+1);
    }
}
