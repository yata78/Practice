package list;

import java.util.*;

class Solution{
    public static int[] shuffledPositions(int[] arr, int[] shuffledArr){
        Map<Integer,Integer> shuffledMap = new HashMap<>();
        for(int i = 0; i < shuffledArr.length; i++){
            shuffledMap.put(shuffledArr[i], i);
        }

        int[] answerArr = new int[arr.length];

        for(int i = 0; i < answerArr.length; i++){
            answerArr[i] = shuffledMap.get(arr[i]);
        }

        return answerArr;
    }
}

