package list;

import java.util.*;

class Solution{
    public static boolean hasSameType(String user1, String user2){
        Map<Character,Character> user1Map = new HashMap<>();
        Map<Character,Character> user2Map = new HashMap<>();

        if(user1.length() != user2.length()){
            return false;
        }
        
        for(int i = 0; i < user1.length(); i++){
            if(user1Map.get(user1.charAt(i)) == null){
                user1Map.put(user1.charAt(i), user2.charAt(i));
            }
        }

        for(int i = 0; i < user2.length(); i++){
            if(user2Map.get(user2.charAt(i)) == null){
                user2Map.put(user2.charAt(i), user1.charAt(i));
            }
        }

        for(int i = 0; i < user1.length(); i++){
            if(user1Map.get(user1.charAt(i)) != user2.charAt(i)   || user2Map.get(user2.charAt(i)) != user1.charAt(i)){
                return false;
            }
        }

        return true;
    }
}

