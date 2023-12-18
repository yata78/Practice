package list;

import java.util.ArrayList;

class Solution{
    public static int[] evenRange(int a, int b){
        ArrayList<Integer> answerArray = new ArrayList<Integer>();

        for(int i = a; i <= b; i++){
            if (i % 2 == 0){
                answerArray.add(i);
            }
        }

        int[] answer = new int[answerArray.size()];

        for(int i = 0; i < answerArray.size(); i++){
            answer[i] = answerArray.get(i);
        }

        return answer;
    }
}
