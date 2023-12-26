package list;

import java.util.ArrayList;
import java.util.HashMap;

class Main{
    public static ArrayList<Integer> listIntersection(int[] targetList, int[] searchList){
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        ArrayList<Integer> results = new ArrayList<>();
        for(int i = 0; i < targetList.length; i++){
            hashmap.put(targetList[i],targetList[i]);
        }

        for(int i = 0; i < searchList.length; i++){
            if(hashmap.get(searchList[i]) != null) {
                results.add(searchList[i]);
            }
        }

        return results;
    }
}
