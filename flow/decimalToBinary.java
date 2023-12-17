package flow;

class Solution{
    public static String decimalToBinary(int decNumber){
        int currentNumber =decNumber;
        String answer = "";
        while(currentNumber > 0){
            if(currentNumber % 2 == 0){
                answer = "0" + answer;
            } else {
                answer += "1" + answer;
            }
            currentNumber /= 2;
        }

        return answer;
    }
}

