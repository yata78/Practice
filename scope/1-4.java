package scope;

class Main{

    public static int x = 3;
    public static int y = 10;

    public static int multiply(int x){

        return x * y;
    }

    static class B{
        public static int x = 15;

        public static int multiply(int x){
            return x * y;
        }
    }
}