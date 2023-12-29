package list;

import java.util.*;

class Main{
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> arr){
        return mergeSortHelper(arr, 0 , arr.size() - 1);
    }

    public static ArrayList<Integer> mergeSortHelper(ArrayList<Integer> arr, int start, int end){
        if(start == end){
            return new ArrayList<Integer>(Arrays.asList(arr.get(start)));
        }

        int middle = (int)Math.floor((start + end) / 2);

        List<Integer> leftArr = mergeSortHelper(arr, start, middle);
        List<Integer> rightArr = mergeSortHelper(arr, middle + 1, end);

        leftArr.add(Integer.MAX_VALUE);
        rightArr.add(Integer.MAX_VALUE);

        int l = leftArr.size() + rightArr.size() - 2;
        int li = 0;
        int ri = 0;
        
        ArrayList<Integer> merged = new ArrayList<>();

        while(li + ri < l){
            if(leftArr.get(li) <= rightArr.get(ri)){
                merged.add(leftArr.get(li));
                li++;
            } else {
                merged.add(rightArr.get(ri));
                ri++;
            }
        }

        return merged;
    }
}
