package scope;

class Main{

    public static void changeGlobalCounter(int x){
        int counter = x;
    }

    public static int incrementOne(int x){
        return x + 1;
    }

    public static int square(int x){
        changeGlobalCounter(x);
        return x * x;
    }
}
