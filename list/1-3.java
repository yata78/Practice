package list;

class Main{
    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static int totalEven(int[] listOfInts){
        int count = 0;
        for(int i = 0; i < listOfInts.length; i++){
            if(isEven(listOfInts[i])){
                count += 1;
            }
        }

        return count;
    }
}
