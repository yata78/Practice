package list;

import java.util.*;

class Solution{
    public static int shuffleSuccessRate(int[] arr, int[] shuffledArr){
        Map<Integer,Integer> shuffledMap = new HashMap<>();
        for(int i = 0; i < shuffledArr.length; i++){
            shuffledMap.put(i, shuffledArr[i]);
        }

        Map<Integer,Integer> arrMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            arrMap.put(i,arr[i]);
        }

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arrMap.get(i) != shuffledMap.get(i)){
                count++;
            }
        }

        return (int)Math.floor((double)count / arr.length * 100);
    }
}

