package list;

import java.util.*;

class Solution{
    public static int[] missingItems(int[] listA, int[] listB){
        Map<Integer,Integer> aMap = new HashMap<>();
        for(int i = 0; i < listB.length; i++){
            aMap.put(listB[i],1);
        }

        ArrayList<Integer> wantLists = new ArrayList<>(); 

        for(int i = 0; i < listA.length; i++){
            if(aMap.get(listA[i]) == null){
                wantLists.add(listA[i]);
            }
        }

        if(wantLists.size() == 0){
            return listA;
        } else {
            int[] results = new int[wantLists.size()];
            for(int i = 0 ; i < results.length; i++){
                results[i] = wantLists.get(i);
            }
            return results;
        }
    }
}
