package scope;

class Main{
    public static int globalCounter = 0;

    public static void incrementGlobalCounter(){
        globalCounter++;
    }

    public static void changeGlobalCounter(int x){
        globalCounter = x;
    }

    public static int square(int x){
        changeGlobalCounter(12);
        return x * x;
    }

}
