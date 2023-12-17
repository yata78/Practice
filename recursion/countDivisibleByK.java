class Solution{
    public static int countDivisibleByK(int n, int k){
        int count = 0;

        if(n % k != 0){
            return 0;
        } else{
            return 1+countDivisibleByK(n / k, k);
        }
    }
}