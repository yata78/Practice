package list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution{
    public static int[] appearTheMost(int[] levels){
        Map<Integer,Integer> levelMap = new HashMap<>();
        int maxLevel = 0;

        for(int i = 0; i < levels.length; i++){
            if(levelMap.get(levels[i]) == null){
                levelMap.put(levels[i], 1);
            } else {
                levelMap.replace(levels[i], levelMap.get(levels[i]) + 1);
                
            }

            if(levelMap.get(levels[i]) > maxLevel){
                maxLevel = levelMap.get(levels[i]);
            }
        }

        ArrayList<Integer> levelList = new ArrayList<>();
        for(int i = 0; i < levels.length; i++){
            if(levelMap.get(levels[i]) == maxLevel && !levelList.contains(levels[i])){
                levelList.add(levels[i]);
            }
        }

        int[] answer = new int[levelList.size()];

        for(int i = 0; i < levelList.size(); i++){
            answer[i] = levelList.get(i);
        }

        Arrays.sort(answer);

        return answer;
        
    }
}