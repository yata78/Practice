package list;

import java.util.Arrays;

class Solution{
    public static int[] sortByMaxMin(int[] arr){
        Arrays.sort(arr);
        int[] answer = new int[arr.length];
        int index = 0;
        
        if(arr.length % 2 == 1){
            answer[arr.length-1] = arr[(int)Math.floor(arr.length / 2)];
        }
            for(int i = 0 ; i < arr.length; i+=2){
                answer[i] = arr[arr.length-index-1];
                answer[i + 1] = arr[index];
                index++;
            }

        return answer;
    }
}
