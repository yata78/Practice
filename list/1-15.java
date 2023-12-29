package list;

import java.util.HashMap;

class Main{
    public static boolean existsWithinList(int[] listL, int dataY){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < listL.length; i++){
            hashMap.put(listL[i],listL[i]);
        }

        return ((hashMap.get(dataY) != null) ? true: false);
    }
}
