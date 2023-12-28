package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution{
    public static int[] findPairs(int[] numbers){
        Map<Integer,Integer> pair = new HashMap<>();

    for(int i = 0; i < numbers.length; i++){
        if(pair.get(numbers[i]) == null){
            pair.put(numbers[i], 1);
        } else {
            pair.replace(numbers[i], pair.get(numbers[i]) + 1);
        }
    }

    ArrayList<Integer> pairList = new ArrayList<>();

    for(int i = 0; i < numbers.length; i++){
        if(pair.get(numbers[i]) == 2 && !pairList.contains(numbers[i])){
            pairList.add(numbers[i]);
        }
    }

    int[] result = new int[pairList.size()];

    for(int i = 0; i < result.length; i++){
        result[i] = pairList.get(i);
    }

    Arrays.sort(result);

    return result;
    }
}