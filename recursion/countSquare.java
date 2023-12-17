class Solution{
    public static int countSquare(int x, int y){
        int minPaper = countSquareHelper(x, y);

        return x / minPaper * y / minPaper;
    }

    
    public static int countSquareHelper(int x, int y){

        if(x % y == 0){
            return y;
        }

        return countSquareHelper(y, x % y);
    }
}
