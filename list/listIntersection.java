package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Solution{
    public static int[] listIntersection(int[] targetList, int[] searchList){
        Arrays.sort(targetList);
        Arrays.sort(searchList);

        ArrayList<Integer> intersection = new ArrayList<>();
        
        HashMap<Integer, Integer> targetMap = new HashMap<>();

        for(int i = 0; i < targetList.length; i++){
            targetMap.put(targetList[i],targetList[i]);
        }

        for(int i = 0; i < searchList.length; i++){
            if(targetMap.get(searchList[i]) != null){
                intersection.add(searchList[i]);
            }
        }

        int[] results = new int[intersection.size()];

        for(int i = 0; i < intersection.size(); i++){
            results[i] = intersection.get(i);
        }

        return results;
    }
}

