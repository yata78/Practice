package list;

import java.util.ArrayList;

class Main{
    public static int sumOfArray(ArrayList<Integer> arr){
        return sumOfArray(arr)
    }

    public static int sumOfArrayHelper(ArrayList<Integer> arr, int start, int end){
        if(start == end) return arr.get(start);

        int middle = (int)Math.floor((start + end) / 2);

        int leftArr = sumOfArrayHelper(arr, start, middle);
        int rightArr = sumOfArrayHelper(arr, middle, end);

        return leftArr + rightArr;
    }
}
