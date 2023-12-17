package flow;

class Solution{
    public static String decimalToHexadecimal(int decNumber){
        //10進数から16進数へ変換する

        //16で割って、商と余りを変換する
        return decimalToHexadecimalHelper(decNumber, "");
    }
    public static String decimalToHexadecimalHelper(int decNumber, String output){
        int currentNumber = decNumber;

        while(currentNumber >= 16){
            output = intToString(currentNumber % 16) + output;
            currentNumber = currentNumber / 16;
        }

        output = intToString(currentNumber) + output;

        return output;

    }

    //10以上の文字を変換する関数
    public static String intToString(int i){
        
        switch (i) {
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
            default:
                return Integer.toString(i);
        }
    }
}

