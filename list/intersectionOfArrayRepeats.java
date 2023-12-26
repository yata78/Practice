package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Solution{
    public static int[] intersectionOfArraysRepeats(int[] intList1, int[] intList2){
        HashMap<Integer,Integer> list1Map = new HashMap<>();

        for(int i = 0; i < intList1.length; i++){
            if(list1Map.get(intList1[i]) == null){
                list1Map.put(intList1[i], 1);
            } else {
                list1Map.replace(intList1[i], list1Map.get(intList1[i]) + 1);
            }
        }

        ArrayList<Integer> results = new ArrayList<>();

        for(int i = 0; i < intList2.length; i++){
            if(list1Map.get(intList2[i]) != null && list1Map.get(intList2[i]) > 0){
                list1Map.replace(intList2[i], list1Map.get(intList2[i]) - 1);
                results.add(intList2[i]);
            }
        }

        int[] answer = new int[results.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = results.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
