package list;

import java.util.ArrayList;

class Solution{
    public static char[] generateAlphabet(char firstAlphabet, char secondAlphabet){
        ArrayList<Character> station = new ArrayList<Character>();
        
        char lowerF = Character.toLowerCase(firstAlphabet);
        char lowerS = Character.toLowerCase(secondAlphabet);

        if(lowerF > lowerS){
            char tmp = lowerF;
            lowerF = lowerS;
            lowerS = tmp;
        }



        for(int i = 0 ; i <= lowerS - lowerF; i++){
            station.add((char)(lowerF + i));
        }

        char[] answer = new char[station.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = station.get(i);
        }

        return answer;
    }
}

