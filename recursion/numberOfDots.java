package recursion;

class Solution{
    public static int numberOfDots(int x){
        if(x <= 1){
            return 1;
        }
        return numberOfDots(x - 1) + x;
    }
}

