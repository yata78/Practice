package list;
import java.util.*;

class Main{
    public static void printArray(ArrayList<Integer> intArr){
        for (int i = 0; i < intArr.size(); i++){
            System.out.println(intArr.get(i) + " ");

        }
    }

    public static void printFixedIntArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        ArrayList<Integer> dArr = new ArrayList<Integer>();

        dArr.add(2);
        dArr.add(3);
        dArr.add(-10);

        int[] fixedArray = new int[dArr.size()];

        for(int i = 0; i < dArr.size(); i++){
            fixedArray[i] = dArr.get(i);
        }
    }
}




