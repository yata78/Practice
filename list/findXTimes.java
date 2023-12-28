package list;

import java.util.*;

class Solution{
    public static boolean findXTimes(String teams){
        Map<Character,Integer> teamsFight = new HashMap<>();

        for(int i = 0; i < teams.length(); i++){
            if(teamsFight.get(teams.charAt(i)) == null){
                teamsFight.put(teams.charAt(i), 1);
            } else {
                teamsFight.replace(teams.charAt(i), teamsFight.get(teams.charAt(i)) + 1);
            }
        }

        int count = teamsFight.get(teams.charAt(0));

        for(int i = 1; i < teams.length(); i++){
            if(teamsFight.get(teams.charAt(i)) != count){
                return false;
            }
        }

        return true;
    }
}
