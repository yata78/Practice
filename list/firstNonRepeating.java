package list;

import java.util.*;

class Solution{
    public static int firstNonRepeating(String s){
        Map<Character,Integer> norepeatMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(norepeatMap.get(s.charAt(i)) == null){
                norepeatMap.put(s.charAt(i), 1);
            } else {
                //2��ȏ�����Ă���̂�2�ŌŒ�
                norepeatMap.replace(s.charAt(i), 2);
            }
        }

        for(int i = 0; i < s.length(); i++){
            if(norepeatMap.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }
}
