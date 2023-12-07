//‚˜‚Æy‚ª—^‚¦‚ç‚êA•½•ûª‚ª©‘R”‚©

class Solution {
    public static boolean isPerfectSquare(int x, int y){
        double dis = distance(x,y);
        return hasDecimal(dis);
    }

    public static double distance(int x, int y){
        return Math.sqrt(x * x + y * y);
    }

    public static boolean hasDecimal(double distance){
        if (distance % 1 != 0){
            return false;
        } else {
            return true;
        }
    }
}