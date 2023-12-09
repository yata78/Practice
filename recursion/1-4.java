package recursion;

class Main{

    public static int summation(int n) {
        if(n <= 0){
            return 0;
        }

        return summation(n - 1) + n;
    }
}
