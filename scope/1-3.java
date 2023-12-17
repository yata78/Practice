package scope;

class Main {
    public static int x = 34;
    public static int y = 10;

    public static double square(int x){
        return x * x;
    }

    public static double globalMult(int x){
        return x * y;
    }
}
