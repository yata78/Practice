package list;

import java.util.*;

class Solution{
    public static int[] characterLocation(String commands){
        Map<Character,int[]> location = new HashMap<>();

        location.put('N',new int[]{0,1});
        location.put('E',new int[]{1,0});
        location.put('W',new int[]{-1,0});
        location.put('S', new int[]{0,-1});

        int[] d = new int[2];

        for(int i = 0; i < commands.length(); i++){
            if(location.get(commands.charAt(i)) != null){
                d[0] += location.get(commands.charAt(i))[0];
                d[1] += location.get(commands.charAt(i))[1];
            }
        }
        
        return d;
    }
}
