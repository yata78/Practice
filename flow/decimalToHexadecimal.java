package flow;

class Solution{
    public static String decimalToHexadecimal(int decNumber){
        //10�i������16�i���֕ϊ�����

        //16�Ŋ����āA���Ɨ]���ϊ�����
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

    //10�ȏ�̕�����ϊ�����֐�
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

