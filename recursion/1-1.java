package recursion;

class Main{
    public static int multpleOf7(int n){
        if(n == 0){
            return 0;
        }

        return multpleOf7(n-1) + 7; 
    }

    public static void main(String[] args){

        System.out.println(multpleOf7(3));

        System.out.println(multpleOf7(11));
    }
}
