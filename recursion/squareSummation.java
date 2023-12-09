package recursion;
//“ñæ‚Ì‘˜a
class Solution{

    public static int square(int n){
        return n * n;
    }

    public static int squareSummation(int n){
        if(n <= 0){
            return 0;
        }

        return squareSummation(n - 1) + square(n);
    }
}


