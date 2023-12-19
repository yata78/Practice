package list;

class Solution{
    public static int addEveryOtherElement(int[] intArr){
        int answer = 0;

        for(int i = 0; i < intArr.length; i++){
            if(i % 2 == 0){
                answer += intArr[i];
            }
        }

        return answer;
    }
}

