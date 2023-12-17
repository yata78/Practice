class Solution{
    public static int threeGCD(int x, int y, int z){
        int twoGCDAnswer = twoGCD(x, y);

        return twoGCD(z, twoGCDAnswer);
    }

    public static int twoGCD(int x, int y){
        if (x < y){
            int tmp = x;
            x = y;
            y = tmp;
        }
        
        if(x % y == 0){
            return y;
        } else {
            return twoGCD(y, x % y);
        }
    }
}
