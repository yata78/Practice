package recursion;

class Solution{
    public static int recursiveAddition(int m , int n){
        if(n == 0){
            return m;
        }

        return recursiveAddition(m, n - 1) + 1;
    }
}
