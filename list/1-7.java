package list;

import java.util.ArrayList;
import java.util.Arrays;

class Main{

    public static void printArray(ArrayList<Integer> intArr){
        for( int i = 0; i < intArr.size(); i++){
            System.out.println(intArr.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        ArrayList<Integer> dArr = new ArrayList<Integer>();

        dArr.add(2);
        dArr.add(3);

        dArr.addAll(Arrays.asList(3,34,3542,21));

    }
}
