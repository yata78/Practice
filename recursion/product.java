package recursion;

class Solution{
   public static int product(int x, int y){
        if(y >= 1){
            return product(x, y - 1) + x;
        }

        if(y <= -1){
            return product(x, y + 1) - x;
        }

        return 0;
    }
}

