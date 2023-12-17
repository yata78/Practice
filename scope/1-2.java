package scope;

class Main {
    public static int x = 34;

    public static void main(String[] args){
        System.out.println(x);

        int x = 56;

        System.out.println(x);
    }
    
}
