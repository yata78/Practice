package list;

import java.util.HashMap;
import java.util.Map;

class Solution{
    public static int seachList(int[] numList, int value){
        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int i = 0; i < numList.length; i++){
            hashMap.put(numList[i], i);
        }

        if(hashMap.get(value) != null){
            return hashMap.get(value);
        } else {
            return -1;
        }
    }
}
