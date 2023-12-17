class Solution{
    public static String irreducibleFraction(int x, int y){
        int GCD = irreducibleFractionHelper(x, y);
        String child = Integer.valueOf(x /GCD).toString();
        String mother = Integer.valueOf(y /GCD).toString();

        if(mother.equals("1")){
            return child;
        } else {
            return child + "/" + mother;
        }
    }

    public static int irreducibleFractionHelper(int x, int y){
        if(x % y == 0){
            return y;
        }

        return irreducibleFractionHelper(y,  x % y);
    }
}
